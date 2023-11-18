package practical09;

public class Vehicle {  // base class

   int capacity;
   String make;
   Vehicle(int theCapacity, String theMake) {
      capacity = theCapacity;
      make = theMake;
   }

   void setCapacity(int newCapacity)
   {
      capacity = newCapacity;
      System.out.println("New capacity = "+capacity);
   }

   void print() {
      System.out.println("Vehicle Info:");
      System.out.println(" capacity = " + capacity + "cc" );
      System.out.println(" make = " + make );
   }
}

