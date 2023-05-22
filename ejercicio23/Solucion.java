
package com.mycompany.ejercicio23;

public class Solucion {
    
    public static double Solucion_Ecuacion(double datoa, double datob, double datoc){
       
        double res = (-datob + Math.sqrt(Math.pow(datob,2) - (4 * datoa * datoc))) / (2 * datoa);
        return res;
        
        
    }
    
}