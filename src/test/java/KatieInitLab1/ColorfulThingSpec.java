package KatieInitLab1;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by katie on 1/28/16.
 */
public class ColorfulThingSpec {
    ColorfulThing testThing = new ColorfulThing("chartreuse");
    String getColorTest = testThing.getColor();
    @Test
    public void colorfulThingTest() {
       assertEquals(testThing.color, getColorTest);

    }
}
