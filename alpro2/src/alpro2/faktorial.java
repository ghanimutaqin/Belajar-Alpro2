
package alpro2;

import javax.swing.JOptionPane;

public class faktorial {

    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai faktorial :"));
        int faktor = 1;
        for (int i = 1; i <= input; i++) {
            faktor *= i;
            System.out.println(faktor + " = " + i + "!");
        }

    }

}
