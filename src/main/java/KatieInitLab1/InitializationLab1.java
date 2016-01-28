package KatieInitLab1;

/**
 * Created by katie on 1/28/16.
 */
public class InitializationLab1 {
    public static void main(String[] args) {

        BoringThing boring1 = new BoringThing();
        BoringThing boring2 = new BoringThing();
        BoringThing boring3 = new BoringThing();
        BoringThing boring4 = new BoringThing();
        BoringThing boring5 = new BoringThing();
        ColorfulThing color1 = new ColorfulThing("mauve");
        ColorfulThing color2 = new ColorfulThing("lavender");
        ColorfulThing color3 = new ColorfulThing("tie-dye");
        ColorfulThing color4 = new ColorfulThing("pink Starburst");
        ColorfulThing color5 = new ColorfulThing("yellow");
        System.out.println(color1.getColor());
        System.out.println(color2.getColor());
        System.out.println(color3.getColor());
        System.out.println(color4.getColor());
        System.out.println(color5.getColor());
    }

}
