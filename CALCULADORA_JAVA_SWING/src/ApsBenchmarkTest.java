import java.util.List;
import java.util.ArrayList;

public class ApsBenchmarkTest {

    public static boolean isPrimeForcaBruta(long n) {

        if (n <= 1) {
        return false;
        }

        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
            return false;
            }
        }

        return true;
    }

    public static boolean isPrimeOtimizado(long n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static List<Long> gerarPrimosComCrivo(int n) {
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Long> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primos.add((long) i);
            }
        }

        return primos;
    }

    public static void main(String[] args) {
        final long N_PRIMO_TESTE = 1000003L;
        final long N_COMPOSTO_TESTE = 1000000L;
        final int N_CRIVO_LIMITE = 1000000;
        long start, end, durationNs;

        System.out.println("--- INICIANDO BENCHMARKS PARA APS ---");

        System.out.println("\n[1] FORÇA BRUTA (O(n)) - Primo");
        start = System.nanoTime();
        boolean resultBrutaPrimo = isPrimeForcaBruta(N_PRIMO_TESTE);
        end = System.nanoTime();
        durationNs = end - start;
        System.out.println("N = " + N_PRIMO_TESTE + " | Resultado: " + resultBrutaPrimo + " | Tempo: " + durationNs + " ns ");

       System.out.println("\n[2] FORÇA BRUTA (O(n)) - Composto (Melhor Caso)");
        start = System.nanoTime();
        // CORRIGIDO: Deve ser testado com N_COMPOSTO_TESTE e o resultado deve ser salvo em uma nova variável
        boolean resultBrutaComposto = isPrimeForcaBruta(N_COMPOSTO_TESTE); 
        end = System.nanoTime();
        durationNs = end - start;
        System.out.println("N = " + N_COMPOSTO_TESTE + " | Resultado: " + resultBrutaComposto + " | Tempo: " + durationNs + " ns");

        System.out.println("\n[3] OTIMIZADO (O(sqrt(n))) - Primo (Pior Caso)");
        start = System.nanoTime();
        boolean resultOtimizadoPrimo = isPrimeOtimizado(N_PRIMO_TESTE);
        end = System.nanoTime();
        durationNs = end - start;
        System.out.println("N = " + N_PRIMO_TESTE + " | Resultado: " + resultOtimizadoPrimo + " | Tempo: " + durationNs + " ns");

        System.out.println("\n[4] OTIMIZADO (O(sqrt(n))) - Composto (Melhor Caso)");
        start = System.nanoTime();
        boolean resultOtimizadoComposto = isPrimeOtimizado(N_COMPOSTO_TESTE);
        end = System.nanoTime();
        durationNs = end - start;
        System.out.println("N = " + N_COMPOSTO_TESTE + " | Resultado: " + resultOtimizadoComposto + " | Tempo: " + durationNs + " ns");

        System.out.println("\n[5] CRIVO DE ERATÓSTENES (O(n log log n)) - Geração até " + N_CRIVO_LIMITE);
        start = System.nanoTime();
        List<Long> primosCrivo = gerarPrimosComCrivo(N_CRIVO_LIMITE);
        end = System.nanoTime();
        durationNs = end - start;
        System.out.println("Primos encontrados: " + primosCrivo.size() + " | Tempo: " + durationNs + " ns");
        
        System.out.println("\n--- FIM DOS BENCHMARKS ---");        
    }
    
}
