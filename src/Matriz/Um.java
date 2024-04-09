package Matriz;

import javax.swing.*;

public class Um {
    public static void main(String[] args) {
        int[][] matriz = new int[6][2];
        double prod;
        String num;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                num = JOptionPane.showInputDialog(
                        "informe o valor G " + i + ", " + j);
            }

        }
    }
}
