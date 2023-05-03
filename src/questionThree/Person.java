package questionThree;

import java.security.PrivateKey;

public class Person {
    private Address address;
    private String firstName;
    private String LastName;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(Address address, String firstName, String lastName, int age) {
        this.address = address;
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
