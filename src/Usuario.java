
import javax.swing.JOptionPane;


public class Usuario {
    
    private String correo;
    private String contra;
    private String nombre;
    private int edad;
    private char genero;

    public Usuario() {
    }

    public Usuario(String correo, String contra, String nombre, int edad, char genero) {
        this.correo = correo;
        this.contra = contra;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        if (contra.length() >= 9){
            if (containsNumber(contra)){
                this.contra = contra;
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña ingresada no contiene 9 caracteres o menos");
            }
        }
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <=17){
            JOptionPane.showMessageDialog(null, "No tiene la edad requerida para crear un usuario");
            this.edad = -1;
        } else {
            this.edad = edad;
        }
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean containsNumber(String c){
        int cont = 0;
        for (int i = 0; i < c.length(); i++){
            if ( (int) c.charAt(i) >= 48 && (int) c.charAt(i) <= 57){
                cont++;
            }
        }
        if (cont > 0){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return nombre + " " + edad + " " + genero;
    }
    
    
    
}
