//  MAIN CLASS 
public class HospitalMain {

    public static void main(String[] args) {

        // creating objects
        Patient patient = new Patient("Dhruv");
        Doctor doctor = new Doctor("Dr Jeshani");
        Billing bill = new Billing();

        // calling methods
        patient.schedule();
        doctor.work();
        bill.showBill();
    }
}