/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica06;

import javax.swing.JOptionPane;
/**
 *
 * @author Hector Tino
 */
public class InstruccionIfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite el salario del empleado:");
        ifElse(Double.parseDouble(valor));
    }
    
    public static void ifElse(double salario){
        if(salario > 210){
            JOptionPane.showMessageDialog(null, "Empleado gana mas del salario minimo...");
        } else {
            JOptionPane.showMessageDialog(null, "Empleado gana menos del salario minimo...");
        }
    }
}
