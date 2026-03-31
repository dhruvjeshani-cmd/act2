class Patient extends Person implements Schedulable {
    Patient(String name) {
        super(name);
    }

    @Override
    public void schedule() {
        System.out.println("Patient Name: " + name);
        System.out.println("Appointment scheduled successfully");
    }
}