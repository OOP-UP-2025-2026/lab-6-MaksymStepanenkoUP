import Cellular.Cellular;
import GPS.GPS;

public class Smartphone implements GPS, Cellular {
    private double x;
    private double y;

    public Smartphone(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double[] getCoordinates() {
        return new double[] {x, y};
    }

    @Override
    public void makeCall() {
        System.out.println("Виклик");
    }

    @Override
    public void receiveCall() {
        System.out.println("Завершення");
    }
}
