package alpro2;

import javax.swing.JOptionPane;

public class Alpro2 {

    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka ; "));
        for (int i = input; i >= 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = 0; i <= input; i++) {
            System.out.print(i + ", ");
        }

    }}
