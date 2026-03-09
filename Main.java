// Importa a classe Scanner para ler entrada do usuário
import java.util.Scanner;

// Classe principal que contém o método main para executar o programa
public class Main {
    
    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entrada do console
        Scanner sc = new Scanner(System.in);
        // Cria uma instância da classe Biblioteca para gerenciar livros e usuários
        Biblioteca biblioteca = new Biblioteca();
        // Loop infinito para manter o menu ativo até o usuário escolher sair
        while(true){
            // Exibe o menu de boas-vindas e opções
            System.out.println("--Bem Vindo A Biblioteca--");
            System.out.println("--Escolha Uma Opção--\n 1 - Cadastrar Livros\n 2 - Cadastrar Usuários\n 3 - Listar livros\n 4 - Listar Usuários\n 5 - Emprestar livros\n 6 - Devolver livros\n0 - Sair");
            // Lê a opção escolhida pelo usuário
            int opcao = sc.nextInt();
            // Estrutura switch para tratar cada opção do menu
            switch(opcao){
                case 1: // Opção para cadastrar livro
                    System.out.println("Titulo"); // Solicita o título
                    sc.nextLine(); // Consome a quebra de linha pendente
                    String titulo = sc.nextLine(); // Lê o título
                    
                    System.out.println("Autor"); // Solicita o autor
                    String autor = sc.nextLine(); // Lê o autor
                    biblioteca.cadastrarLivro(titulo,autor); // Cadastra o livro na biblioteca
                    break;
                case 2: // Opção para cadastrar usuário
                    System.out.println("Nome"); // Solicita o nome
                    sc.nextLine(); // Consome quebra de linha
                    String nome = sc.nextLine(); // Lê o nome
                    System.out.println("Matricula"); // Solicita a matrícula
                    int rm = sc.nextInt(); // Lê a matrícula (inteiro)
                    biblioteca.cadastrarUsuario(nome,rm); // Cadastra o usuário
                    break;
                case 3: // Opção para listar livros
                    biblioteca.listarLivros(); // Chama o método para listar livros
                    break;
                    
                case 4: // Opção para listar usuários
                    biblioteca.listarUsuarios(); // Chama o método para listar usuários
                    break;
                case 5: // Opção para emprestar livro
                    System.out.println("digite o titulo do livro"); // Solicita o título
                    sc.nextLine(); // Consome quebra de linha
                    String tituloEmprestimo = sc.nextLine(); // Lê o título
                    biblioteca.emprestarLivro(tituloEmprestimo); // Empresta o livro
                    break;
                case 6: // Opção para devolver livro
                    System.out.println("digite o titulo do livro"); // Solicita o título
                    sc.nextLine(); // Consome quebra de linha
                    String tituloDevolver = sc.nextLine(); // Lê o título
                    biblioteca.devolverLivro(tituloDevolver); // Devolve o livro
                    break;          
                case 0: // Opção para sair
                    System.out.println("Saindo.."); // Mensagem de saída
                    System.exit(0); // Encerra o programa
                    break;
                    
                default: // Opção inválida
                    System.out.println("Opção Inválida"); // Informa erro
                    System.exit(0); // Encerra
                    break;
            }
        
        
        }      
        
        
        
        
    }
    
}