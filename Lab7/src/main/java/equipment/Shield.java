package equipment;

public class Shield extends Equipment{
    private boolean isCrooked;
    private double protection;


    public Shield(double cost, double weight, String material, double strength,boolean isCrooked,double sharpness) {
        super(cost, weight, material, strength);
        this.isCrooked = isCrooked;
        this.protection = sharpness;
    }

    public boolean isCrooked() {
        return isCrooked;
    }

    public void setCrooked(boolean crooked) {
        isCrooked = crooked;
    }

    public double getSharpness() {
        return protection;
    }

    public void setSharpness(double sharpness) {
        this.protection = sharpness;
    }

    @Override
    public String toString() {
        return "Shield{" +
                "isCrooked=" + isCrooked +
                ", protection=" + protection +
                ", cost=" + cost +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", strength=" + strength +
                '}';
    }
}

