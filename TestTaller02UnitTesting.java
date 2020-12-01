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
    @Before public void initial(){
        Taller02UnitTesting tester = new Taller02UnitTesting();
        double [][] arreglo=tester.generador_arreglo();
    }
    @Test
    public void test_generador_arreglo(){
        
    }

}
