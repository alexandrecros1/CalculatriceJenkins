package calculatricejenkins;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatriceJenkinsIT {

    @Test
    public void testAddition() {
        // Given
        Calculatrice calculatrice = new Calculatrice();
        // When
        int resultat = calculatrice.addition(2, 2);
        // Then
        if (resultat != 4) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }

    @Test
    public void testSoustraction() {
        Calculatrice calculatrice = new Calculatrice();
        Assert.assertEquals(0, calculatrice.soustraction(2, 2));
    }

    @Test
    public void testDivision() {
        Calculatrice calculatrice = new Calculatrice();
        Assert.assertEquals(2, calculatrice.division(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionWillThrowExceptionWhenDivideOnZero() {
        Calculatrice calculatrice = new Calculatrice();
        calculatrice.division(6, 0);
    }

    @Test
    public void testMultiplication() {
        Calculatrice calculatrice = new Calculatrice();
        Assert.assertEquals(6, calculatrice.multiplication(2, 3));
    }
}
