import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSwing extends JFrame {

    private JTextField display;
    private JPanel panelBotoes;

    private double primeiroNumero;
    private String operadorPendente;
    private boolean limpadorDisplay;

    public CalculadoraSwing() {

        super("Calculadora Científica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,450);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 40));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBackground(Color.BLACK);
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        panelBotoes = new JPanel();
        panelBotoes.setLayout(new GridLayout(5,4,5,5));

        String[] textosBotoes = {
            "C", "√", "^", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            " ", "0", ".", "="
        };

        ButtonClickListener listener = new ButtonClickListener();

        for (String texto : textosBotoes) {
            if (texto.equals(" ")) {
                panelBotoes.add(new JLabel(""));
                continue;
            }

            JButton botao = new JButton(texto);
            botao.setFont(new Font("Arial", Font.BOLD, 20));
            botao.setFocusable(false);

            if ("C/=*+-^√".contains(texto)) {
                botao.setBackground(new Color(255, 153,0));
                botao.setForeground(Color.WHITE);
            }
            else {
                botao.setBackground(new Color(64,64,64));
                botao.setForeground(Color.WHITE);
            }

            botao.addActionListener(listener);
            panelBotoes.add(botao);
        }

        add(display, BorderLayout.NORTH);
        add(panelBotoes, BorderLayout.CENTER);

        operadorPendente = "";
        primeiroNumero = 0;
        limpadorDisplay = true;

    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();

            if ("0123456789.".contains(comando)) {
                handleNumero(comando);
            }
            else if ("C".equals(comando)) {
                handleClear();
            }
            else if ("=".equals(comando)) {
                handleEquals();
            }
            else {
                handleOperador(comando);
            }
        }
    }

    private void handleNumero(String num) {

        String textoAtual = display.getText();

       if (limpadorDisplay || textoAtual.equals("0")) {
            if (num.equals(".")) {
                display.setText("0");
            }
            else {
                display.setText(num);
            }

            limpadorDisplay = false;
       }
       else {
            if (num.equals(".") && textoAtual.contains(".")) {
                return;
            }

            display.setText(textoAtual + num);
       }
    }

    private void handleClear() {
        display.setText("0");
        operadorPendente = "";
        primeiroNumero = 0;
        limpadorDisplay = true;
    }

    private void handleOperador(String op) {
        if (!operadorPendente.isEmpty()) {
            handleEquals();
        }

        primeiroNumero = Double.parseDouble(display.getText());
        operadorPendente = op;
        limpadorDisplay = true;

        if (op.equals("√")) {
            double resultado = Math.sqrt(primeiroNumero);
            display.setText(formatarResultado(resultado));
            operadorPendente = "";
        }
    }

    private void handleEquals() {
        if (operadorPendente.isEmpty()) {
            return;
        }

        double segundoNumero = Double.parseDouble(display.getText());
        double resultado = 0;

        switch (operadorPendente) {
            case "+": resultado = primeiroNumero + segundoNumero; break;
            case "-": resultado = primeiroNumero - segundoNumero; break;
            case "*": resultado = primeiroNumero * segundoNumero; break;
            case "^": resultado = Math.pow(primeiroNumero, segundoNumero); break;
            case "/":
                if (segundoNumero == 0) {
                    display.setText("Erro");
                    operadorPendente = "";
                    limpadorDisplay = true;
                    return;
                }

                resultado = primeiroNumero / segundoNumero;
                break;
        }

        display.setText(formatarResultado(resultado));
        operadorPendente = "";
        limpadorDisplay = true;
    }

    private String formatarResultado(double resultado) {
        if (resultado == (long) resultado) {
            return String.format("%d", (long) resultado);
        }
        else {
            return String.format("%g", resultado);
        }
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            CalculadoraSwing calc = new CalculadoraSwing();
            calc.setVisible(true);
        });
        
    }
}
