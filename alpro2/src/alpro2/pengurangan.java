package alpro2;

import javax.swing.JOptionPane;

public class pengurangan {

    public static void main(String[] args) {
        int input1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai pertama"));
        int input2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai kedua"));
        if (input1 > input2) {
            int hasil = input1 - input2;
            System.out.println("hasil dari pengurangan nilai " + input1 + " - " + input2 + " = " + hasil);
        } else {
            JOptionPane.showMessageDialog(null, "Maaf syarat hasil pengurangan tidak boleh negatif silahkan cek kembali nilai inputan anda");
        }
    }

}
