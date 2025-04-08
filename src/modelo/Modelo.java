package modelo;

//Esta clase contiene los métodos para convertir las diferentes unidades de medida
public class Modelo {
    private double resultado;

    // constantes para las variables de las unidades de medida
    private final String cm = "centimetros";
    private final String in = "pulgadas";
    private final String ft = "pies";
    private final String mt = "metros";
    private final String km = "kilometros";
    private final String mi = "millas";

    // Método para convertir centimetros a cualquier unidad
    public double convCentimeter(double num, String identifier) {
        switch (identifier) {
            case cm:
                resultado = num;
                break;
            case in:
                resultado = num / 2.54;
                break;
            case ft:
                resultado = num / 30.45;
                break;
            case mt:
                resultado = num / 100;
                break;
            case km:
                resultado = num / 100000;
                break;
            case mi:
                resultado = num / 160934.4;
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;
    }

    // Método para convertir pulgadas a cualquier unidad
    public double convInch(double num, String identifier) {
        switch (identifier) {
            case cm:
                resultado = num * 2.54;
                break;
            case in:
                resultado = num;
                break;
            case ft:
                resultado = num / 12;
                break;
            case mt:
                resultado = num / 39.37;
                break;
            case km:
                resultado = num / 39370.1;
                break;
            case mi:
                resultado = num / 63360;
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;
    }

    // metodo para convertir a pies a cualquier unidad
    public double convFeet(double num, String identifier) {
        switch (identifier) {
            case cm:
                resultado = num * 30.48;
                break;
            case in:
                resultado = num * 12;
                break;
            case ft:
                resultado = num;
                break;
            case mt:
                resultado = num / 3.281;
                break;
            case km:
                resultado = num / 3281;
                break;
            case mi:
                resultado = num / 5380;
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;
    }

    // metodo para convertir metros a cualquier unidad
    public double convMeter(double num, String identifier) {
        switch (identifier) {
            case cm:
                resultado = num * 100;
                break;
            case in:
                resultado = num * 39.37;
                break;
            case ft:
                resultado = num * 3.281;
                break;
            case mt:
                resultado = num;
                break;
            case km:
                resultado = num / 1000;
                break;
            case mi:
                resultado = num / 1609.34;
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;
    }

    // metodo para convertir kilometros a cualquier unidad
    public double convKilometer(double num, String identifier) {
        switch (identifier) {
            case cm:
                resultado = num * 100000;
                break;
            case in:
                resultado = num * 39370.1;
                break;
            case ft:
                resultado = num * 3281;
                break;
            case mt:
                resultado = num * 1000;
                break;
            case km:
                resultado = num;
                break;
            case mi:
                resultado = num / 1.621371;
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;
    }

    // metodo para convertir millas a cualquier unidad
    public double convMile(double num, String identifier) {
        switch (identifier) {
            case cm:
                resultado = num * 160934.4;
                break;
            case in:
                resultado = num * 63360;
                break;
            case ft:
                resultado = num * 5280;
                break;
            case mt:
                resultado = num * 1609.34;
                break;
            case km:
                resultado = num * 1.60934;
                break;
            case mi:
                resultado = num;
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;
    }

}
