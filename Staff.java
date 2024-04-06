
public class Staff extends ID{
	private int salary;

    public Staff(String type, String aNumber, String firstName, String lastName, int age, int salary) {
        super(type, aNumber, firstName, lastName, age);
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println(type + "," + aNumber + "," + firstName + "," + lastName + "," + age + "," + this.salary);
    }

    public int getSalary() {
        return this.salary;
    }
    
    public void setSalary(int s) {
    	s = this.salary;
    }
}
