package Cars;

public class PolimorfismoMain {

    public static void main(String[] args) {


        Car coche1 = new Car();

        CarElectric coche2 = new CarElectric();

        CarHibrido coche3 = new CarHibrido();

        // polimorfismo

        Car coche4 = new CarElectric();

        Car coche5 = new CarHibrido();

        if (coche4 instanceof Car) {
            System.out.println("coche electrico");
        }

        if (coche4 instanceof CarElectric) {
            System.out.println("coche electrico");
        }

        if (coche4 instanceof CarHibrido) {
            System.out.println("coche electrico");
        }


    }
}
