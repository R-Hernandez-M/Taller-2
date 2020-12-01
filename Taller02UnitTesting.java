import org.junit.Test;
import java.lang.Math;
import java.text.BreakIterator;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class Taller02UnitTesting {
    public static double[] encontrar_mayor(double[][] array) {
        double dia_mayor = 0;
        double hora_mayor = 0;
        double temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i][j] > array[i][j + 1]) {
                    temp = array[i][j];
                    array[i][j] = array[i][j + 1];
                    array[i][j + 1] = temp;
                    dia_mayor = i;
                    hora_mayor = j;
                }
            }
        }
        double mayores[] = {temp, dia_mayor, hora_mayor};
        return mayores;
    }


    public static void main(String[] args) {
        menu();
    }

    public static double[][] generador_arreglo() {
        Scanner scan = new Scanner(System.in);
        int N;
        do {
            try {
                System.out.println("Introduzca la cantidad de días");
                N = scan.nextInt();
                if (N <= 0) {
                    throw new IllegalArgumentException("Cantidad de días debe ser un número natural.");
                }
                break;
            } catch (Exception e) {
                System.out.println("Ese número no es válido.\n Por favor, ingrese un número natural");
                scan.nextLine();

            } finally {
                System.out.println("..................");
            }

        } while (true);

        double[][] registrosSismicos = new double[N][24];
        for (int i = 0; i < N; i++) {
            System.out.println(i);
            for (int j = 0; j < 24; j++) {
                System.out.println(j);
                registrosSismicos[i][j] = Math.random() * 9.5;
            }

        }
        return registrosSismicos;
    }

    public static int sismos_fuertes(double[][] array) {
        int contador = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i][j] >= 5.5) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static Boolean escalada_sismica(double[][] array) {
        int yay = 0;
        boolean sismos_brigidos = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i][j] >= 6) {
                    yay++;
                    if (yay >= 4) {
                        System.out.println("hubo una escalada sismica el dia " + i);
                        sismos_brigidos = true;
                    } else {
                        sismos_brigidos = false;
                    }
                }
            }
        }
        return sismos_brigidos;
    }

    public static void menu() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. encontrar mayor 1");
            System.out.println("2. sismo mayor 2");
            System.out.println("3. escaladas sismicas 3");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            if (opcion == 1) {
                double[] datos = encontrar_mayor(generador_arreglo());
                double big_sismo = datos[0];
                double big_dia = datos[1];
                double big_hora = datos[2];
                System.out.printf("el sismo de mayor magnitud fue %f%n \n" + "el dia %f%n \n" + "en la hora %f%n", big_sismo, big_dia, big_hora);
            } else if (opcion == 2) {
                int poder = sismos_fuertes(generador_arreglo());
                System.out.printf("se registraron %d%n dias donde hubo un sismo mayor a 5.5 en la escala de Richter\n", poder);

            } else if (opcion == 3) {
                escalada_sismica(generador_arreglo());
            } else if (opcion == 4)
                System.out.println("saliendo del sistema, gracias por utilizar nuestro programa");
            salir = true;
        }


    }
}