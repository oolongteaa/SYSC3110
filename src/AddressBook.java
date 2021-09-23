import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> book = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy){
        boolean equal = false;
        for (int i=0; i<book.size(); i++) {
            if (book.get(i).equals(buddy)){
                equal = true;
            }
        }
        if (equal){
            System.out.println("This buddy already exists");
        }
        else{
            book.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy){
        book.remove(buddy);
    }

    public void removeAllBuddies(){
        book.clear();
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Bob", "10 Hollywood Avenue", "1234567890");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("test");
    }
}
