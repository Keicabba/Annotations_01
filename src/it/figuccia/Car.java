package it.figuccia;

public class Car {
    private String modelName;
    private int mileage;

    public Car(String modelName, int mileage) {
        this.modelName = modelName;
        this.mileage = mileage;
    }

    @Deprecated
    public void printCarDetails(){
        System.out.println("model: " + modelName + ", Mileage: " + mileage);

    }

    public void getCarDetails(){
        System.out.println("model: " + modelName + "\nMileage: " + mileage);
    }
}