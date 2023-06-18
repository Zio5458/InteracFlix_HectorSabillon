/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_darielsevilla;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Administrador {

    private File file;
    private ArrayList<Lenguaje> lenguajes = new ArrayList();

    public Administrador() {
    }

    public Administrador(String path) {
        file = new File(path);
    }

    public void lea() {
        try{
            lenguajes.clear();
            Scanner lea = new Scanner(file);
            while(lea.hasNextLine()){
               
                String language = lea.nextLine();
                String[] atributos = language.split("\\|");
                
                Lenguaje l = new Lenguaje();
                
                //creadores
                String[] creators = atributos[0].split(",");
                for (String creator : creators) {
                    String[] crea = creator.split(";");
                    l.getCreadores().add(new Creador(crea[0], crea[1], crea[2]));
                }
                
                //info adicional
                String[] info = atributos[1].split("\\.");
                for (String inf : info) {
                    l.setNombre(info[0]);
                    if(info[1].equals("Si")){
                        l.setCaseSensisitve(true);
                    }else{
                        l.setCaseSensisitve(false);
                    }
                    
                    SimpleDateFormat formato = new SimpleDateFormat("dd-mm-yyyy");
                    l.setFecha(formato.parse(info[2]));
                    l.setPersonas(info[3]);
                }
                
                //palabras reservadas
                String[] reservadas = atributos[2].split("&");
                for (String reservada : reservadas) {
                    String[] res2 = reservada.split("\\$");
                   
                    l.getPalabrasReservadas().add(new Palabras(res2[0], res2[1], res2[2]));
                }
                
                
                //agregar lenguaje
                lenguajes.add(l);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<Lenguaje> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(ArrayList<Lenguaje> lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Administrador{" + "file=" + file + ", lenguajes=" + lenguajes + '}';
    }
    
    /**public void escriba() {
        try {
            FileWriter writer = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(writer);
            for (Lenguaje l : lenguajes) {
                //escribir creadores
                for (int i = 0; i < l.getCreadores().size(); i++) {
                   Creador c =  l.getCreadores().get(i);
                   
                   bw.write(c.getNombre() + ";" + c.getNacionalidad() + ";" + c.getProfesion());
                   if(i != l.getCreadores().size() -1){
                       bw.write(",");
                   }
                }
                bw.write("|");
                
                //escriir informacion
                String sensitive = "";
                if(l.isCaseSensisitve()){
                    sensitive = "si";
                }else{
                    sensitive = "no";
                }
                SimpleDateFormat formato = new SimpleD
                bw.write(l.getNombre() + "." + sensitive + ".");
            }
            
        } catch (Exception e) {

        }
    }*/

}
