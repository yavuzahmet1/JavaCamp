package Business.concretes;

import Business.abstracts.UserService;
import Core.AuthService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    private UserDao userDao;
    private AuthService authService;

    public UserManager(UserDao userDao, AuthService authService) {
        this.userDao = userDao;
        this.authService = authService;
    }

    @Override
    public void register(User user) {
        if (user.getPassword().length() <= 6) {
            System.out.println("Şifre en az 6 karakterden oluşmalıdır.");
        }
        final String EMAIL_PATTERN = "[A-Za-z0-9+_.-]+@(.+)$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(user.getEmail());
        if (!matcher.matches()) {
            System.out.println(user.getEmail() + " bu e-posta, e-posta formatına uygun değildir.");
        }
        for (User users : userDao.getAll()) {
            if (users.getEmail().equals(user.getEmail())) {
                System.out.println(user.getEmail() + " bu e-posta adresi sistemde mevcut değildir.");
            }
        }
        if (user.getName().length() < 2 && user.getLastname().length() < 2) {
            System.out.println("Ad ve soyad en az 2 karakterden oluşturulmalıdır.");
        }
    }

    @Override
    public void login(User user) {
        if (user.isVerify() == true) {
            userDao.login(user);
        } else {
            System.out.println("Giriş başarısız. E-Mail adresinizi kontrol ediniz.");
        }
    }

    @Override
    public void confirm(User user) {
        if (user.isVerify() == true) {
            userDao.confirm(user);
            System.out.println("Sayın " + user.getName() + " " + user.getLastname() + " e-posta adresiniz doğrulanmıştır.");
        } else {
            System.out.println("Sayın " + user.getName() + " " + user.getLastname() + " e-posta adresiniz doğrulanmamıştır.");
        }
    }

    @Override
    public void registerWithAccount(User user) {
        user.setVerify(true);
        this.authService.register(user);
    }

    @Override
    public void loginWithAccount(User user) {
        if (user.isVerify() == true) {
            this.authService.login(user);
        } else {
            System.out.println("Henüz kayıt olmamış.");
        }

    }
}
