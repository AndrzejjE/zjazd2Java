package zad15;

class Vehicle {
    private int passengers;
    private int fuelcap;
    private double lkm;
    private String type;
    private int distance;

    public Vehicle(String type, int passengers, int fuelcap, double lkm, int distance) {
        setVeh(type, passengers, fuelcap, lkm, distance);
    }
    public Vehicle(){
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public double getLkm() {
        return lkm;
    }

    public void setLkm(double lkm) {
        this.lkm = lkm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setVeh(String type, int passengers, int fuelcap, double lkm, int distance) {
        this.setPassengers(passengers);
        this.setFuelcap(fuelcap);
        this.setLkm(lkm);
        this.setType(type);
        this.setDistance(distance);
    }
    public void range() {
        System.out.println(getType() + "przwozi " + getPassengers() + " osób na odległość do " + (int) (getFuelcap() / getLkm() * 100) + " kilometrów");
    }
    public void need() {
        System.out.println(getType() + " potrzebuje " + (float) ((getDistance() * getLkm()) / 100)+ " litrów paliwa.");
    }

}

public class VehicleProg4 {
    public static void main(String[] args){
        Vehicle miniVan = new Vehicle( "Minivan ", 7,70,10.7,355);
        Vehicle sportsCar = new Vehicle("Auto sportowe ",2,74,17,355);

        miniVan.range();
        sportsCar.range();
        miniVan.need();
        sportsCar.need();
    }
}
