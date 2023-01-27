package lab2p2_víctorromero;

import java.awt.Color;
import java.util.*;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Lab2P2_VíctorRomero {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Casas c = new Casas();
        Edificios e = new Edificios();
        Solares s = new Solares();
        ArrayList lista = new ArrayList();

        System.out.println("Víctor Romero - 12211079\n");

        int opcion;
        do {
            System.out.println("_____________________________________________________________ ");
            System.out.println(" ");
            System.out.println(">> MENU <<");
            System.out.println("----------------------- ");

            System.out.println("1 -> Registro de Inmueble/Solar");
            System.out.println("2 -> Manejo de Estados");
            System.out.println("3 -> Log In/Sign Up");
            System.out.println("4 -> SALIDA");
            System.out.println(" ");
            System.out.println(" ");

            System.out.print("Ingrese su Opcion: ");
            opcion = leer.nextInt();
            System.out.println("=> La Opcion escojida es: " + opcion);
            System.out.println(" ");

            int registro = 0;

            switch (opcion) {

                case 1: { // Registro
                    System.out.println(">> MENU REGISTRO <<\n");

                    System.out.println("1) Crear Casas/Edificios/Solares");
                    System.out.println("2) Listar Casas/Edificios/Solares");
                    System.out.println("3) Modificar Casas/Edificios/Solares");
                    System.out.println("4) Borrar Casas/Edificios/Solares");
                    System.out.println("5) Comprar Casas/Edificios/Solares");

                    System.out.print("Ingrese su Opcion de Registro: ");
                    registro = leer.nextInt();
                    System.out.println("=> La Opcion escojida de Registro es: " + registro);
                    System.out.println(" ");

                    int terr = 0;
                    switch (registro) {
                        case 1: {
                            System.out.println(">> MENU CREACION <<\n");

                            System.out.println("1) Crear Casas");
                            System.out.println("2) Crear Edificios");
                            System.out.println("3) Crear Solares");

                            System.out.print("Ingrese su Opcion de Registro: ");
                            terr = leer.nextInt();
                            System.out.println("=> La Opcion escojida de Registro es: " + terr);
                            System.out.println(" ");

                            switch (terr) {
                                case 1: {// Crear Casas
                                    Casas temp = new Casas();

                                    lista.add(newCasas());
                                }
                                break;

                                case 2: {// Crear Edificios
                                    Edificios temp = new Edificios();

                                }
                                break;

                                case 3: {// Crear Solares

                                }
                                break;
                            }

                        }
                        break;

                    }

                }
                case 2: { // 

                }
                break;

                case 3: {// Login
                    int login;

                    System.out.println(">> MENU LOGIN <<\n");

                    System.out.println("1) LOG IN");
                    System.out.println("2) SIGN UP");

                    System.out.print("Ingrese su Opcion de Login: ");
                    login = leer.nextInt();
                    System.out.println("=> La Opcion escojida de Login es: " + login);
                    System.out.println(" ");
                }
                break;
            }

        } while (opcion != 4);
    }

    static Casas newCasas() {

        int NumCasa;
        int NumBloque;
        Color color;
        int Ancho;
        int Largo;
        int NumBaños;
        int NumCuartos;

        Casas retorno;

        System.out.println("Ingrese el Numero de Casa: ");
        NumCasa = leer.nextInt();

        System.out.println("Ingrese el Numero de Bloque: ");
        NumBloque = leer.nextInt();

        color = JColorChooser.showDialog(null, "Seleccione Color", Color.black);

        System.out.println("Ingrese el Ancho de Casa: ");
        Ancho = leer.nextInt();

        System.out.println("Ingrese el Largo de Casa: ");
        Largo = leer.nextInt();

        System.out.println("Ingrese el Numero de Baños de la Casa: ");
        NumBaños = leer.nextInt();

        System.out.println("Ingrese el Numero de Cuartos de la Casa: ");
        NumCuartos = leer.nextInt();

        retorno = new Casas(NumCasa, NumBloque, color, Ancho, Largo, NumBaños, NumCuartos);
        return retorno;

    }

//    static Edificios newEdificios() {
//        
//        
//        
//    }
//
//    static Solares newSolares() {
//
//    }
}
