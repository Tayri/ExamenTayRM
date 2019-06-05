/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Tayri
 */
public class Clonacion {

    /**
     * @param args the command line arguments
     */
     public static void ELEGIR() {
        
        int opciones;
        int decidir = JOptionPane.showConfirmDialog(null, "Vamos a operar");
        if (decidir == JOptionPane.YES_OPTION){
         opciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: \n 1: SUMA \n 2: RESTA \n 3: MULTIPLICACION \n 4: DIVISION"));
         
         
        if (opciones == 1){
            SUMA1();
        }
        if (opciones == 2){
            RESTA();
        }
        if (opciones == 3){
            MULTIPLICACION();
    }
        if (opciones == 4){
            DIVISION();
        }
        }
    }
            
        public static void SUMA1() {
            
            int sum1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: "));
        int sum2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
        int sum3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero mas: "));

        int suma = sum1+sum2+sum3;

        JOptionPane.showMessageDialog(null, "Operacion suma= "+suma);
        }
        public static void RESTA() {
        
        int rest1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: "));
        int rest2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
        int rest3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero mas: "));

        int resta = (rest1-rest2)-rest3;
        

        JOptionPane.showMessageDialog(null,"Operacion resta= "+ resta);
        }
        
        public static void MULTIPLICACION() {
            
        int mul1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: "));
        int mul2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
        int mul3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero mas: "));

        int multiplicacion = mul1*mul2*mul3;
        
        JOptionPane.showMessageDialog(null,"Operacion multiplicacion= "+ multiplicacion);
        }
        public static void DIVISION() {
            
        double div1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: "));
        double div2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero: "));
        double div3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero mas: "));

        double division = (div1/div2)/div3;

        JOptionPane.showMessageDialog(null, "Operacion division= "+division);
        }
    
}
