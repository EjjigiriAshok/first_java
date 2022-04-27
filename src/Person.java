public class Person {
    private String name;
    private  String dateOfBirth;
    private String gender;
    private String mobileNumber;
    private String bloodGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
public class Donor extends Person {

    private String bloodBankName;
    private String donorType;
    private String donationDate;

    public void displayDonationDetails() {
        System.out.println("Donation Details : ");
        System.out.println(this.getDonorType());
        System.out.println(this.getBloodBankName());
        System.out.println(this.getDonationDate());
    }




    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getBloodBankName() {
        return this.bloodBankName;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonorType() {
        return this.donorType;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public String getDonationDate() {
        return this.donationDate;
    }


    public static void main (String[] args) {
        /* code */

        Donor a = new Donor();
        a.setName("Ashok -- Donor");
        System.out.println(a.getName());
    }
}
public class Main
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Donor a = new Donor();
        System.out.println("Enter the name of the donor : ");
        String input = sc.nextLine();
        a.setName(input);

        System.out.println(a.getName());

        a.setDob("11-22-1223");
        a.setMobile("9988877766");
        a.setBloodGroup("A+");
        a.setDonationDate("99-87-8766");

        a.displayDonationDetails();
    }
}
