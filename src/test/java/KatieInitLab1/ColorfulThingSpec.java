package KatieInitLab1;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by katie on 1/28/16.
 */
public class ColorfulThingSpec {
    ColorfulThing testThing = new ColorfulThing(Color.TIEDYE);
    String getColorTest = testThing.getColor().toString();
    @Test
    public void colorfulThingTest() {
       assertEquals("TIEDYE", getColorTest);

    }
}
