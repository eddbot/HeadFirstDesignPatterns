package entities;

public class ChildClass extends ParentClass {
    @Override
    public void step1() {
        System.out.println("[STEP-1] hello from the vanilla child class");

    }

    @Override
    public void step2() {
        System.out.println("[STEP-2] hello from the vanilla child class");
    }

    // We won't overwrite the hook in this class
}
