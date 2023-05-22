
package com.mycompany.ejercicio41;

public class Comparacion {
    
    public static double comparacion_numeros(double num1, double num2, double num3, double num4, double num5){
        
        double mayor = 0.;
        if(num1 > num2){
            if(num1 > num3){
                if(num1 > num4){
                    if(num1 > num5){
                        mayor = num1;
                    }
                }
                else if(num4 > num5){
                    mayor = num4;
                }
                else{
                    mayor = num5;
                }
            }
            else if(num3 > num4){
                if(num3 > num5){
                    mayor = num3;
                }
                else{
                    mayor = num5;
                }
            }
            else if(num4 > num5){
                mayor = num4;
            }
            else{
                mayor = num5;
            }
        }
        else if(num2 > num3){
            if(num2 > num4){
                if(num2 > num5){
                    mayor = num2;
                }
                else{
                    mayor = num5;
                }
            }
            else if(num4 > num5){
                mayor = num4;  
            }
            else{
                mayor = num5;
            }
        }
        else if(num3 > num4){
            if(num3 > num5){
                mayor = num3;
            }
            else{
                mayor = num5;
            }
        }
        else if(num4 > num5){
            mayor = num4;
        }
        else{
            mayor = num5;
        }
                       
        return mayor;
    }
    
}
