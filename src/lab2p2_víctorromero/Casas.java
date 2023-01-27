package lab2p2_víctorromero;

import java.awt.Color;

public class Casas {

    private int NumCasa;
    private int NumBloque;
    private Color color;
    private int Ancho;
    private int Largo;
    private int NumBaños;
    private int NumCuartos;

    public Casas() {
    }

    public Casas(int NumCasa, int NumBloque, Color color, int Ancho, int Largo, int NumBaños, int NumCuartos) {
        this.NumCasa = NumCasa;
        this.NumBloque = NumBloque;
        this.color = color;
        this.Ancho = Ancho;
        this.Largo = Largo;
        this.NumBaños = NumBaños;
        this.NumCuartos = NumCuartos;
    }

    public int getNumCasa() {
        return NumCasa;
    }

    public void setNumCasa(int NumCasa) {
        this.NumCasa = NumCasa;
    }

    public int getNumBloque() {
        return NumBloque;
    }

    public void setNumBloque(int NumBloque) {
        this.NumBloque = NumBloque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }

    public int getNumBaños() {
        return NumBaños;
    }

    public void setNumBaños(int NumBaños) {
        this.NumBaños = NumBaños;
    }

    public int getNumCuartos() {
        return NumCuartos;
    }

    public void setNumCuartos(int NumCuartos) {
        this.NumCuartos = NumCuartos;
    }

    @Override
    public String toString() {
        return "Casas{" + "NumCasa=" + NumCasa + ", NumBloque=" + NumBloque + ", color=" + color + ", Ancho=" + Ancho + ", Largo=" + Largo + ", NumBa\u00f1os=" + NumBaños + ", NumCuartos=" + NumCuartos + '}';
    }
    
    
}
