import javax.swing.*;

class Matriz {

    public static void soma(int vet[]) {
        int s = 0;
        for (int i = 0; i < vet.length; i++) {
            s += vet[i];
        }
        JOptionPane.showMessageDialog(null, "A somatória eh: " + s);
    }

    public static int produto(int[] vet) {
        int p = 1;
        for (int i = 0; i < vet.length; i++) {
            p *= vet[i];
        }
        return p;
    }

    public static void main(String[] entrada) {
        int[] vetor = {2, 4, 6, 8, 10};
        soma(vetor);
        int p = produto(vetor);
        JOptionPane.showMessageDialog(null, "A produtória eh: " + p);
        System.exit(0);
    }
}

