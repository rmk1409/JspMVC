package models;

/**
 * Created by Roma on 08.09.2016.
 */
public class LoginBean {
    private String login, password;

    public boolean validate() {
        boolean result;
        if ("admin".equals(password)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
