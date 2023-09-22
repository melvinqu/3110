import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfoArrayList;

    public AddressBook() {
        buddyInfoArrayList = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("tom","carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public void addBuddy(BuddyInfo buddy){
        buddyInfoArrayList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyInfoArrayList.remove(buddy);
    }

}
