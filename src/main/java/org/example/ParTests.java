package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParTests {
    @Test
    public void VerificarNumeroParReal() {
        // Arrange
        int number = 2;

        // Act
        boolean esPar = Functions.esPar(number);

        // Assert
        Assertions.assertTrue(esPar);
    }

    @Test
    public void VerificarNumeroParFalso() {
        // Arrange
        int numero = 1;
        // Act
        boolean esPar = Functions.esPar(numero);
        // Assert
        Assertions.assertFalse(esPar);
    }

    @Test
    public void VerificarNumeroParGrande(){
        int numero = Integer.MAX_VALUE;
        boolean esPar = Functions.esPar(numero);
        Assertions.assertFalse(esPar);
    }

    @Test
    public void VerificarNumeroParNegativo() {
        // Arrange
        int number = -2;
        // Act
        boolean esPar = Functions.esPar(number);
        // Assert
        Assertions.assertTrue(esPar);
    }

    @Test
    public void VerificarNumeroParCero() {
        // Arrange
        int number = 0;

        // Act
        boolean esPar = Functions.esPar(number);

        // Assert
        Assertions.assertTrue(esPar);
    }

    @Test
    public void VerificarNumeroParPrimo() {
        // Arrange
        int number = 3;

        // Act
        boolean esPar = Functions.esPar(number);

        // Assert
        Assertions.assertFalse(esPar);
    }

    @Test
    public void VerificarNumeroParGrandePeroNoMax() {
        // Arrange
        int number = 1000000000;

        // Act
        boolean esPar = Functions.esPar(number);

        // Assert
        Assertions.assertTrue(esPar);
    }

    @Test
    public void VerificarNumeroParConDigitosCeroYNoCero() {
        // Arrange
        int number = 1024;

        // Act
        boolean esPar = Functions.esPar(number);

        // Assert
        Assertions.assertTrue(esPar);
    }

    @Test
    public void VerificarNumeroParConDigitosRepetidos() {
        // Arrange
        int number = 2222;

        // Act
        boolean esPar = Functions.esPar(number);

        // Assert
        Assertions.assertTrue(esPar);
    }

    @Test
    public void VerificarNumeroParEnCadena() {
        // Arrange
        String numberString = "2";

        // Act
        int number = Integer.parseInt(numberString);
        boolean esPar = Functions.esPar(number);

        // Assert
        Assertions.assertTrue(esPar);
    }
}
