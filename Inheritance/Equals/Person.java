package Inheritance.Equals;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String id;

    // Costom hash code for comparing hash values
    /*
    // this is default generated hash code we can generate hash code like constructor using reference in vs code
    @Override
    public int hashCode() {
        // super.hashCode(); default value 
        return (int) Math.random()*5;
    }
    */

    // we can make hash and equals like constructor using reference
    @Override
    public int hashCode() {
        return Objects.hash(name,age,id);
    }

    

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // tostring
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
    }

}
