
public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	
		
	public SalariedEmployee(String firstName, String lastName, String SIN, double weeklySalary) {
		super(firstName, lastName, SIN);
		
		if(weeklySalary < 0.0)
		{
			throw new IllegalArgumentException("Weekly salary must be greater than 0.0");
		}
		this.weeklySalary = weeklySalary;
		
	}


	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}


	public double earning() {
		return getWeeklySalary();
	}
	@Override
	public String toString() {
		return super.toString() + " " + "Weekly Salary: $" + getWeeklySalary();
	}
	
	
}
