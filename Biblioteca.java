import java.util.ArrayList;

public class Biblioteca {
    // Listas para armazenar os livros e usuários cadastrados
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public void cadastrarLivro(String titulo, String autor){ //metodo para cadastrar livro
        // Cria um novo objeto Livro com os dados fornecidos
        Livro novoLivro = new Livro(titulo,autor);
        // Adiciona o livro à lista de livros
        livros.add(novoLivro);
    }
    
    // Método para listar todos os livros cadastrados
    public void listarLivros(){
        // Percorre a lista de livros
        for (Livro l : livros){ //laço for-each
            // Chama o método info() do livro para exibir suas informações
            l.info();
            System.out.println("--------"); //linha para separar
        }
    }
    
    // Método para emprestar um livro pelo título
    public void emprestarLivro(String titulo){
        // Percorre a lista de livros
        for (Livro l : livros){ //laço for-each
            // Verifica se o título do livro atual corresponde ao procurado
            if(l.titulo.equals(titulo)){
                // Se o livro não estiver emprestado, empresta
                if(!l.emprestado){
                    l.emprestar(); // Marca como emprestado
                    System.out.println("Livro emprestado");
                } else {
                    // Se já estiver emprestado, informa
                    System.out.println("Livro ja esta emprestado");
                }
                return; // Sai do método após encontrar o livro
            }
        }
        // Se não encontrou o livro, informa
        System.out.println("Livro nao encontrado");
    }
    
    // Método para devolver um livro pelo título
    public void devolverLivro(String titulo){
        // Percorre a lista de livros
        for (Livro l : livros){
            // Verifica se o título corresponde
            if(l.titulo.equals(titulo)){
                // Se estiver emprestado, devolve
                if(l.emprestado){
                    l.devolver(); // Marca como não emprestado
                    System.out.println("Livro devolvido");
                } else {
                    // Se não estiver emprestado, informa
                    System.out.println("Livro nao emprestado");
                }
                return; // Sai do método
            }
        }
        // Se não encontrou, informa
        System.out.println("Livro nao encontrado");
    }
    
    // Método para cadastrar um novo usuário
    public void cadastrarUsuario(String nome,int rm){
        // Cria um novo objeto Usuario
        Usuario novoUsuario = new Usuario(nome,rm);
        // Adiciona à lista de usuários
        usuarios.add(novoUsuario);
    }
    
    // Método para listar todos os usuários cadastrados
    public void listarUsuarios(){
        // Percorre a lista de usuários
        for (Usuario U : usuarios){
            // Chama o método info() do usuário
            U.info();
            // linha para separar
            System.out.println("-----");
        }
    }
}
