public class HelloWorld {
   
    public void talk() {
        System.out.println("Hello");
    }

 
    public void talk(String name) {
        System.out.println("Hello " + name);
    }

    // Main method for testing
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.talk();
        greeter.talk("Alice");
    }
}
