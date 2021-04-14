public class MinhaPrimeiraAtividade implements Runnable  {
  public void run (){
    System.out.println(Thread.currentThread().getName());
    System.out.println("Executando minha primeira atividade com Runnable");
  }
}
