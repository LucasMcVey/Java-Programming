package Testing.Drill10;

public class Vehicle {
        int wheels;
        String make;
        String color;

        public Vehicle(String make) {
            this.make = 'make';
            this.color = "Blue";
            this.wheels = 4;
            System.out.println("Vehicle object created.");
        }

        public Vehicle(String make, String color) {
            this.make = make;
            this.color = color;
            this.wheels = 4;
            System.out.println("Vehicle object created.");
        }



        public Vehicle(String make, String color,int wheels){
            this.make = make;
            this.color = color;
            this.wheels = wheels;
            System.out.println("Vehicle object created.");
        }

        String aboutMe()
        {
            String msg;
            msg = "  Make: "+make+"\n";
            msg+= "  Colour: "+color+"\n";
            msg+= "  Wheels: "+wheels;
            return msg;
        }


    static class VehicleTest {

        public static void main(String[] args) {

            int wheels=4;
            String make="Mercedes";
            String color="Pink";

            Vehicle v1=new Vehicle(make);
            System.out.println(v1.aboutMe());

            Vehicle v2=new Vehicle(make,color);
            System.out.println(v2.aboutMe());

            Vehicle v3=new Vehicle(make,color,wheels);
            System.out.println(v3.aboutMe());


        }

    }
  }

