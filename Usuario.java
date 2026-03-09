
// Classe que representa um usuário da biblioteca
public class Usuario {
    // Atributos da classe Usuario: nome e matrícula (rm)
    String nome;
    int rm;
    
    // Construtor da classe Usuario, inicializa os atributos com os valores passados
    public Usuario(String nome,int rm){
        this.nome = nome;
        this.rm = rm;
    }
    
    // Método para exibir informações do usuário
    public void info(){
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+rm);
        
    }
}