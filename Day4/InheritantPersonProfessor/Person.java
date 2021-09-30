package InheritantPersonProfessor;

public class Person {
    protected String name;
    protected String address;
    protected String birthday;
    public Person() {
    }
    public Person(String name, String address, String birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + ", birthday=" + birthday + "]";
    }
    
}
