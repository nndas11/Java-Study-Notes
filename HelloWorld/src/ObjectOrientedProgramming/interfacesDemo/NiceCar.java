package ObjectOrientedProgramming.interfacesDemo;

public class NiceCar {
   private Engine engine;
   private Media media;


   public NiceCar(){
       this.engine = new PowerEngine();
       this.media = new CDPlayer();
   }

   public NiceCar(Engine engine, Media media){
       this.engine = engine;
       this.media = media;
   }

   public void start(){
       engine.start();
   }

   public void stop(){
       engine.stop();
   }

   public void mediaStart(){
       media.start();
   }

   public void mediaStop(){
       media.stop();
   }
}
