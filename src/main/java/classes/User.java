package classes;
import java.util.*;


public class User {
	

	private String username;
    private String password;
    public Set<Prescription> user;
    
    public User() {
    }
    
    public String getUsername() {
    	return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password =  password;
    }


   /* public void createPresciption(String physicianName, String patientName, Date date, ArrayList<Medicine> medicines) {
    	
    }
    */

}