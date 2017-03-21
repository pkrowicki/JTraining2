public class Main {

    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("WhiteWizard", "LG", "DarkWater", dimensions);

        Monitor monitor = new Monitor("ClearDisplay", "Eizo", 27, new Resolution(1920, 1080));

        Motherboard motherboard = new Motherboard("Asus", "Asus", 3, 6, "v2.57");

        PC thePC = new PC(theCase,monitor,motherboard);
        thePC.powerUp();

    }
}
