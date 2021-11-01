import java.util.ArrayList;

public class Person {
    private ArrayList<Integer> basket;
    private void FillBasket(){
        int size = (int) (Math.random()*5 + 2);
        basket = new ArrayList<Integer>();
        for(int i=0; i<size; i++){
            int dice = (int)(Math.random()*3 + 1);
            basket.add(dice);
        }
    }
    ArrayList<Integer> getBasket(){
        return basket;
    }
    public Person() {
        FillBasket();
    }
}
