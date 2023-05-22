
package com.mycompany.ejercicio10;

public class Pago {
    
    public static double Pago_Matricula(double patrimonio, double estrato){
        
        double pagomat = 50000;
        if((patrimonio > 2000000) && (estrato > 3)){
            pagomat = pagomat + (0.03 * patrimonio);
        }
        return pagomat;
    }
    
}
