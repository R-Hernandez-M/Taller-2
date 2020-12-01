import org.junit.Test;
import java.lang.Math;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class Taller02UnitTesting {
    public static int encontrar_mayor(int[] array) {
        int dia_mayor;
        int hora_mayor;
        int temp;
        int mayor;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    dia_mayor = i;
                    hora_mayor = j;
                    mayor=array[j];

                }
                array[j + 1] = temp;
                dia_mayor = i+1;
                hora_mayor = j+1;

            }
        }


        return dia_mayor;
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

}

