/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecapt1;
/**
 *
 * @author bolad
 */
public class Venda extends Executavel
{
    double valorVenda;
    String nomeProprietario;
    String dataVenda;
    
    public Venda(String dataVenda, String nomeProprietario, double valorVenda) 
    {
        this.dataVenda = dataVenda;
        this.nomeProprietario = nomeProprietario;
        this.valorVenda = valorVenda;
    }
    
    public void CalculaValor() 
    {
        double valorCapa = valorVenda * 0.15;
        double valorDireitosAutorais = valorVenda * 0.35;
        double valorLogistica = valorVenda * 0.10;
        double valorImpostos = valorVenda * 0.08;
        double valorLucro = valorVenda * 0.32;

        double valorFinal = valorVenda + valorCapa + valorDireitosAutorais + valorLogistica + valorImpostos + valorLucro;
        
        System.out.println("Valor da capa: " + valorCapa);
        System.out.println("Valor dos direitos autorais: " + valorDireitosAutorais);
        System.out.println("Valor da logística: " + valorLogistica);
        System.out.println("Valor dos impostos: " + valorImpostos);
        System.out.println("Valor do lucro: " + valorLucro);
        System.out.println("Valor final da venda: " + valorFinal);
        System.out.println("\nData de compra: " + this.dataVenda + "\nProprietario: " + this.nomeProprietario + "\nValor total: " + valorFinal);
    }
    
    public void ImprimeDados()
    {
        System.out.println("\nNome do proprietário: " + this.nomeProprietario + "\nData de venda: " + this.dataVenda + 
                "\nValor da venda: " + this.valorVenda);
    }
}
