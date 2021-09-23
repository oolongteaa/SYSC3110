public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
        name = "Unknown";
        address = "Unknown";
        phoneNumber = "Unknown";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof BuddyInfo)){
            return false;
        }
        BuddyInfo buddy = (BuddyInfo) obj;
        if (buddy.getName().equals(name)||buddy.getAddress().equals(address)||buddy.getPhoneNumber().equals(phoneNumber)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Bob","10 Hollywood Avenue", "1234567890");
        System.out.println("Hello "+buddy.getName());
    }

}

