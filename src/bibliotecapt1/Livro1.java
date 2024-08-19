/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecapt1;

/**
 *
 * @author Aluno
 */
public abstract class Livro1
{
    String titulo, isbn, autor, editora, genero, ano_publicacao;
    
    public Livro1(String titulo, String isbn, String autor, String editora, String genero, String ano_publicacao)
    {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.ano_publicacao = ano_publicacao;
    }
    
    public void ImprimeDados() 
    {
        System.out.println("\nTítulo: " + this.titulo + "\nAutor: " + this.autor + "\nGenero: " + this.genero + "\nAno de publicação: " + this.ano_publicacao); 
    }
    
    public void TempoPublicacao(int anoatual)
    {
        int Tempodepublicacao;
        Tempodepublicacao = anoatual - Integer.parseInt(this.ano_publicacao);
        System.out.println("\nO livro " + this.titulo + " foi publicado há " + Tempodepublicacao + " anos atrás.");
    }
}
