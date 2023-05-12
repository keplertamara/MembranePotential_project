package simulation;
public class NerstEquations {
    public static double sodiumPotential() {
        double RTF = 8.31 * (273.15 + Values.temperature) / 96485.3399;
        double insideOverOutside = Values.NaIntracellularConcentration / Values.NaExtracellularConcentration;
        double value = -RTF * Math.log(insideOverOutside) * 1000;
        return Math.round(value * 100.0) / 100.0;
    }
    public static double potassiumPotential(){
        double RTF = 8.31 * (273.15 + Values.temperature) / 96485.3399;
        double insideOverOutside = Values.potassiumIntracellularConcentration / Values.potassiumExtracellularConcentration;
        double value =  -RTF  * Math.log(insideOverOutside) * 1000;
        return Math.round(value * 100.0) / 100.0;
    }
    public static double chloridePotential(){
        double RTF = 8.31 * (273.15 + Values.temperature) / 96485.3399;
        double insideOverOutside = Values.ClIntracellularConcentration / Values.ClExtracellularConcentration;
        double value =  RTF * Math.log(insideOverOutside) * 1000;
        return Math.round(value * 100.0) / 100.0;
    }
    public static double membranePotential(){
        double RTF = 8.31 * (273.15 + Values.temperature) / 96485.3399;
        double sodiumPart = Values.NaPermeability * Values.NaExtracellularConcentration / (Values.NaPermeability * Values.NaExtracellularConcentration + Values.potassiumPermeability * Values.potassiumExtracellularConcentration + Values.chloridePermeability * Values.ClIntracellularConcentration);
        double potassiumPart = Values.potassiumPermeability * Values.potassiumExtracellularConcentration / (Values.NaPermeability * Values.NaExtracellularConcentration + Values.potassiumPermeability * Values.potassiumExtracellularConcentration + Values.chloridePermeability * Values.ClIntracellularConcentration);
        double chloridePart = Values.chloridePermeability * Values.ClIntracellularConcentration / (Values.NaPermeability * Values.NaExtracellularConcentration + Values.potassiumPermeability * Values.potassiumExtracellularConcentration + Values.chloridePermeability * Values.ClIntracellularConcentration);
        double logPart = Math.log(sodiumPart * Values.NaIntracellularConcentration / Values.NaExtracellularConcentration + potassiumPart * Values.potassiumIntracellularConcentration / Values.potassiumExtracellularConcentration + chloridePart * Values.ClExtracellularConcentration / Values.ClIntracellularConcentration);
        double value =  -RTF * logPart * 1000;
        return Math.round(value * 100.0) / 100.0;
    }
}
