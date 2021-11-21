package Entities.concretes;

import Entities.abstracts.Entitiy;

public class User extends Entitiy {
    private String name;
    private String lastname;
    private String email;
    private String password;
    private boolean verify;

    public User(String name, String lastname, String email, String password, boolean verify) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.verify = verify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVerify() {
        return verify;
    }

    public void setVerify(boolean verify) {
        this.verify = verify;
    }
}
