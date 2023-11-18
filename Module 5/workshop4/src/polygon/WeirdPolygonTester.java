package polygon;

public class WeirdPolygonTester {
    public static void main(String[] args) {
        WeirdPolygon wp1 = new WeirdPolygon(3);
        wp1.makeSmaller();

        System.out.println(wp1.getDescription());
    }
}
