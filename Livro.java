
// Classe que representa um livro na biblioteca
public class Livro{
    // Atributos da classe Livro: autor, título e se foi emprestado
    String autor;
    String titulo;
    boolean emprestado;
    
    // Construtor da classe Livro, inicializa os atributos com os valores passados
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false; //o livro não está emprestado
    }
    
    // Método para emprestar o livro, marca como emprestado
    public void emprestar(){
        emprestado = true;
    }
    
    // Método para devolver o livro, marca como não emprestado
    public void devolver(){
        emprestado = false;
    }
    
    // Método para exibir informações do livro
    public void info(){
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Emprestado: "+emprestado);
    }
}    
