public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass() {}

    public synchronized static SingletonClass getSingletonClass() {
        if(singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public void helloWorld(){
        System.out.println("hello from the Class");
    }
}
