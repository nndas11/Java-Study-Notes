package ObjectOrientedProgramming.interfacesDemo;

public class Car implements Engine,Brake, Media{

    @Override
    public void brake() {
        System.out.println("BREAKING");
    }

    @Override
    public void start() {
        System.out.println("STARTING");
    }

    @Override
    public void stop() {
        System.out.println("STOPPING");
    }
}
