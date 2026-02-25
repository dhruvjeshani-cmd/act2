//  CONCRETE CLASS 3 
class Billing implements Billable {

    // attributes
    int consultationFee = 2000;
    int medicineFee = 1500;

    // implementing interface method
    public void showBill() {

        int total = consultationFee + medicineFee;

        System.out.println("----- BILL DETAILS -----");
        System.out.println("Consultation Fee:  $" + consultationFee);
        System.out.println("Medicine Fee:  $" + medicineFee);
        System.out.println("Total Amount:  $" + total);
        System.out.println("------------------------");
        System.out.println("*terms & conditions apply*");
    }
}