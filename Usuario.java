
public class Usuario {
    String nome;
    int rm;
    
    // Construtor da classe Usuario, inicializa os atributos com os valores passados
    public Usuario(String nome,int rm){
        this.nome = nome;
        this.rm = rm;
    }
    
    public void info(){
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+rm);
        
    }
}