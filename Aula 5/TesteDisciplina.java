import javax.swing.JOptionPane;

public class TesteDisciplina {
   public static void main (String[] args) {
      String nome = JOptionPane.showInputDialog("Digite o nome da disciplina:");
      String professor = JOptionPane.showInputDialog("Digite o nome do professor:");
      int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre:"));
      
      Disciplina disciplina1 = new Disciplina (nome, professor, semestre);
      
      JOptionPane.showMessageDialog(null, "Disciplina: " + disciplina1.getNome() + "\nProfessor: " 
                                          + disciplina1.getProfessor() + "\nSemestre: " + disciplina1.getSemestre() );
   }
}