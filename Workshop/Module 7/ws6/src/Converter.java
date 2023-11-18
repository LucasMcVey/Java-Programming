public class Converter {

    public static final double LITRES_TO_GALLONS = 0.26417;

    public static double convertLitresToGallons(double litres) {
        return LITRES_TO_GALLONS*litres;
    }

    public static double galloonsToLitres(double gallons) {
        return gallons /LITRES_TO_GALLONS;
    }
}
