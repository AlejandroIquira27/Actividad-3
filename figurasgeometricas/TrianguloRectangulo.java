
package com.mycompany.figurasgeometricas;

public class TrianguloRectangulo {
    
    public static double Perimetro(double base, double altura){
        double hipotenusa = Math.pow(base*base + altura*altura, 0.5);
        double perimetro = base + altura + hipotenusa;
        return perimetro;
    }
    
    public static double Area(double base, double altura){
        double area = (base * altura) / 2;
        return area;
    }
    
    public static String Clase(double base, double altura){
        double hipotenusa = Math.pow(base*base + altura*altura,0.5);
        String res = "";
        
        if((base==altura) && (base==hipotenusa) && (altura==hipotenusa)){
            res = "Es un triangulo Equilatero";
        }
        else if((base!=altura) && (base!=hipotenusa) && (altura!=hipotenusa)){
            res = "Es un triangulo Escaleno";
        }
        else{
            res = "Es un triangulo Isoceles";
        }
        return res;
    }
    
}
