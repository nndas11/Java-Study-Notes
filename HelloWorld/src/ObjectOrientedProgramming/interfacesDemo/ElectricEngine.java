package ObjectOrientedProgramming.interfacesDemo;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");
    }
}
