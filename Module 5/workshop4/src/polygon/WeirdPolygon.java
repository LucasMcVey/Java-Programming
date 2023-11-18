package polygon;

public class WeirdPolygon {
    private int sides;
    private String name;
    private boolean valid = false;

    public WeirdPolygon(int s) {
        sides = s;
        checkValidity();
        updateName();
    }

    private void checkValidity() {
//        if (sides < 3) {
//            valid = false;
//        }
//        else {
//            valid = true;
//        }
        valid = (sides >= 3);
    }

    private void updateName() {
        if (!valid) {
            name = "Impossible Polygon!";
        }
        else {
            if (sides == 3) {
                name = "Triangle";
            } else if (sides == 4) {
                name = "Quadrilateral";
            } else if (sides == 5) {
                name = "Pentagon";
            } else if (sides > 5) {
                name = "Circle";
            }
        }
    }

    public String getDescription() {
        return name + " (" + sides + " sides)";
    }

    public void makeBigger() {
        sides++;
        checkValidity();
        updateName();
    }

    public void makeSmaller() {
        sides--;
        checkValidity();
        updateName();
    }

}
