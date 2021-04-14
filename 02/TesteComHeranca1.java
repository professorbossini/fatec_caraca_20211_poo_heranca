public class TesteComHeranca1 {
  public static void main(String[] args) {
    AlunoDeGraduacao aluno = new AlunoDeGraduacao();
    aluno.setNome("Ana");
    aluno.idade = 19;
    System.out.printf("Nome: %s, Idade: %d\n", aluno.nome, aluno.idade);
  }
}
