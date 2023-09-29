import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfoArrayList;

    public AddressBook() {
        buddyInfoArrayList = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("tom","carleton","613");//adding some text
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

    public void addBuddy(BuddyInfo buddy)
    {
        if (buddy!=null){
            buddyInfoArrayList.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index)
    {
        if(index >= 0 && index<buddyInfoArrayList.size()){
            return buddyInfoArrayList.remove(index);
        }
        return null;
    }
    /**
     * new method in branch 1
     *
     * */
}
