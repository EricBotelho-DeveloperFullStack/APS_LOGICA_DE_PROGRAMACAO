
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double mediaPonderada, mediaAritimedia;
        int primeiroNumero, segundoNumero, terceiroNumero, numeroEscolhido = 0;
        int primeiroPeso, segundoPeso, terceiroPeso;

        while(numeroEscolhido != 3) {
            try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }                    
                } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
            }

            System.out.println("----- Menu -----");
            System.out.println("1 - Média Aritimética;");
            System.out.println("2 - Média Ponderada;");
            System.out.println("3 - Sair");
            System.out.println("");
            System.out.print("Qual opção desejada? ");
                numeroEscolhido = sc.nextInt();
            System.out.println("Carregando...");

            try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            try {
                if (System.getProperty("os.name").contains("Windows")) {
                     new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }                    
                } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
            }
            
            switch (numeroEscolhido) {
                case 1:
                try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }

                    System.out.println("");
                    System.out.print("Digite o primeiro número: ");
                        primeiroNumero = sc.nextInt();            

                    System.out.print("Digite o segundo número: ");
                        segundoNumero = sc.nextInt();

                    mediaAritimedia = (primeiroNumero + segundoNumero) / 2;

                    System.out.println("");
                    System.out.println("A média Artitimética de (" + primeiroNumero + " e " + segundoNumero + ") é: " 
                    + String.format("%.2f", mediaAritimedia));
                    System.out.println("Finalizando...");

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }

                break;
                case 2:
                try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }

                    System.out.println("");
                    System.out.print("Digite o primeiro número: ");
                        primeiroNumero = sc.nextInt();
                    System.out.print("Digite o peso do primeiro numero: ");
                        primeiroPeso = sc.nextInt();
                        
                    System.out.print("Digite o segundo número: ");
                        segundoNumero = sc.nextInt();
                    System.out.print("Digite o peso do segundo numero: ");
                        segundoPeso = sc.nextInt();

                    System.out.print("Digite o terceiro número: ");
                        terceiroNumero = sc.nextInt();
                    System.out.print("Digite o peso do terceiro numero: ");
                        terceiroPeso = sc.nextInt();

                    
                        mediaPonderada = ((primeiroNumero * primeiroPeso) + (segundoNumero * segundoPeso) + (terceiroNumero * terceiroPeso)) / (primeiroPeso
                        + segundoPeso + terceiroPeso);
                    
                    System.out.println("");
                    System.out.println("A media Ponderada dos numeros (" + primeiroNumero + ", " + segundoNumero + " e " + terceiroNumero 
                    + ") é: " + String.format("%.2f",mediaPonderada));
                    System.out.println("Finalizando...");

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }

                break;
                case 3:
                    System.out.println("Finalizando Programa...");

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
        
                  try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }

                    System.out.println("");
                    System.out.println("Até Logo!!");
                break;
                default:
                    System.out.println("");
                    System.out.println("Opção Inválida");
                    System.out.println("Retornando ao menu...");

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }
                break;
        }
    }
     sc.close();
    }
          
}