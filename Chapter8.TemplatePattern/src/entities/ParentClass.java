package entities;

public abstract class ParentClass {

    public final void templateMethod() {
        step1();
        step2();
        hook();
    }

    public abstract void step1();

    public abstract void step2();

    public void hook() {
        System.out.println("[HOOK] This is the default hook, defined in the abstract ParentClass");
    }

}
