import javax.swing.*;

class SwingBasico {
    public static void main(String entrada[]) 
    {
        int n1, n2, div;
        double pot;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, 1/n2);

        msg = msg + "quociente da divisao de " + n1 + " por " + n2 + " = " + div + "\n";
        msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot + "\n";

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}
