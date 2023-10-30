package UD21_Geometria.UD21_Geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import UD21_Geometria.dto.Geometria;

public class GeometriaTest {
    private Geometria geometria;

    @BeforeEach
    public void before() {
        geometria = new Geometria();
    }

    @AfterEach
    public void after() {
        geometria = null;
    }

    @Test
    public void testAreaCuadrado() {
        int lado = 4;
        int expectedArea = lado * lado;
        assertEquals(expectedArea, geometria.areacuadrado(lado));
    }

    @Test
    public void testAreaCirculo() {
        int radio = 5;
        double expectedArea = Math.PI * radio * radio;
        assertEquals(expectedArea, geometria.areaCirculo(radio), 0.001);
    }

    @Test
    public void testAreaTriangulo() {
        int base = 6;
        int altura = 8;
        int expectedArea = (base * altura) / 2;
        assertEquals(expectedArea, geometria.areatriangulo(base, altura));
    }

    @Test
    public void testAreaRectangulo() {
        int base = 5;
        int altura = 10;
        int expectedArea = base * altura;
        assertEquals(expectedArea, geometria.arearectangulo(base, altura));
    }

    @Test
    public void testAreaPentagono() {
        int perimetro = 20;
        int apotema = 4;
        int expectedArea = (perimetro * apotema) / 2;
        assertEquals(expectedArea, geometria.areapentagono(perimetro, apotema));
    }

    @Test
    public void testAreaRombo() {
        int diagonalMayor = 8;
        int diagonalMenor = 6;
        int expectedArea = (diagonalMayor * diagonalMenor) / 2;
        assertEquals(expectedArea, geometria.arearombo(diagonalMayor, diagonalMenor));
    }

    @Test
    public void testAreaRomboide() {
        int base = 5;
        int altura = 8;
        int expectedArea = base * altura;
        assertEquals(expectedArea, geometria.arearomboide(base, altura));
    }

    @Test
    public void testAreaTrapecio() {
        int baseMayor = 10;
        int baseMenor = 6;
        int altura = 4;
        int expectedArea = ((baseMayor + baseMenor) / 2) * altura;
        assertEquals(expectedArea, geometria.areatrapecio(baseMayor, baseMenor, altura));
    }

    @Test
    public void testGetId() {
        int id = 42;
        geometria.setId(id);
        assertEquals(id, geometria.getId());
    }

    @Test
    public void testGetNom() {
        String nombre = "Cuadrado";
        geometria.setNom(nombre);
        assertEquals(nombre, geometria.getNom());
    }

    @Test
    public void testGetArea() {
        double area = 25.0;
        geometria.setArea(area);
        assertEquals(area, geometria.getArea(), 0.001);
    }
    
    @Test
    public void testToString() {
    	geometria = new Geometria(1);
        double area = 16.0;
        int id = 1;
        String nombre = "cuadrado";
        geometria.setArea(geometria.areacuadrado(4));
        
        String expectedToString = "Geometria [id=" + id + ", nom=" + nombre + ", area=" + area + "]";
        assertEquals(expectedToString, geometria.toString());
    }
    
    @Test
    public void testFigura() {
        Geometria geometria = new Geometria();

        assertEquals("cuadrado", geometria.figura(1));
        assertEquals("Circulo", geometria.figura(2));
        assertEquals("Triangulo", geometria.figura(3));
        assertEquals("Rectangulo", geometria.figura(4));
        assertEquals("Pentagono", geometria.figura(5));
        assertEquals("Rombo", geometria.figura(6));
        assertEquals("Romboide", geometria.figura(7));
        assertEquals("Trapecio", geometria.figura(8));
        assertEquals("Default", geometria.figura(9)); // Prueba con un valor no válido
    }
    
}
