package practical09;

public class Task {

   public static void main(String[] args) {
      VehicleDB db = new VehicleDB() ;
      db.addVehicle(new Car(1200,"Holden" ,"sedan" ,"Barina"));
      db.addVehicle(new Vehicle(1500,"Mazda"));
      db.print();
   }
}