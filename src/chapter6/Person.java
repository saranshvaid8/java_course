package chapter6;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    //<editor-fold desc="Constructors">
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(String.format("This is a parameterized Person with value: firstName = %s lastName = %s",firstName,lastName));
    }

    public Person() {
        System.out.println("This is a parameterless Person");
    }

    //</editor-fold>

    //<editor-fold desc="Getter & Setters">
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //</editor-fold>
}
