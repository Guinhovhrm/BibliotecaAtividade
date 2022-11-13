package bibliotecaatt;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaATT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<biblioteca> ListaDLivros = new ArrayList<>();
        biblioteca livros = new biblioteca();
        String cont;
              
        do {

            try {
                System.out.println("Digite o nome do livro: ");              
                livros.setNomeDoLivro(null);

                System.out.println("Digite o nome do autor: ");               
                livros.setAutor(null);

                System.out.println("Digite o ISSN do livro: (apenas numeros)");                
                livros.setIssn(0);

                System.out.println(livros.toString());

            } catch (java.util.InputMismatchException e) {
                System.out.println("Algum erro no cadastro!");
                System.exit(0);
            }

            System.out.println("Deseja adiciona-lo a biblioteca? (S/N)");
            String adicionar = sc.next();

            if (adicionar.equals("S")) {
                ListaDLivros.add(livros);            
                System.out.println("Os livros na biblioteca são: " + livros.getNomeDoLivro());
            } else {
                System.out.println("Livro não adicionado!");
            }

            System.out.println("Deseja adicionar mais algum livro? (S/N)");
            cont = sc.next();

        } while (cont.equals("S"));
              
        System.out.println(ListaDLivros);
        
    }

}
