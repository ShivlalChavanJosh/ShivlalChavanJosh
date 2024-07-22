class Sender {
    public void send(String message) {
        System.out.println("Sending: " + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(message + " sent");
    }
}

class ThreadedSend extends Thread {
    private String message;
    private Sender sender;

  
    public ThreadedSend(String message, Sender sender) {
        this.message = message;
        this.sender = sender;
    }
  
    public void run() {
        synchronized (sender) {
            sender.send(message);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Sender sender = new Sender();

        ThreadedSend sendHi = new ThreadedSend("Hi", sender);
        ThreadedSend sendBye = new ThreadedSend("Bye", sender);

       
        sendHi.start();
        try {
            sendHi.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        sendBye.start();
    }
}
