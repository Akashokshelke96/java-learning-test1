package ClassesLearn;

public class Car {
    String brandName;
    String modelName;
    int modelYear;

    public Car(String brand, String model, int year) {
        brandName = brand;
        modelName = model;
        modelYear = year;
    }

    public String getPrice() {
        if (brandName.equals("Tata")){
            return "28 lakh";
        }
        else if (brandName.equals("BMW")){
            return "52 lakh";

        }
        else if (brandName.equals("AstonMartin")){
            return "3 crore";
        }
        else{
            return "Out of Range";
        }
    }
}

