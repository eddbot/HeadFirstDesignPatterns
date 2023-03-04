package entities;

public class ChildClassWithHook extends ParentClass {
    @Override
    public void step1() {
        System.out.println("[STEP-1] hello from the child class that has a hook!");
    }

    @Override
    public void step2() {
        System.out.println("[STEP-2] hello from the child class that has a hook!");
    }

    @Override
    public void hook() {
        System.out.println("[HOOK] hello from the child class that has a hook!");
    }
}
