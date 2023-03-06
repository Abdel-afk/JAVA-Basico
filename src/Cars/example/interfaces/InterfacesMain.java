package Cars.example.interfaces;

import Cars.Car;

public class InterfacesMain {

    public static void main(String[] args) {

        CarService service1 = new CarServiceClassicImpl();

        Car coche1 = service1.crearCocheDemo();


    }
}
