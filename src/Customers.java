import java.util.ArrayList;

class Customers {
    ArrayList<ArrayList<Person>> customersList;
    private ArrayList<Person> FillQueue(){
        ArrayList<Person> queueList = new ArrayList<>();
        int size = (int)(Math.random()*4 + 1);
        for(int i=0; i<size; i++){
            queueList.add(new Person());
        }
        return queueList;
    }
    private ArrayList<ArrayList<Person>> FillCustomersList(){
        ArrayList<ArrayList<Person>> customersList = new ArrayList<>();
        for(int i=0; i<4; i++){
            customersList.add(FillQueue());
        }
        return customersList;
    }

    public ArrayList<ArrayList<Person>> getCustomersList() {
        return customersList;
    }

    public Customers(){
        customersList = FillCustomersList();
    }
}
