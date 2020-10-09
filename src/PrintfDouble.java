// Importando a classe Locale do JDK.
import java.util.Locale;

public class PrintfDouble {

    public static void main(String[] args) {

        double numero = 10.35784;
        System.out.println("Imprimindo o número com vírgula:");
        // Vamos imprimir o número de classe double formatado em 2 casas decimais
        System.out.printf("%.2f%n", numero);
        // Vamos imprimir o número de classe double formatado em 4 casas decimais
        System.out.printf("%.4f%n", numero);
        // Configurar o print para delimitar o número com ponto e não vírgula. Tirando do Português e configurando em Ingles US.
        Locale.setDefault(Locale.US);
        System.out.println("Imprimindo o número com ponto:");
        // Imprimindo com 2 casas decimais e ponto ao invés de vírgula.
        System.out.printf("%.2f%n", numero);
        // Imprimindo com 4 casas decimais e ponto ao invés de vírgula.
        System.out.printf("%.4f%n", numero);
    }
}