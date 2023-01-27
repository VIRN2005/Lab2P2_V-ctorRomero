package lab2p2_víctorromero;

import java.util.ArrayList;

public class User {

    static ArrayList lista = new ArrayList();

    private String nombre;
    private int Edad;
    private String UserName;
    private String Contrasena;

    public User() {
    }

    public User(String nombre, int Edad, String UserName, String Contrasena) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.UserName = UserName;
        this.Contrasena = Contrasena;
    }

    public static ArrayList getLista() {
        return lista;
    }

    public static void setLista(ArrayList lista) {
        User.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

}
