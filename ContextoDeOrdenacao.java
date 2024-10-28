import java.util.List; 
public class ContextoDeOrdenacao {
    private EstrategiaOrdenacao estrategia;

    // Define a estratégia a ser usada
    public void setEstrategia(EstrategiaOrdenacao estrategia) {
        this.estrategia = estrategia;
    }

    // Executa a ordenação com base na estratégia definida
    public void executarOrdenacao(List<Integer> numeros) {
        
        estrategia.ordenar(numeros);
        
    }
}