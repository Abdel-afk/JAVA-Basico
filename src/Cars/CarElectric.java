package Cars;

public class CarElectric extends Car {

    String ElectricMotor;

    public electricMotor() {

    }

    public CarElectric(String electricMotor) {

        this.electricMotor = electricMotor;
    }

    @Override
    public String toString() {
        return "CarElectric{" +
                "ElectricMotor='" + ElectricMotor + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
