package Testing.Drill10;

public class drawPatch {

    public static void main(String[] args) {
        drawPatch drawPatch1 = new drawPatch();
        drawPatch(10, 7, '.', '-');
    }

    public static void drawPatch(int width, int height, char primary, char secondary) {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                if ((i + 2) % 2 == 0)
                    System.out.print(primary + " ");
                else
                    System.out.print(secondary + " ");
            }
            if (j < height - 1) {
                System.out.print("\n");
            }
        }
    }
}
