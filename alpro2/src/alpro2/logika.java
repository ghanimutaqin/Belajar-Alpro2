package alpro2;

import javax.swing.JOptionPane;

public class logika {

    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai"));
        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0) {
                int temp = i * 2;
                System.out.print(temp + ", ");
            } else {
                int temp = (int) Math.pow(i, 2);
                System.out.print(temp + ", ");
            }
        }
    }
}
