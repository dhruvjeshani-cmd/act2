//  CONCRETE CLASS 2 
class Doctor extends Staff {

    // constructor
    Doctor(String name) {
        super(name);
    }

    // overriding abstract method
    void work() {
        System.out.println("" + name + " is treating the patient");
    }
}