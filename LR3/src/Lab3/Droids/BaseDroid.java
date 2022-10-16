package Lab3.Droids;

public class BaseDroid {
    public int health;
    public int damage;
    public int time_attack;
    public int crit;
    public BaseDroid(int health, int damage, int time_attack,int crit) {
        this.health = health;
        this.damage = damage;
        this.time_attack = time_attack;
        this.crit = crit;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getTime_attack() {
        return time_attack;
    }

    public void setTime_attack(int time_attack) {
        this.time_attack = time_attack;
    }
}
