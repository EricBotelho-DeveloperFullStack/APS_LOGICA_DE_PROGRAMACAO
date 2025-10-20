import javax.swing.*;
import java.awt.*;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class CalculadoraSwing extends JFrame implements KeyListener {

    private JTextField display;
    private JLabel equationLabel;
    private JPanel panelBotoes;
    private JPanel displayPanel;

    private double primeiroNumero;
    private String primeiroNumeroTexto;
    private String operadorPendente;
    private boolean limpadorDisplay;

    public CalculadoraSwing() {

        super("Calculadora Científica");
        addKeyListener(this);
        setFocusable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,450);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        displayPanel = new JPanel(new BorderLayout());
        displayPanel.setBackground(Color.BLACK);;

        equationLabel = new JLabel("");
        equationLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        equationLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        equationLabel.setForeground(Color.LIGHT_GRAY);
        equationLabel.setBorder(BorderFactory.createEmptyBorder(5,10,0,10));
        displayPanel.add(equationLabel, BorderLayout.NORTH);

        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 40));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBackground(Color.BLACK);
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));

        displayPanel.add(display, BorderLayout.CENTER);

        panelBotoes = new JPanel();
        panelBotoes.setLayout(new GridLayout(5,4,5,5));

        String[] textosBotoes = {
            "C", "√", "^", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "Primo", "0", ".", "="
        };

        ButtonClickListener listener = new ButtonClickListener();

        for (String texto : textosBotoes) {

            JCustomButton botao = new JCustomButton(texto);

            if (texto.equals("Primo")){
                botao.setFont(new Font("Arial", Font.BOLD, 16));
            }
            else {
                botao.setFont(new Font("Arial", Font.BOLD, 20));
            }

            botao.setFocusable(false);

            if ("C/=*+-^√".contains(texto) || texto.equals("Primo")) {
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

        add(displayPanel, BorderLayout.NORTH);
        add(panelBotoes, BorderLayout.CENTER);

        operadorPendente = "";
        primeiroNumero = 0;
        limpadorDisplay = true;

    }

    @Override
    public void keyPressed(KeyEvent e) {

        char keyChar = e.getKeyChar();
        int  keyCode = e.getKeyCode();

        if (keyChar >= '0' && keyChar <= '9') {
            handleNumero(String.valueOf(keyChar));
        }
        else if (keyChar == '.') {
            handleNumero(".");
        }
        else if (keyChar == '+') {
            handleOperador("+");
        }
        else if (keyChar == '-') {
            handleOperador("-");
        }
        else if (keyChar == '*') {
            handleOperador("*");
        }
        else if (keyChar == '/') {
            handleOperador("/");
        }
        else if (keyCode == KeyEvent.VK_ENTER) {
            handleEquals();
        }
        else if (keyCode == KeyEvent.VK_BACK_SPACE) {
            handleClear();
        }
        else if (keyCode == KeyEvent.VK_DELETE) {
            handleClear();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

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
            else if ("Primo".equals(comando)) {
                handlePrimeCheck();
            }
            else {
                handleOperador(comando);
            }
        }
    }

    private void handlePrimeCheck() {
        try {
            double numeroDouble = Double.parseDouble(display.getText());

            if (numeroDouble != (long) numeroDouble) {
                equationLabel.setText("Não é inteiro");
                return;
            }

            long numero = (long) numeroDouble;

            if (isPrime(numero)) {
                equationLabel.setText(numero + " é Primo");                
            }
            else {
                equationLabel.setText(numero + " não é Primo");
            }

            limpadorDisplay = true;
        }
        catch (NumberFormatException ex) {
            equationLabel.setText("Número inválido");
        }
    }

    private boolean isPrime(long n) {
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

    private void handleNumero(String num) {

        if (equationLabel.getText().contains("=") || equationLabel.getText().contains("Primo")) {
            equationLabel.setText("");
        }

        String textoAtual = display.getText();

       if (limpadorDisplay || textoAtual.equals("0")) {
            if (num.equals(".")) display.setText("0.");            
            else display.setText(num);
            limpadorDisplay = false;
       }
       else {
            if (num.equals(".") && textoAtual.contains(".")) return;
            display.setText(textoAtual + num);
        }
        
        if (operadorPendente.isEmpty()) {
            equationLabel.setText(display.getText());
        }
        else {
            equationLabel.setText(primeiroNumeroTexto + " " + operadorPendente + " " + display.getText());
        }

    }

    private void handleClear() {
        display.setText("0");
        equationLabel.setText("");
        operadorPendente = "";
        primeiroNumero = 0;
        primeiroNumeroTexto = "";
        limpadorDisplay = true;
    }

    private void handleOperador(String op) {
        if (!operadorPendente.isEmpty() && !limpadorDisplay) {
            handleEquals();
        }

        String numeroAtualNoVisor = display.getText();
        primeiroNumeroTexto = numeroAtualNoVisor;

        primeiroNumero = Double.parseDouble(numeroAtualNoVisor);
        operadorPendente = op;

        equationLabel.setText(numeroAtualNoVisor + " " + op);
        limpadorDisplay = true;

        if (op.equals("√")) {
            double resultado = Math.sqrt(primeiroNumero);
            equationLabel.setText("√(" + numeroAtualNoVisor + ")");
            display.setText(formatarResultado(resultado));
            operadorPendente = "";
        }
    }

    private void handleEquals() {
        if (operadorPendente.isEmpty()) {
            return;
        }

        String segundoNumeroTexto = display.getText();
        double segundoNumero = Double.parseDouble(display.getText());
        double resultado = 0;

        equationLabel.setText(primeiroNumeroTexto + " " + operadorPendente + " " + segundoNumeroTexto + " = ");

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
            return String.format(Locale.US,"%d", (long) resultado);
        }
        else {
            DecimalFormat df = new DecimalFormat("#.##########");
            df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
            return df.format(resultado);
        }
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            CalculadoraSwing calc = new CalculadoraSwing();
            calc.setVisible(true);
        });
        
    }
}

class JCustomButton extends JButton {
    
    public JCustomButton(String text) {
        super(text);
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(
            RenderingHints.KEY_TEXT_ANTIALIASING,
            RenderingHints.VALUE_TEXT_ANTIALIAS_ON
        );

        super.paintComponent(g);
    }
}
