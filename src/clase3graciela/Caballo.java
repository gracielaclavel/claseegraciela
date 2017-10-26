/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3graciela;

/**
 *
 * @author lp12
 */
public class Caballo 
{
    //Declaracion de atributos de clase
   String altura;
   String color;
   String peso;
   String raza;
    int patas =4, edad;
    //Metodo constructor,no tiene retorno
    public Caballo(String nuevoNombre)
    {
      raza = nuevoNombre;   
    }
    //metodos get y set de la clase
    public  void relinchar()
    {
    }
    public String obtenerRaza()
   {
       //Setencia obligatoria de retorno
        return raza;
    }
    public int obtenerEdad()
    {
     return edad;
    }
            
}

