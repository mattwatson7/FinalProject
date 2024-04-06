
public abstract class ID implements Printable{
	protected String type;
    protected String aNumber;
    protected String firstName;
    protected String lastName;
    protected int age;

    public ID(String type, String aNumber, String firstName, String lastName, int age) {
        this.type = type;
        this.aNumber = aNumber;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void print();

    public String getType() {
        return this.type;
    }

    public String getANumber() {
        return this.aNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setType(String type) {
    	this.type = type;
    }
    public void setANumber(String aNumber) {
    	this.aNumber = aNumber;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
}
