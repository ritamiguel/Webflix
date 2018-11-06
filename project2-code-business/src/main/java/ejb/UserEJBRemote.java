package ejb;

import javax.ejb.Remote;

@Remote
public interface UserEJBRemote {

    public String createAccount(String firstName, String lastName, String email, String password, int creditcard);
}
