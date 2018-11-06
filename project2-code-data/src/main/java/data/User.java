package data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name = "Users")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	@Id
	private String email;
	private String password;
	private int creditcard;
	
	@OneToMany
	private List<Content> watchlist;
	
	
   public User(String firstName, String lastName, String email, String password, int creditcard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.creditcard = creditcard;
    }


	public User() {
		super();
	}
	
	public String getFirstName() {
	return firstName;
}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
	public int getCreditcard() {
		return creditcard;
	}
	
	public void setCreditcard(int creditcard) {
		this.creditcard = creditcard;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", creditcard="
				+ creditcard + "]";
	}

	
}
