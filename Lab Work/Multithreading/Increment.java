class thread extends Thread{
    public void run(){
        try {
            for(int i=1;i<=10;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
}
public class Increment {
    public static void main(String[] args) {
        Thread t1=new Thread(new thread());
        t1.start();
    }
}