public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        // pi * r2
        double areaCirculo = circleArea(y);
        System.out.println(areaCirculo);

        //Area de una esfera
        //4*PI*r2
        double esferaArea = sphereArea(y);
        System.out.println(esferaArea);

        //Volumen de una esfera
        //(4/3)*pi * r3
        double esferaVolumen = sphereVolumen(y);
        System.out.println(esferaVolumen);

        System.out.println("Pesos a Dolares" + converToDollar(100, "COP"));

    }
    /**
     * Descripcion: Función que calcula el area de un circulo
     * @param r parametro que se toma para calcular el area
     * @return Se retorna el resultado
     * */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    /**
     * Descripcion: Función que calcula el area de una esfera
     * @param r parametro que se toma para calcular el area de una esfera
     * @return Se retorna el resultado
     * */
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    /**
     * Descripcion: Función que calcula el volumen de una esfera
     * @param r parametro que se toma para calcular el volumen de una esfera
     * @return Se retorna el resultado
     * */
    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidas de dienro a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public static double converToDollar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }

}
