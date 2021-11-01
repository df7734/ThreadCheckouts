import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Checkout extends Thread {
     private ArrayList<Person> checkoutQueue;

    Checkout(String name, ArrayList<Person> checkoutQueue) {
        super(name);
        this.checkoutQueue = checkoutQueue;
    }

    public void run() {
        System.out.printf(getTime() + " __%s started\n", Thread.currentThread().getName());
        checkoutLogic();
        System.out.printf(getTime() + " __%s finished\n", Thread.currentThread().getName());
    }

    public String getTime(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return formatter.format(date);
    }

    public void checkoutLogic() {

        for(int person=0; person<checkoutQueue.size(); person++){
            System.out.println(getTime() + " _Start serving customer №" + (person+1) + " on " + this.getName());
            ArrayList<Integer> basket = checkoutQueue.get(person).getBasket();
            for (Integer integer : basket) {
                try {
                    sleep (integer *1000);//
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
                if (integer == 1) {

                    System.out.println(getTime() + " Product A of Customer " + (person+1) + " on " + this.getName());
                } else if (integer == 2) {

                    System.out.println(getTime() + " Product B of Customer " + (person+1) + " on " + this.getName());
                } else if (integer == 3) {
                    System.out.println(getTime() + " Product C of Customer " + (person+1) + " on " + this.getName());
                }
            }
            System.out.println(getTime() + " _Stop serving customer №" + (person+1) + " on " + this.getName());
        }
    }
}
