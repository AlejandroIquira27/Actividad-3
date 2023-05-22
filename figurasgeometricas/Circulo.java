
package com.mycompany.figurasgeometricas;


public class Circulo {
    
    public static double Calcular_Perimetro(double radio){
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
    public static double Calcular_Area(double radio){
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
}
