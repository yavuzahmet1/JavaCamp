package DataAccess.concretes;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HiberNetUserDao implements UserDao {
    List<User>users=new ArrayList<>();
    @Override
    public void register(User user) {
        System.out.println(user.getName()+" İsimli kullanıcı başarılı bir şekilde kayıt olmuştur.");
        users.add(user);
    }

    @Override
    public void login(User user) {
        System.out.println(user.getName()+" adlı kullanıcı giriş yaptı");
    }

    @Override
    public void confirm(User user) {
        System.out.println(user.getName()+" kullanıcı girişiniz onaylanmıştır.");
        user.setVerify(true);
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }
}
