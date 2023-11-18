package practical03;

import java.util.Scanner;

public class Biscuits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biscuits = 0, packets = 0, boxes = 0, extraBiscuits = 0, extraPackets = 0;

        System.out.println("Enter an amount of biscuits: ");
        biscuits = input.nextInt();

        packets = biscuits /12;
        boxes = packets /30;
        extraPackets = packets % 30;
        extraBiscuits = biscuits % 12;

        if (packets > 0)
        {
            System.out.print("There are " + packets + " packets of biscuits: ");
        }
        if (boxes == 1)
        {
            System.out.print( boxes + " box with ");
        }
        if (boxes > 1)
        {
            System.out.print( boxes + " boxes with ");
        }
        if (extraPackets > 1)
        {
            System.out.print(extraPackets + " leftover packets and ");
        }
        if (extraPackets == 1)
        {
            System.out.print(extraPackets + " leftover packet and ");
        }
        if (extraPackets == 0)
        {
            System.out.print("no leftover packets and ");
        }
        if (extraBiscuits > 1)
        {
            System.out.print(extraBiscuits + " leftover biscuits.");
        }
        if (extraBiscuits == 1)
        {
            System.out.print(extraBiscuits + " leftover biscuit.");
        }
        if (extraBiscuits == 0)
        {
            System.out.print("no leftover biscuits.");
        }










    }

}
