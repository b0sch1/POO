public class Turma {
   private String nome;
   private String curso;
   private int alunos;
   private int serie;
   
   public Turma (String nome, String curso, int alunos, int serie) {
      this.nome = nome;
      this.curso = curso;
      this.alunos = alunos;
      this.serie = serie;
   }
   public String getNome() {
      return this.nome;
   }
   public String getCurso() {
      return this.curso;
   }
   public int getAlunos() {
      return this.alunos;
   }
   public int getSerie() {
      return this.serie;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public void setCurso(String curso) {
      this.curso = curso;
   }
   public void setAlunos(int alunos) {
      this.alunos = alunos;
   }
   public void setSerie(int serie) {
      this.serie = serie;
   }
   
}