
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List list = new List();

    int op;
    do {
      showMenu();
      op = sc.nextInt();

      switch (op) {
        case 1: {
          System.out.println("Digite o valor a ser inserido no início da lista: ");
          Double value = sc.nextDouble(); // le o numero informado
          list.addInitial(value);
          break;
        }
        case 2: {
          System.out.println("Entrei na opção 2");
          System.out.println("Digite o valor a ser inserido no final da lista: ");
          Double value = sc.nextDouble(); // le o numero informado1
          list.addFinal(value);
          break;
        }
        case 3: {
          System.out.println("Entrei na opção 3");
          System.out.println("Digite a posição a ser inserido na lista: ");
          int position = sc.nextInt();
          System.out.println("Digite o valor a ser inserido na lista: ");
          Double value = sc.nextDouble(); // le o numero informado
          list.addPosition(position, value);
          break;
        }
        case 4: {
          System.out.println("Entrei na opção 4");
          System.out.println("Quantidade de nós: " + list.size());
          break;
        }
        case 5: {
          System.out.println(list.toString());
          break;
        }
        case 6: {
          System.out.println("Entrei na opção 6");
          break;
        }
        case 7: {
          System.out.println("Entrei na opção 7");
          break;
        }
        case 8: {
          System.out.println("Entrei na opção 8");
          break;
        }
        case 9: {
          System.out.println("Entrei na opção 9");
          break;
        }
        case 10: {
          System.out.println("Entrei na opção 10");
          break;
        }
        default: {
          System.out.println("Opção inválida!");
        }
      }
    } while (op != 10);

    sc.close();
  }

  public static void showMenu() {
    System.out.println("1 - Inserir no início da lista");
    System.out.println("2 - Inserir no final da lista");
    System.out.println("3 - Inserir na posição N da lista");
    System.out.println("4 - Quantidade de nós (tamanho)");
    System.out.println("5 - Percorrer a lista");
    System.out.println("6 - Pesquisar um nó ou uma posição específica");
    System.out.println("7 - Remover do início da lista");
    System.out.println("8 - Remover do final da lista");
    System.out.println("9 - Remover de qualquer posição");
    System.out.println("10 - Sair");
    System.out.println("Digite a opção desejada: ");
  }

}
