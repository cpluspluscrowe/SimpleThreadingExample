public class Example2 implements Runnable{
  private String synchronizeOn;

  public Example2(){
    synchronizeOn = "Don't synchronize on objects whose references will change!";
  }

  @Override
  public void run() {
    // System.out.println(String.format("Trying to enter synchronized block with value: %s",synchronizeOn));
    synchronized (synchronizeOn){
      System.out.println(String.format("Entered synchronized block: %s", synchronizeOn));
      while(true){
        // loop forever
      }
    }
  }

  public static void main(String[] args){
    Example2 example = new Example2();
    new Thread(example).start();
    example.synchronizeOn = "new value -> new reference -> new lock";
    new Thread(example).start();
    example.synchronizeOn = "keep changing!";
    new Thread(example).start();

  }

}
