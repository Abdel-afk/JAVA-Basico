package Cars;

public class CarElectric extends Car {

    String electricMotor;

    public ElectricMotor() {

    }

    public CarElectric(String electricMotor) {

        this.electricMotor = electricMotor;
    }

    public CarElectric(String color, String fabricante, String modelo, String peso, String largo, String electricMotor) {
        super(color, fabricante, modelo, peso, largo);
        this.electricMotor = electricMotor;
    }

    @Override
    public String toString() {
        return "CarElectric{" +
                "electricMotor='" + electricMotor + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
