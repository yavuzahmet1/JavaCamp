import AppleAuth.AppleAuthManager;
import Business.abstracts.UserService;
import Business.concretes.UserManager;
import Core.AppleAuthManagerAdapter;
import Core.GoogleAuthManagerAdapter;
import DataAccess.concretes.HiberNetUserDao;
import Entities.abstracts.Entitiy;
import Entities.concretes.User;
import GoogleAuth.GoogleAuthManager;

public class Main {

    public static void main(String[] args) {
        UserService userService=new UserManager(new HiberNetUserDao(),new AppleAuthManagerAdapter(new AppleAuthManager()));
        User user=new User("Ahmet","Yavuz","ahmet.mm@gmail.com","1234578",true);
        User user1=new User("Mehmet","Kaya","mehmet.mm@gmail.com","1234578",true);
        //userService.register(user);
        userService.login(user);
        userService.confirm(user);
        userService.registerWithAccount(user);
        userService.loginWithAccount(user);
    }
}
