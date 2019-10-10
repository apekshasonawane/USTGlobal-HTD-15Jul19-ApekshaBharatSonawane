package div.com.encapsulation;

public class Student {

	private int rollNo;
	private String name;
	private String email;
	private String password;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {			//get() is read-only
		return name;
	}
	public void setName(String name) {		//set() is write-only
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {			//password is sensitive so password is write-only
		this.password = password;
	}
	public static void main(String[] args) {
		
	}

}
