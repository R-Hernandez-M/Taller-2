import org.junit.Test;
import java.lang.Math;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class Taller02UnitTesting {
    public static double[] encontrar_mayor(double[][] array) {
        double dia_mayor;
        double hora_mayor;
        double temp;
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
        generador_arreglo();
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
                if (array[i][j] >= 5.5){
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void escalada_sismica(double[][] array) {
        int yay=0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i][j] >= 6){
                    yay++;
                    if (yay>=4){
                        System.out.println("hubo una escalada sismica el dia "+i);
                    }
                }
            }
        }
    }
    public static void menu(double[][] array){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while(!salir){

            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            if (opcion==1){
                System.out.printf("el sismo de mayor magnitud fue %d \n"+)
            }
        }

    }

}
