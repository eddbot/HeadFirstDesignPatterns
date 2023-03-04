public class Main {
    public static void main(String[] args) {
        
        // Example to show that both variables point to the same object
        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        System.out.println(singletonClass.hashCode());
        SingletonClass singletonClass2 = SingletonClass.getSingletonClass();
        System.out.println(singletonClass2.hashCode());

        singletonClass.helloWorld();

        // Example using an enum to do the same thing
        SingletonEnum singletonEnum = SingletonEnum.UNIQUE_INSTANCE;
        System.out.println(singletonEnum.hashCode());
        SingletonEnum singletonEnum2 = SingletonEnum.UNIQUE_INSTANCE;
        System.out.println(singletonEnum2.hashCode());

        singletonEnum.helloWorld();
    }
}