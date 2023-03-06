package Cars.example.interfaces;

import Cars.Car;
import Cars.CarElectric;

public class CarServiceClassicImpl implements CarService {
    @Override
    public Car crearCocheDemo() {
        System.out.println("creando coche clasico");
        return new CarElectric();
    }

    @Override
    public void destruirCoche(Car coche) {
        System.out.println("Destruyindo coche");
    }
}
