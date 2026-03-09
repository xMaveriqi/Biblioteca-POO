import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cria uma instância da classe Biblioteca para gerenciar livros e usuários
        Biblioteca biblioteca = new Biblioteca();
        while(true){
            System.out.println("==========Bem Vindo A Biblioteca==========");
            System.out.println("=         Escolha Uma Opção         =\n 1 - Cadastrar Livros\n 2 - Cadastrar Usuários\n 3 - Listar livros\n 4 - Listar Usuários\n 5 - Emprestar livros\n 6 - Devolver livros\n 0 - Sair");
            System.out.println("==========================================");
            System.out.println("Digite uma opção: ");
            int opcao = sc.nextInt();
            switch(opcao){
                case 1: 
                    System.out.println("Titulo"); 
                    sc.nextLine(); //quebra a linha sobrando 
                    String titulo = sc.nextLine(); 
                    
                    System.out.println("Autor");
                    String autor = sc.nextLine();
                    biblioteca.cadastrarLivro(titulo,autor);
                    break;
                case 2:
                    System.out.println("Nome");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println("Matricula");
                    int rm = sc.nextInt();
                    biblioteca.cadastrarUsuario(nome,rm);
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                    
                case 4:
                if()    
                biblioteca.listarUsuarios();
                    break;
                case 5:
                    System.out.println("digite o titulo do livro");
                    sc.nextLine();
                    String tituloEmprestimo = sc.nextLine();
                    biblioteca.emprestarLivro(tituloEmprestimo);
                    break;
                case 6:
                    System.out.println("digite o titulo do livro");
                    sc.nextLine();
                    String tituloDevolver = sc.nextLine();
                    biblioteca.devolverLivro(tituloDevolver);
                    break;          
                case 0:
                    System.out.println("Saindo..");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opção Inválida");
                    System.exit(0);
                    break;
            }
        
        
        }      
        
        
        
        
    }
    
}