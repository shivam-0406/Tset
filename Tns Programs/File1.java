
@FunctionalInterface
interface Sayable {
    String say(String message);
}

class LambdaExample {
    public static void main(String[] args) {
        Sayable sayable = (message) -> "Hello, " + message + "!";
        
        System.out.println(sayable.say("World"));
        System.out.println(sayable.say("Java Programmer"));
        
        Runnable numberPrinter = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        };
        Thread thread = new Thread(numberPrinter);
        thread.start();
    }
}
