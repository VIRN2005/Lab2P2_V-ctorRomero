package lab2p2_víctorromero;

import java.util.*;

public class Lab2P2_VíctorRomero {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
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

        } while (opcion != 4);

    }
}
