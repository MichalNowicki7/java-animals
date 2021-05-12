public class Dog implements Animal {

    private int jumpHeight;
    private int runSpeed;

    @Override
    public String getVoice() {
        return "Bark";
    }

    @Override
    public String getName() {
        return "Frania";
    }

    @Override
    public double getAge() {
        return 7;
    }
    public void fetch() {
        jumpHeight = 3;
        runSpeed = 8;
        doSomething();
    }

    @Override
    public void doSomething() {
        System.out.println(String.format("Rzucam frisbee. Frania biegnie z prędkością %s i skacze " +
                "na wysokość %d łapiąc frisbee.", runSpeed, jumpHeight));

    }
}
