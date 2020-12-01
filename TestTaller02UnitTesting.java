import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.Math;
import org.junit.BeforeClass;


import java.util.Scanner;
public class TestTaller02UnitTesting {
    @Before public void testing() {
        Taller02UnitTesting tester = new Taller02UnitTesting();
        int N = 10;
        double[][] registrosSismicos = new double[N][24];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 24; j++) {
                registrosSismicos[i][j] = Math.random() * 9.5;
            }

        }
    }

    @Test
    public void test_encontrar_mayor(){
        Taller02UnitTesting tester = new Taller02UnitTesting();
        int N = 10;
        double[][] registrosSismicos = new double[N][24];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 24; j++) {
                registrosSismicos[i][j] = Math.random() * 9.5;
            }
        }
        double [] mayor=tester.encontrar_mayor(registrosSismicos);
        System.out.println(mayor[0]);
        for (int i=0;i<registrosSismicos.length;i++) {
            for (int j = 0; j < registrosSismicos[i].length; j++) {
                System.out.println(registrosSismicos[i][j]);

            }
        }

        for (int i=0;i<registrosSismicos.length;i++){
            for (int j=0;j<registrosSismicos[i].length;j++){

                assertTrue(registrosSismicos[i][j]<=mayor[0]);
            }
        }
    }

    @Test
    public void test_sismos_fuertes(){
        Taller02UnitTesting tester = new Taller02UnitTesting();
        int N = 10;
        double[][] registrosSismicos = new double[N][24];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 24; j++) {
                registrosSismicos[i][j] = Math.random() * 9.5;
            }
        }
        tester.sismos_fuertes(registrosSismicos);
    }
    @Test
    public void test_escalada_sismica(){
        Taller02UnitTesting tester = new Taller02UnitTesting();
        int N = 10;
        double[][] registrosSismicos = new double[N][24];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 24; j++) {
                registrosSismicos[i][j] = Math.random() * 9.5;
            }
        }
        boolean test_true=tester.escalada_sismica(registrosSismicos);
        int counter=0;
        boolean escalada=false;
        for (int i=0;i<registrosSismicos.length;i++){
            for (int j=0;j<registrosSismicos[i].length;j++){
                if (registrosSismicos[i][j]>=6){
                    counter++;
                }
            }
        }
        if (counter>3){
            escalada=true;
        }
        assertTrue(escalada==test_true);
    }
}
