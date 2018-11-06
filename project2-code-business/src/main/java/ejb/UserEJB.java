package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;

import data.User;

/**
 * Session Bean implementation class UserEJB
 */
@Stateless
@LocalBean
public class UserEJB implements UserEJBRemote {
	
	@PersistenceContext
    EntityManager em;

    /**
     * Default constructor. 
     */
    public UserEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public String createAccount(String firstName, String lastName, String email, String password, int creditcard)
    {
        try {
            Query newQuery = em.createQuery("FROM User user where user.email=?1");
            newQuery.setParameter(1, email);
            User user = (User) newQuery.getSingleResult();
            if (user != null) {
                return "Email already in use!";
            }
        } catch (NoResultException NRE) {
            try {
                User newUser = new User(firstName,lastName, email, password, creditcard);
                em.persist(newUser);
                return "Success";
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error creating user.");
                return "Error creating a new user!";
            }
        }
        return "Error creating a new user!";
    }


}
