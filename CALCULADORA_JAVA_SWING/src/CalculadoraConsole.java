
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class CalculadoraConsole {

    /**
     * Função para verificar se um número é primo.
     * @param numero O número a ser testado.
     * @return true se o número for primo, false caso contrário.
     */

public boolean isPrimo(int numero) {

    if (numero <= 1) {
        return false;
    }

    if (numero == 2) {
        return true;
    }

    if (numero % 2 == 0) {
        return false;
    }

    for (int i = 3; i <= Math.sqrt(numero); i += 2) {
        if (numero % i == 0) {
            return false;
        }
    }

    return true;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Declaração de vaiáveis
        int numeroEscolhido = 0;
        int primeiroNumero, segundoNumero;
        int operacaoSoma, operacaoSubtrair, operacaoMultiplicar, operacaoPotencia;
        double operacaoDividir, operacaoRaiz;

        //Estrutura de repetição
        while(numeroEscolhido != 8) {
            try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }                    
                } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
            }

            //Area de escolha do Usuário
            System.out.println("-------------- Menu --------------");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Potencia");
            System.out.println("6 - Raiz");
            System.out.println("7 - Identificador de numero Primo.");
            System.out.println("8 - Sair");
            System.out.println("-----------------------------------");
            System.out.print("Qual opção desejada? ");
                numeroEscolhido = sc.nextInt();
            System.out.println("Carregando...");

            //Estrutura para o tempo de limpeza
            try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            
            //Estrutura para limpeza do terminal
            try {
                if (System.getProperty("os.name").contains("Windows")) {
                     new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }                    
                } catch (IOException | InterruptedException e) {
                        System.err.println("Erro ao tentar limpar: " + e.getMessage());
            }
            
            //Estrutura de excecução dos operadores da calculadora
            switch (numeroEscolhido) {
                //Estrutura da Soma
                case 1:
                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }

                            System.out.println("Qual o primeiro numero?");
                            System.out.print("-> ");
                                primeiroNumero = sc.nextInt();
                            System.out.println("Qual o segundo numero?");
                            System.out.print("-> ");
                                segundoNumero = sc.nextInt();
                                
                            operacaoSoma = primeiroNumero + segundoNumero;
                                    
                            System.out.println("A soma dos numeros informados é: " + operacaoSoma);
                                
                            System.out.println("Finalizando...");

                        try {
                            Thread.sleep(5000);
                        } 
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }
                break;

                //Estrutura da Subtração
                case 2:
                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }

                           System.out.println("Qual o primeiro numero?");
                            System.out.print("-> ");
                                primeiroNumero = sc.nextInt();
                            System.out.println("Qual o segundo numero?");
                            System.out.print("-> ");
                                segundoNumero = sc.nextInt();

                            operacaoSubtrair = primeiroNumero - segundoNumero;
                                    
                            System.out.println("A subtração dos numeros informados é: " + operacaoSubtrair);

                            System.out.println("Finalizando...");

                        try {
                            Thread.sleep(5000);
                        } 
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }
                break;

                //Estrutura da Multiplicação
                case 3:
                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }

                            System.out.println("Qual o primeiro numero?");
                            System.out.print("-> ");
                                primeiroNumero = sc.nextInt();
                            System.out.println("Qual o segundo numero?");
                            System.out.print("-> ");
                                segundoNumero = sc.nextInt();
                                    
                                operacaoMultiplicar = primeiroNumero * segundoNumero;
                                        
                                System.out.println("A multiplicação dos numeros informados é: " + operacaoMultiplicar);
                                
                            System.out.println("Finalizando...");

                        try {
                            Thread.sleep(5000);
                        } 
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }
                break;

                //Estrutura da Divisão
                case 4:
                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }

                            System.out.println("Qual o primeiro numero?");
                            System.out.print("-> ");
                                primeiroNumero = sc.nextInt();
                            System.out.println("Qual o segundo numero?");
                            System.out.print("-> ");
                                segundoNumero = sc.nextInt();                            

                                    if (primeiroNumero < segundoNumero) {
                                        operacaoDividir = (double) segundoNumero / (double)primeiroNumero;                                        
                                        System.out.println("A divisão dos numeros informados é: " + String.format("%.2f", operacaoDividir));
                                    }
                                    else {
                                        operacaoDividir = (double) primeiroNumero / (double) segundoNumero;                                    
                                        System.out.println("A divisão dos numeros informados é: " + String.format("%.2f", operacaoDividir));
                                    }

                            System.out.println("Finalizando...");

                        try {
                            Thread.sleep(5000);
                        } 
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                                System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }
                break;
                
                //Estrutura da Potência
                case 5:
                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }

                            System.out.println("Qual o numerador?");
                            System.out.print("-> ");
                                primeiroNumero = sc.nextInt();
                            System.out.println("Qual o denominador?");
                            System.out.print("-> ");
                                segundoNumero = sc.nextInt();
                            
                            operacaoPotencia = (int) Math.pow(primeiroNumero, segundoNumero);

                            System.out.println("A potencia dos numeros informado é: " + operacaoPotencia);

                            System.out.println("Finalizando...");

                        try {
                            Thread.sleep(5000);
                        } 
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                                System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }
                break;

                //Estrutura da Reais Quadrada
                case 6:
                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }

                            System.out.println("Qual o numero desejado?");
                            System.out.print("-> ");
                                primeiroNumero = sc.nextInt();
                                                            
                            operacaoRaiz = Math.sqrt(primeiroNumero);

                            System.out.println("A raiz quadrada do numero informado é: " + String.format("%.2f", operacaoRaiz));

                            System.out.println("Finalizando...");

                        try {
                            Thread.sleep(5000);
                        } 
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }
                break;

                //Estrutura da identificação de numero primo
                case 7:
                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }

                        CalculadoraConsole verificador = new CalculadoraConsole();

                            System.out.println("Qual numero desejado?");
                            System.out.print("-> ");
                                primeiroNumero = sc.nextInt();

                                if (verificador.isPrimo(primeiroNumero)) {
                                    System.out.println(primeiroNumero + " é Primo");
                                }
                                else {
                                    System.out.println(primeiroNumero + " não é Primo");
                                }
                                
                            System.out.println("Finalizando...");                    

                        try {
                            Thread.sleep(5000);
                        } 
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }

                break;

                //Estrutura de encerramento do programa
                case 8:
                            System.out.println("Finalizando Programa...");

                        try {
                            Thread.sleep(5000);
                        } 
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                
                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }

                        System.out.println("Até Logo!!");
                break;

                //Estrutura de Digitação não correlacionada com o menu
                default:
                            System.out.println("");
                            System.out.println("Opção Inválida");
                            System.out.println("Retornando ao menu...");

                        try {
                            Thread.sleep(5000);
                        } 
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        try {
                            if (System.getProperty("os.name").contains("Windows")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            }                    
                        } 
                        catch (IOException | InterruptedException e) {
                            System.err.println("Erro ao tentar limpar: " + e.getMessage());
                        }
                break;
            }
        }
     sc.close();
    }
          
}
