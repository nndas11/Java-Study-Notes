package ObjectOrientedProgramming.interfacesDemo;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("MEDIA START");
    }

    @Override
    public void stop() {
        System.out.println("MEDIA STOP");
    }
}
