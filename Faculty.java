
public class Faculty extends ID{
	private String department;

    public Faculty(String type, String aNumber, String firstName, String lastName, int age, String department) {
        super(type, aNumber, firstName, lastName, age);
        this.department = department;
       
    }

    @Override
    public void print() {
        System.out.println(type + "," + aNumber + "," + firstName + "," + lastName + "," + age + "," + this.department);
    }

    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String d) {
    	d = this.department;
    }
}
