package practical07;

public class ArrayTask {

        public static void main(String[] args) {
            IntList list1 = new IntList();
            list1.printList();
            list1.insertAtEndofList(42);
            list1.printList();
            list1.insertAtEndofList(2);
            list1.printList();
            list1.getElementAt(3);
            list1.getElementAt(-1);
            list1.getElementAt(1);
            list1.insertAtEndofList(7);
            list1.insertAtEndofList(9);
            list1.printList();
            list1.insertAtEndofList(100);
        }

        public static class IntList {
            int listLength = 0;
            int index;
            int[] intList = new int[4];

        public void printList() {
            if (listLength == 0) {
                System.out.println("List is empty");
            } else {
                System.out.println("Printing list...");
                for (int i = 0; i < listLength; i++) {
                    System.out.println("Element " + i + " = " + intList[i]);
                }
            }
        }

        public void insertAtEndofList(int n) {
            listLength += 1;
            index = listLength - 1;
            if (index > 3) {
                System.out.println("Insertion of " + n + " failed");
            } else {
                intList[index] = n;
                System.out.println(n + " inserted");

            }
        }

        public void getElementAt(int t)
            {
                if(t>listLength||t<0)
                {
                    System.out.println("Invalid index: " +t);
                    System.out.println("0");
                }
                else
                {
                    index = t;
                    System.out.println(intList[index]);
                }
        }
    }
}
