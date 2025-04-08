package controlador;

import modelo.Modelo;

//esta clase se encarga de recibir los datos de la vista y pasarlos al modelo para su procesamiento
public class Controlador {
    Modelo m = new Modelo();

    private final String cm = "centimetros";
    private final String in = "pulgadas";
    private final String ft = "pies";
    private final String mt = "metros";
    private final String km = "kilometros";
    private final String mi = "millas";

    //metodo para elegir las unidades y su conversion en el metodo respectivo de la clase modelo
    public double convertir(double num, String unidad, String resultado){
        double resultadoConversion = 0;
        switch (unidad) {
            case cm:
                resultadoConversion = m.convCentimeter(num, resultado);
                break;
        
            case in:
                resultadoConversion = m.convInch(num, resultado);
                break;

            case ft:
                resultadoConversion = m.convFeet(num, resultado);
                break;

            case mt:
                resultadoConversion = m.convMeter(num, resultado);
                break;

            case km:
                resultadoConversion = m.convKilometer(num, resultado);
                break;

            case mi:
                resultadoConversion = m.convMile(num, resultado);
                break;
                
            default:
                System.out.println("unidad no valida");
                break;
        }

        return resultadoConversion;
    }
}