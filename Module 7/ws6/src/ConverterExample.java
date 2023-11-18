public class ConverterExample {
    public static void main(String[] args) {
        double litres = 10;
        System.out.println(litres + " litres is " +
                Converter.convertLitresToGallons(litres) + " gallons.");
    }
}
