// ================= CONCRETE CLASS 1 =================
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