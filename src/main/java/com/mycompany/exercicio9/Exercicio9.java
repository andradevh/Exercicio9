package com.mycompany.exercicio9;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio9 {

    public static void main(String[] args) {
        int peso; 
        double altura, imc;
        peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
        
        imc = peso / (altura * altura);
        
        DecimalFormat format = new DecimalFormat(" 0.00 ");
        
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + format.format(imc));
    }
}
