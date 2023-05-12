package simulation;

import java.util.ArrayList;
import java.util.List;

public class Values  {
    public static double NaPermeability;
    public static double NaExtracellularConcentration;
    public static double NaIntracellularConcentration;
    public static double potassiumPermeability;
    public static double potassiumExtracellularConcentration;
    public static double potassiumIntracellularConcentration;
    public static double chloridePermeability;
    public static double ClExtracellularConcentration;
    public static double ClIntracellularConcentration;
    public static double temperature;
    public static List<Double> NaPotential = new ArrayList<>();
    public static List<Double> chloridePotential = new ArrayList<>();
    public static List<Double> potassiumPotential = new ArrayList<>();
    public static List<Double> overallPotential = new ArrayList<>();

    public Values(){
    }
}
