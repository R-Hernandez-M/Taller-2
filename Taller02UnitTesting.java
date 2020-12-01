import java.util.Scanner;
import java.lang.Math;
public class Taller02UnitTesting {
    public static void main(String[] args) {
        generador_arreglo();
    }
    public static double[][] generador_arreglo (){
        Scanner scan=new Scanner(System.in);
        int N;
        do{
            try{
                System.out.println("Introduzca la cantidad de días");
                N=scan.nextInt();
                if (N <= 0){
                    throw new IllegalArgumentException("Cantidad de días debe ser un número natural.");
                }
                break;
            }
            catch(Exception e){
                System.out.println("Ese número no es válido.\n Por favor, ingrese un número natural");
                scan.nextLine();

            }
            finally {
                System.out.println("..................");
            }

        } while(true);

        double [][] registrosSismicos=new double[N][24];
        for (int i=0;i<N;i++){
            System.out.println(i);
            for (int j=0;j<24;j++){
                System.out.println(j);
                registrosSismicos[i][j]=Math.random()*9.5;
            }

        }
        return registrosSismicos;
    }

}
