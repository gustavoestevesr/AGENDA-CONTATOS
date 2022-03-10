package programas;

import java.util.Scanner;

public class Programa {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int opcao;
    int contador=0;
    int tamanho = 2;

    Pessoa[] agenda = new Pessoa[tamanho]; // vetor de 4 posições do tipo Pessoa

    do {
      limparTela();
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Incluir pessoa");
      System.out.println("2 - Listar todos os cadastrados");
      System.out.print("Opção: ");

      opcao = sc.nextInt();
      sc.nextLine(); // Limpa o ENTER q fica na entrada

      /*if (opcao == 1) {
        
      } else {
        
      }*/

      switch (opcao) {
        case 1:
          
          if ( contador < tamanho ) { // tem espaço na lista
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Sobrenome: ");
            String sobrenome = sc.nextLine();
            System.out.print("Telefone: ");
            String telefone = sc.nextLine(); 

            Pessoa p = new Pessoa(nome, sobrenome, telefone); // construtor         

            agenda[contador] = p; // salva uma pessoa generica na lista incrementada

            contador++; // incrementa uma pessoa na contagem
          } else { // não tem espaço na lista
            System.out.println("### lista cheia ###");
          }

          sc.nextLine(); // espera-se um enter para continuar
          break;
        
        case 2:
          
          limparTela();
          if ( contador == 0 ) { // lista vazia
            System.out.println("### Lista vazia ###");
          } else { // lista com itens
            System.out.println("### Listagem de pessoas ###");
            for (int i = 0; i < contador; i++) {
              agenda[i].getInfo(); // método para pegar as info de cada pessoa
            }
          }

          sc.nextLine(); // espera-se um enter para continuar
          break;
      
        default:
          System.out.println("Opção inválida");
          break;
      }


    } while (opcao != 0);

    sc.close();
  }

  public static void limparTela() { // método para limpar a tela, pula linha 20 vezes
    for (int i = 0; i < 20; i++) {
      System.out.println();
    }
  }

}