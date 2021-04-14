public class Teste1 {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    MinhaPrimeiraThread t = new MinhaPrimeiraThread();
    //isso está errado
    //t.run();
    t.start();
  }
}
