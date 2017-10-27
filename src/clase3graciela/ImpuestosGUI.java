/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3graciela;
//Import java.util.scanner;
//paquetes para implementar ventana grafica de usuario
import javax.swing.JOptionPane;

/**
 *
 * @author lp12
 */
public class ImpuestosGUI
        //impor
{
    public static void main(String[] args)
    {
     int sueldo;
     //Scanner escaner = new Scanner(System.in);
    // System.out.println("Ingrese su salario:");
    //Estamos convitiendo el string entero ante de guardarlo
    sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
     //sueldo = escaner.nextInt();
        if (sueldo >600000) 
        {
          //System.out.println("Debe pagar Impuesto");
            JOptionPane.showMessageDialog(null,"Debe pagar impuesto");
        }
    }
    
    
    
}
