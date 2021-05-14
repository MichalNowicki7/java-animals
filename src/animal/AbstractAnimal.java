package animal;

public abstract class AbstractAnimal implements Animal {
    protected String voice;
    protected String name;
    protected double age;

    public AbstractAnimal(String voice, String name, double age) {
        this.voice = voice;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getVoice() {
        return this.voice;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getAge() {
        return this.age;
    }

    @Override
    public void doSomething() {

    }
}


