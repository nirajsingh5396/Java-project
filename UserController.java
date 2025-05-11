import java.util.List;

public class UserController {
    UserService userService = null;
     UserController(){
        this.userService = new UserService();
        this.getUsers("List User");
        this.addUser();
        this.deletUser();
    }

    void getUsers(String param){
        List<User> users = this.userService.getUsers();
        System.err.println(param + users);
    }

    void addUser(){
       User user = new User(10, "newUser");
       this.userService.addUser(user);
       this.getUsers("Added User");
    }

    void deletUser(){
        boolean isUser = this.userService.deletUser(10);
        System.out.println(isUser);
        if(isUser) this.getUsers("Delete op");

    }
}
