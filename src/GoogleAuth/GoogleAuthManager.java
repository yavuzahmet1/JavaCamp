package GoogleAuth;

import Entities.concretes.User;

public class GoogleAuthManager {
    public void register(User user) {
        System.out.println("Sayın " + user.getName() + " " + user.getLastname() + "");
    }

    public void login(User user) {
        System.out.println("Sayın " + user.getName() + " " + user.getLastname() + "");
    }
}
