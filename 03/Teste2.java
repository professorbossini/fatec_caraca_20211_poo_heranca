public class Teste2 {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    //Thread t = new Thread (new MinhaPrimeiraAtividade());
    //t.start();    
    //classe interna anônima
    /*Thread t = new Thread (new Runnable(){
      public void run() {        
        System.out.println(Thread.currentThread().getName());
        System.out.println("Executando com uma classe interna anonima");
      }
    });*/
    //t.start();
    //expressão Lambda (a partir do Java 8)
    Thread t = new Thread (() -> {
      System.out.println(Thread.currentThread().getName());
      System.out.println("Executando uma atividade com uma Expressão Lambda");
    });
    t.start();
  }
}
