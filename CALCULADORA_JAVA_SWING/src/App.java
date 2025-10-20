
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class App {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numeroEscolhido = 0;
        int primeiroNumero, segundoNumero, terceiroNumero;
        int operacaoSoma, operacaoSubtrair, operacaoMultiplicar, operacaoPotencia;
        double operacaoDividir, operacaoRaiz;

        while(numeroEscolhido != 3) {
            try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }                    
                } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
            }

            System.out.println("----- Menu -----");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Potencia");
            System.out.println("6 - Raiz");
            System.out.println("7 - Identificação de numero Primo.");
            System.out.println("8 - Sair");
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

                    System.out.print("Digite o primeiro numero: ");
                        primeiroNumero = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                        segundoNumero = sc.nextInt();
                    System.out.println("Obs: Caso não deseje usar um terceiro numero, digite '0' ");
                    System.out.print("Digite o terceiro numero: ");
                        terceiroNumero = sc.nextInt();

                        if (terceiroNumero == 0) {
                            operacaoSoma = primeiroNumero + segundoNumero;
                            
                            System.out.println("A soma do numeros informado é: " + operacaoSoma);
                        }
                        else {
                            operacaoSoma = (primeiroNumero + segundoNumero) + terceiroNumero;

                            System.out.println(" A soma dos numeros informados é: " + operacaoSoma);
                        }
                        
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

                    System.out.print("Digite o primeiro numero: ");
                        primeiroNumero = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                        segundoNumero = sc.nextInt();
                    System.out.println("Obs: Caso não deseje usar um terceiro numero, digite '0' ");
                    System.out.print("Digite o terceiro numero: ");
                        terceiroNumero = sc.nextInt();

                        if (terceiroNumero == 0) {
                            operacaoSubtrair = primeiroNumero - segundoNumero;
                            
                            System.out.println("A soma do numeros informado é: " + operacaoSubtrair);
                        }
                        else {
                            operacaoSubtrair = (primeiroNumero - segundoNumero) - terceiroNumero;

                            System.out.println(" A soma dos numeros informados é: " + operacaoSubtrair);
                        }

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
                    try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }

                    System.out.print("Digite o primeiro numero: ");
                        primeiroNumero = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                        segundoNumero = sc.nextInt();
                    System.out.println("Obs: Caso não deseje usar um terceiro numero, digite '0' ");
                    System.out.print("Digite o terceiro numero: ");
                        terceiroNumero = sc.nextInt();

                        if (terceiroNumero == 0) {
                            operacaoMultiplicar = primeiroNumero * segundoNumero;
                            
                            System.out.println("A soma do numeros informado é: " + operacaoMultiplicar);
                        }
                        else {
                            operacaoMultiplicar = (primeiroNumero * segundoNumero) * terceiroNumero;

                            System.out.println(" A soma dos numeros informados é: " + operacaoMultiplicar);
                        }

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
                case 4:
                    try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }

                    System.out.print("Digite o primeiro numero: ");
                        primeiroNumero = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                        segundoNumero = sc.nextInt();
                    System.out.println("Obs: Caso não deseje usar um terceiro numero, digite '0' ");
                    System.out.print("Digite o terceiro numero: ");
                        terceiroNumero = sc.nextInt();

                        if (terceiroNumero == 0) {
                            if (primeiroNumero < segundoNumero) {
                                operacaoDividir = segundoNumero / primeiroNumero;
                                
                                System.out.println("A soma do numeros informado é: " + operacaoDividir);
                            }
                            else {
                               operacaoDividir = primeiroNumero / segundoNumero;
                               
                               System.out.println("A soma do numeros informado é: " + operacaoDividir);
                            }
                        }

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
                case 5:
                 try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }

                    System.out.print("Digite o primeiro numero: ");
                        primeiroNumero = sc.nextInt();
                    
                    operacaoPotencia = (int) Math.pow(primeiroNumero, 2);

                    System.out.println("A potencia dos numeros informado é: " + operacaoPotencia);


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
                case 6:
                    try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }

                    System.out.print("Digite o primeiro numero: ");
                        primeiroNumero = sc.nextInt();
                    
                    operacaoRaiz = Math.sqrt(primeiroNumero);

                    System.out.println("A potencia dos numeros informado é: " + operacaoRaiz);


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
                case 7:
                    try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    }                    
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
                    }

                    System.out.print("Digite o primeiro numero: ");
                        primeiroNumero = sc.nextInt();
                    
                    if (primeiroNumero <= 1) {
                        System.out.println("Não é Primo");
                        return;
                    }

                    if (primeiroNumero == 2) {
                        System.out.println("é Primo");
                        return;
                    }

                    if (primeiroNumero % 2 == 0) {
                        System.out.println("Não é Primo");
                        return;
                    }

                    for (int i = 3; i <= Math.sqrt(primeiroNumero); i = i + 2) {
                        if (primeiroNumero % i == 0) {
                            System.out.println("Não é primo");
                            return;
                        }

                        return;
                    }

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
                case 8:
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
