import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfoArrayList;

    public AddressBook() {
        buddyInfoArrayList = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }

    public void addBuddy(BuddyInfo buddy){
        buddyInfoArrayList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyInfoArrayList.remove(buddy);
    }

}
