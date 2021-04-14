public class MinhaPrimeiraThread extends Thread {
  public void run (){
    System.out.println(Thread.currentThread().getName());
    System.out.println("Executando em uma thread diferente da principal");
  }
}