package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.operDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillup();
        gasCar.operDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogenCCar();
        hydrogenCar.operDoor();
    }
}
