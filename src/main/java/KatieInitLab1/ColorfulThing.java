package KatieInitLab1;

/**
 * Created by katie on 1/28/16.
 */
enum Color{
    MAUVE, LAVENDER, TIEDYE, PINKSTARBURST, YELLOW
}

public class ColorfulThing {
    Color color;
    public ColorfulThing(Color color){
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }
}
