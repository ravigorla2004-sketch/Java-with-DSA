class Vehicle{
    Vehicle(){
         System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle{
    FourWheeler(){
        System.out.println("4 Wheeler Vehicles");
    }
}
class car extends FourWheeler{
    car(){
         System.out.println("This 4 Wheeler is a Car");
    }
}
public class Main {
    public static void main(String[] args){
        car obj = new car();
    }
}


Output:-
This is a Vehicle
4 Wheeler Vehicles
This 4 Wheeler is a Car
