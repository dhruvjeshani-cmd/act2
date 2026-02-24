// ================= ABSTRACT CLASS 2 =================
abstract class Staff extends Person {

    // constructor using super
    Staff(String name) {
        super(name);
    }

    // abstract method
    abstract void work();
}