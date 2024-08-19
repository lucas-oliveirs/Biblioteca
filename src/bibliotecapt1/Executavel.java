/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecapt1;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Executavel 
{   
    public static void main(String[] args) 
    {
         Livro1 Livro1  = new Livro1("Viagens na Minha Terra", "9788481915754", "Almeida Garrett", "Typ. Gazeta dos Tribunais", "Ficção", "1846");
        Venda Venda = new Venda("01/01/2023", "Lucas", 15.00);
        Aluguel Aluguel = new Aluguel("José", 20, 01, 04, 2023);
        
        int escolha, opcaodados = 0;
        do
        {
            System.out.println("\n\n*******BIBLIOTECA*******\n\n");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Imprimir dados do Livro");
            System.out.println("2 - Tempo de publicação");
            System.out.println("3 - Compra de livro");
            System.out.println("4 - Imprime dados");
            System.out.println("5 - Valor de locação");
            System.out.println("6 - Devolver livro");
            System.out.println("0 - Encerrar o programa");
            System.out.print("\nSua escolha: ");
            escolha = leitor.nextInt();
            
            switch(escolha)
            {
                case 0:
                    System.out.println("\nEncerrando...");
                    break;
                    
                case 1:
                    Livro1.ImprimeDados();                   
                    break;
                    
                case 2:
                    Livro1.TempoPublicacao(2023);
                    break;
                    
                case 3:
                Venda.CalculaValor();
                    break;
                    
                case 4:
                    System.out.println("Imprimir dados\n"
                            + "1 - Dados da venda"
                            + "\n2 - Dados da locação");
                    System.out.print("Escolha uma opção: ");
                    opcaodados = leitor.nextInt();
                    
                switch (opcaodados) 
                {
                    case 1:
                        Venda.ImprimeDados();
                        break;
                    case 2:
                        Aluguel.ImprimeDados();
                        break;
                    default:
                        System.out.println("Escolha inválida");
                        break;
                }
                    break;

                    
                case 5:
                    Aluguel.ValorLocacao();
                    break;
                    
                case 6:
                    Aluguel.Devolucao();
                    break;
                    
                default:
                    System.out.println("Escolha inválida");
                    
            }
        } while (escolha != 0);
    }    
}
