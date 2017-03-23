import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("WhiteWizard", "LG", "DarkWater", dimensions);

        Monitor monitor = new Monitor("ClearDisplay", "Eizo", 27, new Resolution(1920, 1080));

        Motherboard motherboard = new Motherboard("Asus", "Asus", 3, 6, "v2.57");

        PC thePC = new PC(theCase,monitor,motherboard);
        thePC.powerUp();

        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
            intArray.add(Integer.valueOf((int)Math.pow(8,i)));
        }
        for (int i=0;i<intArray.size();i++){
            System.out.println(intArray.get(i).intValue());
        }

        Integer myIntV = 56; // Auto complete by Java to Integer.valueOf(56);
        int mySecondIng = myIntV;  // Again auto completed by Java, myIntV.intValue();

        ArrayList<Double> dblArr =new ArrayList<Double>();
        for(double dbl=0d;dbl<=10d;dbl+=0.5){
            dblArr.add(Double.valueOf(dbl));
        }

        for(int i = 0; i<dblArr.size();i++){
            double value = dblArr.get(i).doubleValue();
            System.out.println((i+1)+ " -> " + value);
        }
    }
}
