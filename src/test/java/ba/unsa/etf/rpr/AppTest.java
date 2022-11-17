package ba.unsa.etf.rpr;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void JSONDatTest() throws IOException, NeodgovarajuciProcesorException {
        Laptop laptop = new Laptop("hp", "gaming",3499.99,32,1024,0," nesto","nvidia",15.6);
        LaptopDao proba = new LaptopDaoJSONFile();
        proba.dodajLaptopUFile(laptop);
        assertEquals(3499.99, proba.getLaptop(" nesto").getCijena());
    }


}
