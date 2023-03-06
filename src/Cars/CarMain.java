package Cars;

public class CarMain {

    public static void main(String[] args) {

        String car = "alfa romea";
        Car cocheObj = new CarHibrido();

        Car cocheObj2 = new CarElectric("rojo", "honda", "civic", 1430.45, 5.4, "motor");

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);

        CarElectric electricMotor = new CarElectric();

        carElectric.electricMotor = "ejemplo motor";
        carElectric.color = "blanco ";
        carElectric.fabricante = "Honda";
        carElectric.modelo = "civic";

        System.out.println(carElectric);

        CarElectric electricMotor2 = new CarElectric("blue", "beta", "romeo", 1500d, 4.99, "TEXT");


        System.out.println(carElectric2);

        carElectric2.acelerar(50);

        System.out.println(carElectric2);

    }
}
