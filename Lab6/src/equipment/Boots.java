package equipment;

public class Boots extends Equipment {
    private boolean isGaiters;
    public Boots(double cost, double weight, String material, double strength,boolean isGaiters) {
        super(cost, weight, material, strength);
        this.isGaiters = isGaiters;
    }

    public boolean isGaiters() {
        return isGaiters;
    }

    public void setGaiters(boolean gaiters) {
        isGaiters = gaiters;
    }

    @Override
    public String toString() {
        return "Boots{" +
                "isGaiters=" + isGaiters +
                ", cost=" + cost +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", strength=" + strength +
                '}';
    }
}
