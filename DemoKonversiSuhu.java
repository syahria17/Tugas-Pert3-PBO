package pert3praktikum;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        float celcius = 25;
        System.out.println("Celsius to Fahrenheit: " + konversi.celciusToFahrenhait(celcius));
        System.out.println("Celsius to Reamur: " + konversi.celciusToReamur(celcius));
        
        float fahrenheit = 77;
        System.out.println("Fahrenheit to Reamur: " + konversi.fahrenheitToReamur(fahrenheit));
    }
}