package Lab3.Droids;

public class AlterDroids extends BaseDroid{
    public AlterDroids(int health, int damage, int time_attack,int crit) {
        super(health,damage,time_attack,crit);
    }
    private int type;
    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    private int health_regen = 0;

    public int getHealth_regen() {
        return health_regen;
    }

    public void setHealth_regen(int health_regen) {
        this.health_regen = health_regen;
    }
    private int max_health = 0;
    private int time_sp = 0;
    private int dam_buf = 0;
    private int bomb = 0;

    public int getMax_health() {
        return max_health;
    }

    public int getBomb() {
        return bomb;
    }

    public void ChooseType(int type)
    {
        if(type == 1)//healer
        {
            health_regen = health/10;
            System.out.println("\u001B[33m█▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   █░█ █▀▀ ▄▀█ █░░ █▀▀ █▀█   ░   █▄█ █▀█ █░█   █░█ █▀▀ ▄▀█ █░░ █▀\n" +
                    "░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   █▀█ ██▄ █▀█ █▄▄ ██▄ █▀▄   █   ░█░ █▄█ █▄█   █▀█ ██▄ █▀█ █▄▄ ▄█\n" +
                    "\n" +
                    "█ ▀█▀ █▀ █▀▀ █░░ █▀▀ █\n" +
                    "█ ░█░ ▄█ ██▄ █▄▄ █▀░ ▄");
            System.out.println("Health regenaretion:" + health_regen);
        }
        if(type == 2)//speeder
        {
            time_sp = time_attack/3;
            time_attack -= time_sp;
            System.out.println("\u001B[34m█▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   █▀ █▀█ █▀▀ █▀▀ █▀▄ █▀█ █░█ █▄░█ █▀▀ █▀█   ░   █▄█ █▀█ █░█   ▄▀█ ▀█▀ ▀█▀ ▄▀█ █▀▀ █▄▀\n" +
                    "░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   ▄█ █▀▀ ██▄ ██▄ █▄▀ █▀▄ █▄█ █░▀█ ██▄ █▀▄   █   ░█░ █▄█ █▄█   █▀█ ░█░ ░█░ █▀█ █▄▄ █░█\n" +
                    "\n" +
                    "█▀▀ ▄▀█ █▀ ▀█▀ █▀▀ █▀█ █");
            System.out.println("Time_speedrun:" + time_sp);
            System.out.println("Time_attack:" + time_attack);
        }
        if(type == 3)//tank
        {
            dam_buf = damage/2;
            damage += dam_buf;
            System.out.println("\u001B[31m█▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   ▀█▀ ▄▀█ █▄░█ █▄▀   ░   █▄█ █▀█ █░█ █▀█   █▀▄ ▄▀█ █▀▄▀█ ▄▀█ █▀▀ █▀▀   █ █▀\n" +
                    "░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   ░█░ █▀█ █░▀█ █░█   █   ░█░ █▄█ █▄█ █▀▄   █▄▀ █▀█ █░▀░█ █▀█ █▄█ ██▄   █ ▄█\n" +
                    "\n" +
                    "█░█ █ █▀▀ █░█ █▀▀ █▀█ █");
            System.out.println("Damage plus:" + dam_buf);
            System.out.println("Damage:" + damage);
        }
        if(type == 4)//necromant
        {
            max_health = this.health;
            System.out.println("\u001B[30m█▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   █▄░█ █▀▀ █▀▀ █▀█ █▀█ █▀▄▀█ ▄▀█ █▄░█ ▀█▀   ░   █ █▀▀   █ ▀█▀ █▀   ▀█▀ █▀▀ ▄▀█ █▀▄▀█\n" +
                    "░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   █░▀█ ██▄ █▄▄ █▀▄ █▄█ █░▀░█ █▀█ █░▀█ ░█░   █   █ █▀░   █ ░█░ ▄█   ░█░ ██▄ █▀█ █░▀░█\n" +
                    "\n" +
                    "█▄▄ ▄▀█ ▀█▀ ▀█▀ █░░ █▀▀   ░   █░█ █▀▀   █▀▀ ▄▀█ █▄░█   ▄▀█ █░░ █ █░█ █▀▀   ▄█   █▀▄ █▀█ █▀█ █ █▀▄ █\n" +
                    "█▄█ █▀█ ░█░ ░█░ █▄▄ ██▄   █   █▀█ ██▄   █▄▄ █▀█ █░▀█   █▀█ █▄▄ █ ▀▄▀ ██▄   ░█   █▄▀ █▀▄ █▄█ █ █▄▀ ▄");
        }
        if(type == 5)//bomber
        {
            this.bomb = damage/2;
            System.out.println("\u001B[36m█▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   █▄▄ █▀█ █▀▄▀█ █▄▄ █▀▀ █▀█   ░   █▄█ █▀█ █░█   █▄▄ █▀█ █▀▄▀█ █▄▄ █▀   █░█░█ █░█ █▀▀ █▄░█\n" +
                    "░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   █▄█ █▄█ █░▀░█ █▄█ ██▄ █▀▄   █   ░█░ █▄█ █▄█   █▄█ █▄█ █░▀░█ █▄█ ▄█   ▀▄▀▄▀ █▀█ ██▄ █░▀█\n" +
                    "\n" +
                    "█▄█ █▀█ █░█   █▀▄ █ █▀▀   ▄▀█ █▄░█ █▀▄   ▄▀█ ▀█▀ ▀█▀ ▄▀█ █▀▀ █▄▀   █▄█ █▀█ █░█ █▀█   █▀▀ █▄░█ █▀▀ █▀▄▀█ █ █▀▀ █▀ █\n" +
                    "░█░ █▄█ █▄█   █▄▀ █ ██▄   █▀█ █░▀█ █▄▀   █▀█ ░█░ ░█░ █▀█ █▄▄ █░█   ░█░ █▄█ █▄█ █▀▄   ██▄ █░▀█ ██▄ █░▀░█ █ ██▄ ▄█ ▄");
        }
    }
}
