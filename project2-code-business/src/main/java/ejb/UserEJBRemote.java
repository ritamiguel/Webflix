package ejb;

import javax.ejb.Remote;

import data.User;

@Remote
public interface UserEJBRemote {

    public String createAccount(String firstName, String lastName, String email, String password, int creditcard);
    public User recognizeUser(String email, String password);

}
