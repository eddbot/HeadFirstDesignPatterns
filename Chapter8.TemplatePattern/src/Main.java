import entities.ChildClass;
import entities.ChildClassWithHook;

public class Main {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        ChildClassWithHook childClassWithHook = new ChildClassWithHook();

        childClass.templateMethod();
        /* OUTPUT:
        [STEP-1] hello from the vanilla child class
        [STEP-2] hello from the vanilla child class
        [HOOK] This is the default hook, defined in the abstract ParentClass
        */

        childClassWithHook.templateMethod();
        /* OUTPUT:
        [STEP-1] hello from the child class that has a hook!
        [STEP-2] hello from the child class that has a hook!
        [HOOK] hello from the child class that has a hook!
        */

    }
}