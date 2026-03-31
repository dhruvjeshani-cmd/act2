class Billing implements Billable {
    int consultationFee;
    int medicineFee;

    Billing(int consultationFee, int medicineFee) {
        this.consultationFee = consultationFee;
        this.medicineFee = medicineFee;
    }

    @Override
    public void showBill() {
        int total = consultationFee + medicineFee;
        System.out.println("----- BILL DETAILS -----");
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Fee: " + medicineFee);
        System.out.println("Total Amount: " + total);
        System.out.println("------------------------");
    }
}