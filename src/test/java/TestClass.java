import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    Calculator ob = new Calculator();

    @Test
    public void twoPlustwoFour()
    {
        assertEquals(4,ob.adder(2,2));

    }

    @Test
    public void twoPlusThreeNotFour()
    {
        assertEquals(5,ob.adder(2,3));
    }

}
