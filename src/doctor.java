class Doctor extends Staff {
    Doctor(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Doctor " + name + " is treating the patient");
    }
}