package pert3praktikum;

public class KonversiSuhu2 extends KonversiSuhu {
    public float fahrenheitToReamur(float fahrenheit) {
        float celcius = (fahrenheit - 32) * 5/9;
        return (float) celciusToReamur (celcius);
    }
}
