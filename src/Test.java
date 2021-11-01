import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println ( "Main thread started");
        Customers customers = new Customers();
        ArrayList<Checkout> checkouts = new ArrayList<>();
        for (int i = 0; i < 4; i ++) {
            checkouts.add(new Checkout("Checkout " + (i+1), customers.customersList.get(i)));
            checkouts.get(i).start();
        }

        for (int i = 0; i < 4; i ++) {
        try {
            checkouts.get(i).join();
            } catch (InterruptedException e) {
                System.out.printf("%s has been interrupted", checkouts.get(i).getName());
            }
        }
        System.out.println ( "Main thread finished");
    }
}
