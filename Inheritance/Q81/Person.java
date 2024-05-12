
// Create a class person with attribute name,age and id.Ovveride equals() to compare person object


package Inheritance.Q81;

public class Person {
    
    private String name;
    private int age ;
    private String id;

     
    // tostring
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
    }

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getter and setters
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

    //  customised hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    // customised equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

        public static void main(String[] args) {
            
            Person person1 = new Person("Aanirudha", 23, "001");
            Person person2 = new Person("Mayuri", 24 ,"002");

            System.out.println("Person 1 is: "+ person1);
            System.out.println("Person 2 is: " + person2);

            if(person1.equals(person2)){
                System.out.println("Equals to each other");
            }
            else{
                System.out.println("Not equals to each other");
            }
        }
    
    
    
    


}
