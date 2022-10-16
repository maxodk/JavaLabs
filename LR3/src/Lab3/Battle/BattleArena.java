package Lab3.Battle;

import Lab3.Ammunition.Ammunition;
import Lab3.Droids.AlterDroids;
import Lab3.Droids.BaseDroid;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class BattleArena {
    public BattleArena() {}
    public void Fight1vs1()
    {
        Ammunition[] Arr = new Ammunition[10];
        Arr[0] = new Ammunition("Sword",20,2,0);
        Arr[1] = new Ammunition("Helmet",0,0,50);
        Arr[2] = new Ammunition("Armor",0,0,100);
        Arr[3] = new Ammunition("Boots",0,0,30);
        Scanner scan0 = new Scanner(System.in);
        int heal1 , heal2;
        int dam1 , dam2;
        int time1, time2;
        int crit1,crit2;
        System.out.print("Enter heal1:");
        heal1 = scan0.nextInt();
        System.out.print("Enter dam1:");
        dam1 = scan0.nextInt();
        System.out.print("Enter time1:");
        time1 = scan0.nextInt();
        System.out.print("Enter crit_chance1:");
        crit1 = scan0.nextInt();
        System.out.print("Enter heal2:");
        heal2 = scan0.nextInt();
        System.out.print("Enter dam2:");
        dam2 = scan0.nextInt();
        System.out.print("Enter time2:");
        time2 = scan0.nextInt();
        System.out.print("Enter crit_chance2:");
        crit2 = scan0.nextInt();
        AlterDroids a = new AlterDroids(heal1,dam1,time1,crit1);
        AlterDroids b = new AlterDroids(heal2,dam2,time2,crit2);
        int ch1 , ch2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you want that 1 droid will be alternative droid(0 or 1)?:");
        ch1 = scan.nextInt();
        System.out.print("Do you want that 2 droid will be alternative droid(0 or 1)?:");
        ch2 = scan.nextInt();
        if(ch1 == 1)
        {
            System.out.print("Enter type of alter droid(1 - healer , 2 - speedrunner,3 - tank,4 - necromant,5 - bomber):");
            int t = scan.nextInt();
            a.setType(t);
            a.ChooseType(t);
        }
        if(ch2 == 1)
        {
            System.out.print("Enter type of alter droid(1 - healer , 2 - speedrunner,3 - tank,4 - necromant,5 - bomber):");
            int t = scan.nextInt();
            b.setType(t);
            b.ChooseType(t);
        }
        int r = 1;
        Random chaince = new Random();
        int chnc;
        for(int i = 1;i < 10000000;i++)
        {
            if(a.health <= 0 && b.health <= 0)
            {
                System.out.println("Draw!");
                break;
            }
            if(a.health <= 0)
            {
                System.out.println("Droid 2 wins!Fatality!");
                break;
            }
            if(b.health <= 0)
            {
                System.out.println("Droid 1 wins!Fatality!");
                break;
            }
            if(i % a.time_attack == 0)
            {
                System.out.println("--------------\nRound " + r +"\n--------------");
                chnc = chaince.nextInt(100);
                if(a.crit <= chnc)
                {
                    a.damage *= 2;
                    System.out.println("Droid A has critical damage!");
                }
                b.health -= a.damage;
                if(b.health <= 0 && b.getType() == 5)
                {
                    System.out.println("Droid B died , but bombed Droid A");
                    a.health -= b.getBomb();
                }
                if(a.crit <= chnc)
                {
                    a.damage /= 2;
                }
                System.out.println("Droid A attacks droid B");
                if(b.getType() == 1)
                {
                    b.health += b.getHealth_regen();
                    System.out.println("Droid B health itself");
                }
                System.out.println("A.health:" + a.health);
                System.out.println("B.health:" + b.health);
                r += 1;
            }
            if(i % b.time_attack == 0)
            {
                System.out.println("Round " + r +"\n--------------\n");
                chnc = chaince.nextInt(100);
                if(b.crit <= chnc)
                {
                    b.damage *= 2;
                    System.out.println("Droid B has critical damage!");
                }
                a.health -= b.damage;
                if(a.health <= 0 && a.getType() == 5)
                {
                    System.out.println("Droid A died , but bombed Droid B");
                    b.health -= a.getBomb();
                }
                if(b.crit <= chnc)
                {
                    b.damage /= 2;
                }
                System.out.println("Droid B attacks droid A");
                if(a.getType() == 1)
                {
                    a.health += a.getHealth_regen();
                    System.out.println("Droid A health itself");
                }
                System.out.println("A.health:" + a.health);
                System.out.println("B.health:" + b.health);
                r+=1;
            }
        }
    }
    public void TeamvsTeam()
    {
        int size1 , size2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size1:");
        size1 = scan.nextInt();
        System.out.print("Enter size1:");
        size2 = scan.nextInt();
        AlterDroids team1[] = new AlterDroids[size1];
        AlterDroids team2[] = new AlterDroids[size2];
        System.out.println("\n\nTeam1:");
        for(int i = 0;i < size1;i++)
        {
            System.out.println("\nEnter your " + (i+1) + " droid:");
            int heal;
            int dam;
            int time;
            int crit;
            System.out.print("Enter health:");
            heal = scan.nextInt();
            System.out.print("Enter damage:");
            dam = scan.nextInt();
            System.out.print("Enter time_attack:");
            time = scan.nextInt();
            System.out.print("Enter chance of crit:");
            crit = scan.nextInt();
            team1[i] = new AlterDroids(heal,dam,time,crit);
            int ch;
            System.out.print("Do you want that  droid will be alternative droid(0 or 1)?:");
            ch = scan.nextInt();
            if(ch == 1)
            {
                System.out.print("Enter type of alter droid(1 - healer , 2 - speedrunner,3 - tank,4 - necromant,5 - bomber):");
                int t = scan.nextInt();
                team1[i].setType(t);
                team1[i].ChooseType(t);
            }
        }
        System.out.println("\n\nTeam2:");
        for(int i = 0;i < size2;i++)
        {
            System.out.println("\nEnter your " + (i+1) + " droid:");
            int heal;
            int dam;
            int time;
            int crit;
            System.out.print("Enter health:");
            heal = scan.nextInt();
            System.out.print("Enter damage:");
            dam = scan.nextInt();
            System.out.print("Enter time_attack:");
            time = scan.nextInt();
            System.out.print("Enter chance of crit:");
            crit = scan.nextInt();
            team2[i] = new AlterDroids(heal,dam,time,crit);
            int ch;
            System.out.print("Do you want that 1 droid will be alternative droid(0 or 1)?:");
            ch = scan.nextInt();
            if(ch == 1)
            {
                System.out.print("Enter type of alter droid(1 - healer , 2 - speedrunner,3 - tank,4 - necromant,5 - bomber):");
                int t = scan.nextInt();
                team2[i].setType(t);
                team2[i].ChooseType(t);
            }
        }
        int r = 1;
        int n1 = 0;
        int n2 = 0;
        Random chaince = new Random();
        int chnc;
        for(int i = 1;i < 100000000;i++)
        {
            if(size1 == 0 && size2 == 0)
            {
                System.out.println("DRAW!");
                break;
            }
            if(size2 == 0)
            {
                System.out.println("Team2 LOSER!");
                break;
            }
            if(size1 == 0)
            {
                System.out.println("Team1 LOSER!");
                break;
            }
            System.out.println("--------------\nRound " + r +"\n--------------");
            Random random = new Random();
            int chois1 = random.nextInt(size1);
            int chois2 = random.nextInt(size2);
            chnc = chaince.nextInt(100);
            if(team1[chois1].crit <= chnc)
            {
                team1[chois1].damage *= 2;
                System.out.println("Droid " + (chois1+1) + " from 1 Team has critical damage!");
            }
            team2[chois2].health -= team1[chois1].damage;
            if(team2[chois2].health <= 0 && team2[chois2].getType() == 5)
            {
                for(int j = 0;j < size1;j++)
                {
                    team1[j].health -= team2[chois2].getBomb();
                    System.out.println("Team 1 KAMIKAZE");
                }
            }
            if(team1[chois1].crit <= chnc)
            {
                team1[chois1].damage /= 2;
            }
            if(team1[chois1].getType() == 1)
            {
                team1[chois1].health += team1[chois1].getHealth_regen();
                System.out.println("Droid " + (chois1+1) + " from 1 Team heals itself");
            }
            if(team1[chois1].health <=0)
            {
                AlterDroids temp = team1[chois1];
                team1[chois1] = team1[size1 - 1];
                team1[size1 - 1] = temp;
                size1 -= 1;
                for(int j = 0;j < size1;j++)
                {
                    if(team1[j].getType() == 4 && n1 == 0)
                    {
                        team1[size1].health = team1[j].getMax_health();
                        size1 += 1;
                        n1 = 1;
                        break;
                    }
                }
            }
            if(size1 == 0)
            {
                System.out.println("Team1 fucked yourself");
                break;
            }
            chois1 = random.nextInt(size1);
            chois2 = random.nextInt(size2);
            chnc = chaince.nextInt(100);
            if(team2[chois2].crit <= chnc)
            {
                team2[chois2].damage *= 2;
                System.out.println("Droid " + (chois2+1) + " from 2 Team has critical damage!");
            }
            team1[chois1].health -= team2[chois2].damage;
            if(team1[chois1].health <= 0 && team1[chois1].getType() == 5)
            {
                for(int j = 0;j < size2;j++)
                {
                    team2[j].health -= team1[chois1].getBomb();
                    System.out.println(" Team 2 KAMIKAZE!");
                }
            }
            if(team2[chois2].crit <= chnc)
            {
                team2[chois2].damage /= 2;
            }
            if(team2[chois2].getType() == 1)
            {
                team2[chois2].health += team2[chois2].getHealth_regen();
                System.out.println("Droid " + (chois2+1) + " from 2 Team heals itself");
            }
            if(team2[chois2].health <=0)
            {
                AlterDroids temp = team2[chois2];
                team2[chois2] = team2[size2 - 1];
                team2[size2 - 1] = temp;
                size2 -= 1;
                for(int j = 0;j < size2;j++)
                {
                    if(team2[j].getType() == 4 && n2 == 0)
                    {
                        team2[size2].health = team2[j].getMax_health();
                        size2 += 1;
                        n2 = 1;
                        break;
                    }
                }
            }
            System.out.println("Team1:\n");
            for(int j = 0;j < size1;j++)
            {
                System.out.println("Droid " + (j+1) + " health:" + team1[j].health);
            }
            System.out.println("Team2:\n");
            for(int j = 0;j < size2;j++)
            {
                System.out.println("Droid " + (j+1) + " health:" + team2[j].health);
            }
            r+=1;
        }
    }
}
