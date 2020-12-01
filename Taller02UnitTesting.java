import org.junit.Test;
import java.lang.Math;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class Taller02UnitTesting {
    public int encontrar_mayor(int[]array){
        int dia_mayor;
        int hora_mayor;
        int temp;
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length -i-1;j++){
                if (array[j] > array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    dia_mayor=i;
                    hora_mayor=j;

                }
            }
        }
        if (dia_mayor<1){


        }
    }
}
}
