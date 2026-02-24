// Hospital Management System
// Dhruv Mansukh Jeshani - 225768

//  ABSTRACT CLASS 1 
abstract class Person {

    // attribute
    String name;

    // constructor
    Person(String name) {
        this.name = name;
    }
}

//  ABSTRACT CLASS 2 
abstract class Staff extends Person {

    // constructor using super
    Staff(String name) {
        super(name);
    }

    // abstract method
    abstract void work();
}

//  INTERFACE 1 
interface Billable {
    void showBill();
}

//  INTERFACE 2 
interface Schedulable {
    void schedule();
}

//  CONCRETE CLASS 1 
class Patient extends Person implements Schedulable {

    // constructor
    Patient(String name) {
        super(name);
    }

    // implementing interface method
    public void schedule() {
        System.out.println("Patient Name: " + name);
        System.out.println("Appointment scheduled successfully");
    }
}

//  CONCRETE CLASS 2 
class Doctor extends Staff {

    // constructor
    Doctor(String name) {
        super(name);
    }

    // overriding abstract method
    void work() {
        System.out.println("Doctor " + name + " is treating the patient");
    }
}

//  CONCRETE CLASS 3 
class Billing implements Billable {

    // attributes
    int consultationFee = 2000;
    int medicineFee = 1500;

    // implementing interface method
    public void showBill() {

        int total = consultationFee + medicineFee;

        System.out.println("----- BILL DETAILS -----");
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Fee: " + medicineFee);
        System.out.println("Total Amount: " + total);
        System.out.println("------------------------");
    }
}

//  MAIN CLASS 
public class HospitalMain {

    public static void main(String[] args) {

        // creating objects
        Patient patient = new Patient("John");
        Doctor doctor = new Doctor("Dr Smith");
        Billing bill = new Billing();

        // calling methods
        patient.schedule();
        doctor.work();
        bill.showBill();
    }
}