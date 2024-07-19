public class Person {
    private String name;
    private int age;

  
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
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
    
    // Main method for testing
    public static void main(String[] args) {
        Person person = new Person("John Doe", 25);
        
       
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        
       
        person.setName("Jane Doe");
        person.setAge(30);
        
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
