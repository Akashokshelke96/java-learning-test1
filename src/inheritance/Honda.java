package inheritance;

public class Honda extends Car{


    @Override
    public void printName(String carName, String brand) {
        super.printName(carName, brand);
    }

    public static void main(String[] args) {
         String car = " S2000 ";
         String brand = "Honda";
        Honda h = new Honda();
        h.printName(car,brand);
    }
}
