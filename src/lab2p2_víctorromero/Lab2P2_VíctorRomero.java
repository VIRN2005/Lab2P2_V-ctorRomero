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
        ArrayList<User> listaUsar = new ArrayList();

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
                        case 1: { // Crear
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

                                    lista.add(newEdificios());
                                }
                                break;

                                case 3: {// Crear Solares
                                    Solares temp = new Solares();

                                    lista.add(newSolares());
                                }
                                break;
                            }
                        }
                        break;

                        case 2: { // Listar
                            int terr2 = 0;

                            System.out.println(">> MENU CREACION <<\n");

                            System.out.println("1) Listar Casas");
                            System.out.println("2) Listar Edificios");
                            System.out.println("3) Listar Solares");

                            System.out.print("Ingrese su Opcion de Registro: ");
                            terr2 = leer.nextInt();
                            System.out.println("=> La Opcion escojida de Registro es: " + terr2);
                            System.out.println(" ");

                            switch (terr) {
                                case 1: {//Casas
                                    String chain = null;
                                    for (Object o : lista) {
                                        if (o instanceof Casas) {
                                            chain += lista.indexOf(o) + "- " + o + "\n";
                                        }
                                    }
                                    System.out.println(chain);
                                }

                                case 2: {//Edificios
                                    String chain = null;
                                    for (Object o : lista) {
                                        if (o instanceof Edificios) {
                                            chain += lista.indexOf(o) + "- " + o + "\n";
                                        }
                                    }
                                    System.out.println(chain);
                                }

                                case 3: {// Solares
                                    String chain = null;
                                    for (Object o : lista) {
                                        if (o instanceof Solares) {
                                            chain += lista.indexOf(o) + "- " + o + "\n";
                                        }
                                    }
                                    System.out.println(chain);
                                }

                                case 4: {
                                    String chain = null;
                                    for (Object o : lista) {
                                        chain += lista.indexOf(o) + "- " + o + "\n";
                                    }
                                    System.out.println(chain);
                                }
                            }

                        }
                        break;

                        case 3: { // Modificar

                        }

                        int terr3 = 0;
                        case 4: { // Borrar

                            String chain = null;
                            for (Object o : lista) {
                                chain += lista.indexOf(o) + "- " + o + "\n";
                            }
                            System.out.println(chain);

                            System.out.print("Ingrese su Opcion de Registro: ");
                            terr3 = leer.nextInt();
                            System.out.println("=> La Opcion escojida de Registro es: " + terr3);
                            System.out.println(" ");

                            lista.remove(terr3);
                        }
                        break;

                        case 5: { // Comprar
                            String chain = null;
                            for (Object o : lista) {
                                chain += lista.indexOf(o) + "- " + o + "\n";
                            }
                            System.out.println(chain);

                            System.out.println(">> MENU CREACION <<\n");

                            System.out.println("1) Comprar Casas");
                            System.out.println("2) Comprar Edificios");
                            System.out.println("3) Comprar Solares");

                            System.out.print("Ingrese su Opcion de Registro: ");
                            terr = leer.nextInt();
                            System.out.println("=> La Opcion escojida de Registro es: " + terr);
                            System.out.println(" ");
                            ((Solares) lista.get(terr)).getDueño();
                        }
                    }

                }
                
                case 3: {// Login
                    int login;

                    System.out.println(">> MENU LOGIN <<\n");

                    System.out.println("1) LOG IN");
                    System.out.println("2) SIGN UP");
                    System.out.println("3) LOG OUT");

                    System.out.print("Ingrese su Opcion de Login: ");
                    login = leer.nextInt();
                    System.out.println("=> La Opcion escojida de Login es: " + login);
                    System.out.println(" ");

                    switch (login) {
                        case 1: {
                            listaUsar.add(newUser());
                        }
                        break;

                        case 2: {
                            String UserName;
                            String Contrasena;
                            boolean userfound = false;

                            leer.next();
                            System.out.println("Ingrese el nombre del User: ");
                            UserName = leer.nextLine();
                            leer.next();
                            System.out.println("Ingrese la Contraseña del User: ");
                            Contrasena = leer.nextLine();

                            for (int i = 0; i < listaUsar.size(); i++) {
                                if (listaUsar.get(i).equals(UserName) && listaUsar.get(i).equals(Contrasena)) {
                                    userfound = true;
                                    System.out.println(">> Ha podido ingresar!");
                                } else {
                                    userfound = false;
                                    break;
                                }

                            }

                        }
                    }

                }
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

    static Edificios newEdificios() {
        int numPisos;
        int cantLocales;
        String direccion;

        Edificios retorno;

        System.out.println("Ingrese el Numero de Pisos: ");
        numPisos = leer.nextInt();

        System.out.println("Ingrese el Numero de Locales: ");
        cantLocales = leer.nextInt();

        leer.next();

        System.out.println("Ingrese la direccion del Edificio: ");
        direccion = leer.nextLine();

        retorno = new Edificios(numPisos, cantLocales, direccion);
        return retorno;
    }

    static Solares newSolares() {
        double largo;
        double ancho;
        double area;
        String Dueño;

        Solares retorno;

        System.out.println("Ingrese el Largo de Solares: ");
        largo = leer.nextDouble();

        System.out.println("Ingrese el Ancho de Solares: ");
        ancho = leer.nextDouble();

        area = largo * ancho;
        System.out.println("El area es: " + area);

        leer.next();

        System.out.println("Ingrese el dueno del Edificio: ");
        Dueño = leer.nextLine();

        retorno = new Solares(largo, ancho, area, Dueño);
        return retorno;
    }

    static User newUser() {
        String nombre;
        int Edad;
        String UserName;
        String Contrasena;

        User retorno;

        leer.next();
        System.out.println("Ingrese el nombre de la Persona: ");
        nombre = leer.nextLine();

        System.out.println("Ingrese la Edad: ");
        Edad = leer.nextInt();

        leer.next();
        System.out.println("Ingrese el nombre del User: ");
        UserName = leer.nextLine();

        leer.next();
        System.out.println("Ingrese la Contrasena del User: ");
        Contrasena = leer.nextLine();

        retorno = new User(nombre, Edad, UserName, Contrasena);
        return retorno;
    }
}
