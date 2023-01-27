package lab2p2_víctorromero;

public class Solares {

    private double largo;
    private double ancho;
    private double area;
    private String Dueño;

    public Solares(double largo, double ancho, double area, String Dueño) {
        this.largo = largo;
        this.ancho = ancho;
        this.area = area;
        this.Dueño = Dueño;
    }

    public Solares() {
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = ancho*largo;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    
}
