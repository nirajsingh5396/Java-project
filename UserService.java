import java.util.ArrayList;
import java.util.List;

class UserService {
    private List<User> users = new ArrayList<User>();

    public UserService() {
        this.constantUser();
    }

    void constantUser() {
        this.addUser(new User(1, "Niraj"));
        this.addUser(new User(2, "sohan"));
        this.addUser(new User(3, "moahn"));
        this.addUser(new User(4, "Mani"));
    }

    void addUser(User user) {
        this.users.add(user);
    }

    List<User> getUsers() {
        return this.users;
    }

    User updateUser(User user) {
        return user;
    }

    boolean deletUser(int id) {
        User isUser = this.findUserById(id);
        if (isUser == null)
            return false;
        return this.users.remove(isUser);
    }

    User findUserById(int id) {
        return this.users.stream().filter(data -> data.id == id)
                .findFirst()
                .orElse(null);
    }
}
