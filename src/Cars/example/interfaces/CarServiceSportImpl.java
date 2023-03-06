package Cars.example.interfaces;

import Cars.Car;
import Cars.CarElectric;

public class CarServiceSportImpl implements CarService {

    @Override
    public Car crearCocheDemo() {
        System.out.println("creando coche de carreras");
        return new CarElectric();
    }

    @Override
    public void destruirCoche(Car coche) {

    }
}
