import java.util.*;


public class Person {
    // name, Dob, gender, mobile, blood group
    private String name;
    private String dob;
    private String gender;
    private String mobile;
    private String bloodGroup;

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }



    // Getters
    public String getName() {
        return this.name;
    }

    public String getDob() {
        return this.dob;
    }

    public String getGender() {
        return this.gender;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getBloodGroup() {
        return this.bloodGroup;
    }

    public static void main (String[] args) {
        /* code */

        Person a = new Person();
        a.setName("Ashok -- Person");
        System.out.println(a.getName());
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
