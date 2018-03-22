import java.lang.Thread;

public class Master {
  public static void main(String[] args){
    ChangeWhileSynchronized objectOfInterest = new ChangeWhileSynchronized();
    new Thread(objectOfInterest).start();
    objectOfInterest.setValue(10);
    objectOfInterest.setValue(15);
    objectOfInterest.setValue(20);
  }
}
