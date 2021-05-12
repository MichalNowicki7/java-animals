public class Duck implements Animal {

    private int speed;

    @Override
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
    }
}





