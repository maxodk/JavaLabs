package knight;

public class Ammunition {
    protected double cost;
    protected double weight;
    protected String material;
    protected double strength;

    public Ammunition(double cost, double weight, String material, double strength) {
        this.cost = cost;
        this.weight = weight;
        this.material = material;
        this.strength = strength;
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
    public double ReturnCost()
    {
        //return this.cost * this.strength;
        return 2.0;
    }
}
