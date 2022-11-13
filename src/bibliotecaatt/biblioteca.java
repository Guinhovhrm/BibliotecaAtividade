package bibliotecaatt;

import java.util.Scanner;

public class biblioteca {
    
    
    
    Scanner sc = new Scanner(System.in);
    private String nomeDoLivro;
    private String autor;
    private int issn;

//    public biblioteca(String nomeDoLivro, String autor, int issn) {
//        this.nomeDoLivro = nomeDoLivro;
//        this.autor = autor;
//        this.issn = issn;
//    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIssn() {
        return issn;
    }

    public void setIssn(int issn) {
        this.issn = issn;
    }

       
    @Override
    public String toString() {
        return "O nome do livro é: "+ nomeDoLivro + " & O Autor é: " + autor + " & O ISSN é: " + issn + "\n";
    }
    
    
    
    
    
    


    
}
