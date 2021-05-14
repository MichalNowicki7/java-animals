package animal;

public class Duck extends AbstractAnimal {

    private int speed;

    public Duck(String voice, String name, double age, int speed) {
        super(voice, name, age);
        this.speed = speed;
    }


    public void doSomething() {
        System.out.println(String.format("Stokrotka płynie przez staw z prędkością %s", speed));
    }
}
    /*public String getVoice() {
        return "Quack";
    }

    public String getName() {
        return "Stokrotka";
    }

    public double getAge() {
        return 3;
    }

    public void swim() {
        doSomething();
    }*/


/*@Override
    public String getVoice() {
        return "Quack";
    }

    @Override
    public String getName() {
        return "Stokrotka";
    }

    @Override
    public double getAge() {
        return 3;
    }
    public void swim() {
        speed = 10;
        doSomething();
    }
    @Override
    public void doSomething() {
        System.out.println(String.format("Stokrotka płynie przez staw z prędkością %s", speed));
    }*/






