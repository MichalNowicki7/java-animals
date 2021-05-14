import animal.Cat;
import animal.Dog;
import animal.Duck;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Bark", "Frania", 7, 3, 8);
        Cat cat = new Cat("Meow", "Lola", 5);
        Duck duck = new Duck("Quack", "Stokrotka", 3, 10);

        System.out.println(dog.getName());
        dog.doSomething();

        System.out.println(duck.getName());
        duck.doSomething();


    }
}
