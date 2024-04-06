
public class Student extends ID{
	private String degree;

    public Student(String type, String aNumber, String firstName, String lastName, int age, String degree) {
        super(type, aNumber,firstName, lastName, age);
        this.degree = degree;
    }

    @Override
    public void print() {
        System.out.println(type + "," + aNumber + "," + firstName + "," + lastName + "," + age + "," + this.degree);
    }

    public String getDegree() {
        return this.degree;
    }
    public void setDegree(String d) {
    	d = this.degree;
    }
}
