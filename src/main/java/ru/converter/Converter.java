package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(100);
        float dollar = Converter.rubleToDollar(90);
        System.out.println("100 rubles are " + euro + " euro.");
        System.out.println("90 rubles are " + dollar + " dollar. ");
    }
}
