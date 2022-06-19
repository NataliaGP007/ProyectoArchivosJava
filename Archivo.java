package Archivos;

import java.io.*;
import java.util.ArrayList;

public class Archivo {
    private String linea;
    private ArrayList<String> lineasArchivo = new ArrayList<String>();

    public ArrayList<String> leerArchivo (String ruta){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File (ruta);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            while((linea=br.readLine()) != null) {
                if (linea != "") {
                    lineasArchivo.add(linea);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return lineasArchivo;
    }
}
