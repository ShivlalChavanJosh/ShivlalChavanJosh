// Base class Person
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
}

// Derived class Student
class Student extends Person {
    
    private int rollNo;
    private String course;
    private String department;

    
    public Student(String name, int age, int rollNo, String course, String department) {
        super(name, age); // Call the constructor of Person
        this.rollNo = rollNo;
        this.course = course;
        this.department = department;
    }

   
    public int getRollNo() {
        return rollNo;
    }

  
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    
    public String getCourse() {
        return course;
    }

   
    public void setCourse(String course) {
        this.course = course;
    }

    
    public String getDepartment() {
        return department;
    }

    
    public void setDepartment(String department) {
        this.department = department;
    }
}

// Derived class Teacher
class Teacher extends Person {
    
    private String department;
    private String specialization;

   
    public Teacher(String name, int age, String department, String specialization) {
        super(name, age); // Call the constructor of Person
        this.department = department;
        this.specialization = specialization;
    }

   
    public String getDepartment() {
        return department;
    }

   
    public void setDepartment(String department) {
        this.department = department;
    }

    
    public String getSpecialization() {
        return specialization;
    }

    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

// Main method for testing
public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("Alice", 20, 123, "Computer Science", "Engineering");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Roll No: " + student.getRollNo());
        System.out.println("Student Course: " + student.getCourse());
        System.out.println("Student Department: " + student.getDepartment());
        
       
        Teacher teacher = new Teacher("Bob", 45, "Mathematics", "Algebra");
        System.out.println("Teacher Name: " + teacher.getName());
        System.out.println("Teacher Age: " + teacher.getAge());
        System.out.println("Teacher Department: " + teacher.getDepartment());
        System.out.println("Teacher Specialization: " + teacher.getSpecialization());
    }
}
