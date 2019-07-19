
public abstract class Employee {
	private String firstName;
	private String lastName;
	private String SIN;
	
	
	public Employee(String firstName, String lastName, String SIN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.SIN = SIN;
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


	public String getSIN() {
		return SIN;
	}


	public void setSIN(String sIN) {
		SIN = sIN;
	}


	@Override
	public String toString() {
		String name = firstName + " " + lastName;
		return name + "\t\t" + SIN;
	}
	
	
}
