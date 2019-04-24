// Esta classe modela o cliente que irá fazer compras no "emporium".

public class Cliente
{
    // atributos: armazenam os dados de um objeto, após este ser instanciado.
    private String nome;
    private String cpf;
    
    // método construtor: usado para inicializar os atributos,
    // quando um objeto cliente é criado (instanciado). Notar que o construtor
    // faz chamada interna de dois métodos modificadores. 
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // métodos de acesso: usados para retornar o valor de um atributo.
    public String getNome() {
        return nome;
    }
    public String getCpf () {
      return this.cpf;
    }
        
    // métodos modificadores: usados para alterar o valor de um atributo,
    // depois que o objeto foi criado (instanciado).
    public void setNome(String novoNome) {
        nome = novoNome;
    }
    public void setCpf (String cpf) {
       this.cpf = cpf;
    }
    public String getDados()  {
      return "\nNome: " + nome + "\nCPF: " + cpf;
    }
}