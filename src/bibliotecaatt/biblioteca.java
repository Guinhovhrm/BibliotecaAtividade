package bibliotecaatt;

import java.util.Scanner;

public class biblioteca {
    
    
    
    Scanner sc = new Scanner(System.in);
    private String nomeDoLivro;
    private String autor;
    private int issn;

//    public biblioteca() {
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
        return "O nome do livro é: "+ nomeDoLivro + "\nO Autor é: " + autor + "\nO ISSN é: " + issn;
    }
    
    
    
    
    
    


    
}
