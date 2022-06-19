package Archivos;

import java.io.*;
import java.util.ArrayList;

public class pruebaArchivos {

    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<Numerologia> listaEntrada = new ArrayList<>();
    private final String rutaWindows = "C:\\Users\\Natalia\\IdeaProjects\\Numerologia\\src\\Archivos\\DatosEdad.txt";

    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<Numerologia> getListaEntrada() {
        return listaEntrada;
    }

    public void leerArchivo(){
        Archivo leer = new Archivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaWindows);
        for (int i=0; i < this.contenidoArchivo.size();i++){
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split(",");
            try {
                String nombre = (elementosLinea[0]);
                int anioNacimiento = Integer.parseInt(elementosLinea[1]);
                int mesNacimiento = Integer.parseInt(elementosLinea[2]);
                int diaNacimiento = Integer.parseInt(elementosLinea[3]);
                int anioActual = Integer.parseInt(elementosLinea[4]);
                int mesActual = Integer.parseInt(elementosLinea[5]);
                int diaActual = Integer.parseInt(elementosLinea[6]);
                listaEntrada.add(new Numerologia(nombre, anioNacimiento, mesNacimiento, diaNacimiento,
                        anioActual, mesActual, diaActual));
            } catch (NumberFormatException ex){
                ex.printStackTrace();
                listaEntrada.add(new Numerologia(" ",0, 0, 0, 0, 0, 0));
            }
        }
    }

    public void escribirArchivo(ArrayList<Numerologia> lista){
        String archivo = "C:\\Users\\Natalia\\IdeaProjects\\Numerologia\\src\\Archivos\\resultados.csv";
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Nombre,Año de nacimiento,Mes de nacimiento,Dia de nacimiento,Año actual," +
                    "Mes actual,Dia actual, Edad, Signo zodiacal, Numero de la suerte\n");
            for (int i=0; i < lista.size(); i++){
                wr.append(lista.get(i).getNombre() +
                        "," + lista.get(i).getAnioNacimiento() +
                        "," + lista.get(i).getMesNacimiento() +
                        "," + lista.get(i).getDiaNacimiento() +
                        "," + lista.get(i).getAnioActual() +
                        "," + lista.get(i).getMesActual() +
                        "," + lista.get(i).getDiaActual() +
                        "," + lista.get(i).getEdad() +
                        "," + lista.get(i).getSignoZodiacal() +
                        "," + lista.get(i).getNumeroSuerte() + "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }
}