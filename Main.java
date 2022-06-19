package Archivos;

public class Main {
    public static void main (String args[]){
        pruebaArchivos prueba = new pruebaArchivos();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getNombre() +
                    "\t" + prueba.getListaEntrada().get(i).getAnioNacimiento() +
                    "\t" + prueba.getListaEntrada().get(i).getMesNacimiento() +
                    "\t" + prueba.getListaEntrada().get(i).getDiaNacimiento() +
                    "\t" + prueba.getListaEntrada().get(i).getAnioActual() +
                    "\t" + prueba.getListaEntrada().get(i).getMesActual() +
                    "\t" + prueba.getListaEntrada().get(i).getDiaActual() +
                    "\t" + prueba.getListaEntrada().get(i).getEdad() +
                    "\t" + prueba.getListaEntrada().get(i).getSignoZodiacal() +
                    "\t" + prueba.getListaEntrada().get(i).getNumeroSuerte());
        }

        prueba.escribirArchivo(prueba.getListaEntrada());

    }
}
