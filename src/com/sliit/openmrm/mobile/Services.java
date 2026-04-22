package com.clinica.servicios;

public class CalculadoraIMC {

    public static double calcularIMC(double pesoKg, double alturaMetros) {
        if (pesoKg <= 0 || alturaMetros <= 0) {
            throw new IllegalArgumentException("Peso y altura deben ser mayores a 0");
        }
        return pesoKg / (alturaMetros * alturaMetros);
    }

    public static String clasificarIMC(double imc) {
        if (imc < 18.5) return "Bajo peso";
        if (imc < 25) return "Normal";
        if (imc < 30) return "Sobrepeso";
        return "Obesidad";
    }
}
