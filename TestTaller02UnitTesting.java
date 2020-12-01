import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

import java.io.InputStream;
import java.lang.Math;
import org.junit.BeforeClass;
import sun.jvm.hotspot.utilities.IntArray;

import java.util.Scanner;
public class TestTaller02UnitTesting {
    @Before public void antes(){
        Taller02UnitTesting tester=new Taller02UnitTesting();
        double [][] arreglo=tester.generador_arreglo();
    }
    @Test
    public void test_generador_arreglo(){
        Taller02UnitTesting tester=new Taller02UnitTesting();
        int dias=15;
        InputStream in=new ;
        System.setIn(in);
        double [][] arreglo=tester.generador_arreglo();
        for (int i=0;i< arreglo.length;i++){
            for (int j=0;j<arreglo[i].length;j++){
                assertTrue(arreglo[i][j]<0.0 || arreglo[i][j]>9.5);
            }
        }
    }

}
