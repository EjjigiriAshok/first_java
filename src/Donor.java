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
}