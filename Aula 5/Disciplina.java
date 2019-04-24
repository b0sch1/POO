public class Disciplina {
   private String nome, professor;
   private int semestre;
   private boolean ofertada;
   
   public Disciplina (String nome, String professor, int semestre) {
      this.nome = nome;
      this.professor = professor;
      this.semestre = semestre;
      this.ofertada = false;
   }
   public String getNome() {
      return this.nome;
   }
   public String getProfessor() {
      return this.professor;
   }
   public int getSemestre() {
      return this.semestre;
   }
   
   public void setNome(String nome) {
      this.nome = nome;
   }
   public void setProfessor(String professor) {
      this.professor = professor;
   }
   public void setSemestre(int semestre) {
      this.semestre = semestre;
   }
}