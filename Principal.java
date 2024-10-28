import java.util.List;  
import java.util.ArrayList;  
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();

        
        List<Integer> numeros = Arrays.asList(5,4,45,22,34,56);

        
        while (true) {
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Selection Sort");
            System.out.println("3 - Insertion Sort");
            System.out.println("0 - Sair");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Saindo.");
                break;  
            }else if (escolha == 1) {
                contexto.setEstrategia(new OrdenacaoBubbleSort());
                contexto.executarOrdenacao(new ArrayList<>(numeros));
                break;
            }else if (escolha == 2) {
                contexto.setEstrategia(new OrdenacaoSelectionSort());
                contexto.executarOrdenacao(new ArrayList<>(numeros));
                break;
            }else if (escolha == 3) {
                contexto.setEstrategia(new OrdenacaoInsertionSort());
                contexto.executarOrdenacao(new ArrayList<>(numeros));
                break;
            } else {
                System.out.println("Opção não encontrada.");
                
            }

        
    }
}
}

