

class NumberPrinter implements Runnable{
    public void run(){
        
        for(int i=1; i<= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new NumberPrinter());
        thread.start();
    }
}
