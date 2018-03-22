public class ChangeWhileSynchronized implements Runnable{
  private int value;

  public void setValue(int value){
    this.value = value;
    System.out.println(String.format("Value changed: %d", value));
  }

  @Override
  public void run() {
    synchronized (this){
      value = 5;
      System.out.println(String.format("Value in loop: %d", value));
      while(true){
        // loop forever
      }
    }
  }
}
