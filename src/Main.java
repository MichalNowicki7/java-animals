public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();

        System.out.println(dog.getName());
        dog.fetch();

        System.out.println(duck.getName());
        duck.swim();


    }
}
