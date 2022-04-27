import java.util.Scanner;

public class ItemType {
    private String name;
    private Double costPerDay;
    private Double deposit;

    ItemType(){
        this.deposit=34000.50;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

   public void  display(){
        ItemType a = new ItemType();
       System.out.println("item type details");
       System.out.println("Name " +getName());
       System.out.println("cost per day "+getCostPerDay());
       System.out.println("deposit" +getDeposit());
   }

    public static void main(String[] args) {
        ItemType i = new ItemType();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item type name");
        String name = sc.nextLine();
        System.out.println("Enter cost per day");
        Double costPerDay = sc.nextDouble();
        System.out.println("enter the deposit");
        Double deposit = sc.nextDouble();
        ItemType items = new ItemType();
        items.setName(name);
        items.setCostPerDay(costPerDay);
        items.setDeposit(deposit);
        items.display();
    }

}

