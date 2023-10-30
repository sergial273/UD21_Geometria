package UD21_Geometria.UD21_Geometria;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import UD21_Geometria.App;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void before() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void after() {
        System.setOut(originalOut);
        outContent.reset();
    }
    
    @Test
    public void testAppMain() {
    	@SuppressWarnings("unused")
		App n = new App();
        App.main(new String[]{});
        String expectedOutput = "Geometria [id=2, nom=Circulo, area=12.5664]\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
