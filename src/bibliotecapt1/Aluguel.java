/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecapt1;

/**
 *
 * @author Aluno
 */
public class Aluguel extends Livro1
{
    String nomeLocador;
    int diaslocados, dialocacao, meslocacao, anolocacao;
    
    public Aluguel(String nomeLocador, int diaslocados, int dialocacao, int meslocacao, int anolocacao)
    {
        this.nomeLocador = nomeLocador;
        this.diaslocados = diaslocados;
        this.dialocacao = dialocacao;
        this.meslocacao = meslocacao;
        this.anolocacao = anolocacao;
    }
    
    public void ValorLocacao()
    {
        System.out.println("A locação de livro fica por R$ 10,00");
    }
    
    public void Devolucao()
    {
        System.out.println("Livro devolvido com sucesso! Esperamos que tenha gostado.");
    }
    
    
    public void ImprimeDados()
    {
        super.ImprimeConta();
        System.out.println("Nome do locador: " + this.nomeLocador + "\nDias locados: " + this.diaslocados + 
                "\nDia da locação: " + this.dialocacao + "\nMes da locação: " + this.meslocacao + "\nAno da locação: " + this.anolocacao);
    }
}
