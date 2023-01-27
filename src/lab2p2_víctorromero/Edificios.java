package lab2p2_víctorromero;

public class Edificios {
    
    private int numPisos;
    private int cantLocales;
    private String direccion;

    public Edificios() {
    }

    public Edificios(int numPisos, int cantLocales, String direccion) {
        this.numPisos = numPisos;
        this.cantLocales = cantLocales;
        this.direccion = direccion;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getCantLocales() {
        return cantLocales;
    }

    public void setCantLocales(int cantLocales) {
        this.cantLocales = cantLocales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Edificios{" + "numPisos=" + numPisos + ", cantLocales=" + cantLocales + ", Direccion=" + direccion + '}';
    }
    
    
}
