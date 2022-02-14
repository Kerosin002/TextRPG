
import java.util.Scanner;

public class CombatMode {
    public static int combat(int x, int y, Humanoid MH) {
        Scanner in=new Scanner(System.in);
        int k=0;
        int i;
        int elem;
        int dmc;
        int whc;
        Enemy enemy1=new Enemy(Enemy.enemyCreation(x,y),0,0);
        Enemy enemy2=new Enemy(Enemy.enemyCreation(x,y),0,0);
        Enemy enemy3=new Enemy(Enemy.enemyCreation(x,y),0,0);
        while (k==0) {
            k = (int) (Math.random() * 3);
        }
        for(i=0;i<=k;i++){
            if(i==0){
                enemy1.HP=Enemy.setHP(enemy1.type);
                enemy1.damage=Enemy.setDamage(enemy1.type);
            }
            if(i==1){
                enemy2.HP=Enemy.setHP(enemy2.type);
                enemy2.damage=Enemy.setDamage(enemy2.type);
            }
            if(i==2){
                enemy3.HP=Enemy.setHP(enemy3.type);
                enemy3.damage=Enemy.setDamage(enemy3.type);
            }
        }
        System.out.println("You faced "+ (k+1) + " enemies");
        if(enemy1.HP!=0)
            System.out.println("First enemy is "+ enemy1.type);
        if(enemy2.HP!=0)
            System.out.println("Second enemy is "+ enemy2.type);
        if(enemy3.HP!=0)
            System.out.println("Third enemy is "+ enemy3.type);
        while ((MH.HP>0)&&((enemy1.HP>0)||(enemy2.HP>0)||(enemy3.HP>0))){
            System.out.println("Attack!");
            CombatSkills.getCombatSkills(MH);
            int s=in.nextInt();
            while(CombatSkills.combatSkills(s,MH).equals("Info about enemies")){
                System.out.println(CombatSkills.combatSkills(s,MH));
                if((enemy1.HP>0)&&(enemy1.damage>0)){
                    System.out.println(enemy1.type);
                    System.out.println(enemy1.HP);
                }
                if(enemy1.type.equals("Dead")){
                    System.out.println(enemy1.type);
                    System.out.println(enemy1.HP);
                }
                if((enemy2.HP>0)&&(enemy2.damage>0)){
                    System.out.println(enemy2.type);
                    System.out.println(enemy2.HP);
                }
                if(enemy2.type.equals("Dead")){
                    System.out.println(enemy2.type);
                    System.out.println(enemy2.HP);
                }
                if((enemy3.HP>0)&&(enemy3.damage>0)){
                    System.out.println(enemy3.type);
                    System.out.println(enemy3.HP);
                }
                if(enemy3.type.equals("Dead")){
                    System.out.println(enemy3.type);
                    System.out.println(enemy3.HP);
                }
                s= in.nextInt();
            }
            if((CombatSkills.combatSkills(s,MH).equals("You are casting God's Strength"))||(CombatSkills.combatSkills(s,MH).equals("You are casting BattleCry"))){
                int bf=CombatSkills.skillBuff(CombatSkills.combatSkills(s,MH),MH);
                if(CombatSkills.combatSkills(s,MH).equals("You are casting God's Strength")) {
                    MH.weapon.weaponDMG += bf;
                    System.out.println(CombatSkills.combatSkills(s,MH));
                    System.out.println("Your damage increased to "+ MH.weapon.weaponDMG);
                }
                else {
                    MH.HP += bf;
                    System.out.println(CombatSkills.combatSkills(s,MH));
                    System.out.println("Your heal points increased to "+MH.HP);
                }
            }
            else {
                int dmg = CombatSkills.skillDamage(CombatSkills.combatSkills(s, MH), MH);
                if ((CombatSkills.combatSkills(s, MH).equals("You are casting Blizzard")) || (CombatSkills.combatSkills(s, MH).equals("You are casting ArcaneBlast")) ||
                        (CombatSkills.combatSkills(s, MH).equals("You are casting MultiShot")) || (CombatSkills.combatSkills(s, MH).equals("You are casting StormHammer"))||
                (CombatSkills.combatSkills(s,MH).equals("You are attacking with your weapon")&&MH.weapon.specialAbility.equals("Splash damage"))) {
                    System.out.println(CombatSkills.combatSkills(s,MH));

                    enemy1.HP -= dmg;
                    enemy2.HP -= dmg;
                    enemy3.HP -= dmg;
                    System.out.println("All enemies got" + dmg+" damage");
                    if((!enemy1.type.equals("Dead"))&&(enemy1.damage>0)) {
                        dmc = enemy1.HP + dmg;
                        System.out.println(dmc + "-" + dmg + "=" + enemy1.HP);
                    }
                    if((!enemy2.type.equals("Dead"))&&(enemy2.damage>0)) {
                        dmc = enemy2.HP + dmg;
                        System.out.println(dmc + "-" + dmg + "=" + enemy2.HP);
                    }
                    if((!enemy3.type.equals("Dead"))&&(enemy3.damage>0)) {
                        dmc = enemy3.HP + dmg;
                        System.out.println(dmc + "-" + dmg + "=" + enemy3.HP);
                    }
                    if((enemy1.HP<=0)&&(enemy1.damage>0)&&(!enemy1.type.equals("Dead"))) {
                        System.out.println("enemy1("+enemy1.type+") dies");
                        enemy1.type = "Dead";
                    }
                    if((enemy2.HP<=0)&&(enemy2.damage>0)&&(!enemy2.type.equals("Dead"))) {
                        System.out.println("enemy2("+enemy2.type+") dies");
                        enemy2.type = "Dead";
                    }
                    if((enemy3.HP<=0)&&(enemy3.damage>0)&&(!enemy3.type.equals("Dead"))) {
                        System.out.println("enemy1("+enemy3.type+") dies");
                        enemy3.type = "Dead";
                    }
                } else {
                    System.out.println("Choose your target");

                    elem = in.nextInt();
                    whc=0;
                    while (whc!=1)
                    {


                        if(((elem==1)&&(enemy1.HP>0))||((elem==2)&&(enemy2.HP>0))||((elem==3)&&(enemy3.HP>0))){
                            whc++;
                        }
                        else {
                            if (((elem == 1) && (enemy1.damage == 0)) || ((elem == 2) && (enemy2.damage == 0)) || ((elem == 3) && (enemy3.damage == 0))) {
                                System.out.println("This enemy doesn't exist, choose another one");
                            } else {
                                System.out.println("This enemy is already dead. Choose another one");
                            }
                            elem = in.nextInt();
                        }

                    }
                    switch (elem) {
                        case 1 -> {
                            System.out.println(CombatSkills.combatSkills(s,MH));
                            enemy1.HP -= dmg;
                            dmc=enemy1.HP+dmg;
                            System.out.println("enemy1 gets "+dmg+" damage");
                            System.out.println(dmc+"-"+dmg+"="+enemy1.HP);
                            if((enemy1.HP<=0)&&(enemy1.damage>0)&&(!enemy1.type.equals("Dead"))) {
                                System.out.println("enemy1("+enemy1.type+") dies");
                                enemy1.type = "Dead";
                            }
                        }
                        case 2 -> {
                            System.out.println(CombatSkills.combatSkills(s,MH));
                            enemy2.HP -= dmg;
                            dmc=enemy2.HP+dmg;
                            System.out.println("enemy2 gets "+dmg+" damage");
                            System.out.println(dmc+"-"+dmg+"="+enemy2.HP);
                            if((enemy2.HP<=0)&&(enemy2.damage>0)&&(!enemy2.type.equals("Dead"))) {
                                System.out.println("enemy2("+enemy2.type+") dies");
                                enemy2.type = "Dead";
                            }

                        }
                        case 3 -> {
                            System.out.println(CombatSkills.combatSkills(s,MH));
                            enemy3.HP -= dmg;
                            dmc=enemy3.HP+dmg;
                            System.out.println("enemy3 gets "+dmg+" damage");
                            System.out.println(dmc+"-"+dmg+"="+enemy3.HP);
                            if((enemy3.HP<=0)&&(enemy3.damage>0)&&(!enemy3.type.equals("Dead"))) {
                                System.out.println("enemy3("+enemy3.type+") dies");
                                enemy3.type = "Dead";
                            }
                        }

                    }

                }
            }

                int p = (int) (Math.random() * k);
                if ((p == 0)&& (!enemy1.type.equals("Dead"))) {
                    System.out.println("enemy1("+enemy1.type+") is attacking");
                    MH.HP = MH.HP - enemy1.damage;
                    System.out.println("You are getting "+enemy1.damage+" damage");
                    dmc=MH.HP+enemy1.damage;
                    System.out.println(dmc+"-"+enemy1.damage+"="+MH.HP);
                }
                if ((p == 1)&& (!enemy2.type.equals("Dead"))) {
                    System.out.println("enemy2("+enemy2.type+") is attacking");
                    MH.HP = MH.HP - enemy2.damage;
                    System.out.println("You are getting "+enemy1.damage+" damage");
                    dmc=MH.HP+enemy1.damage;
                    System.out.println(dmc+"-"+enemy1.damage+"="+MH.HP);
                }
                if ((p == 2)&& (!enemy3.type.equals("Dead"))) {
                    System.out.println("enemy3("+enemy1.type+") is attacking");
                    MH.HP = MH.HP - enemy3.damage;
                    System.out.println("You are getting "+enemy1.damage+" damage");
                    dmc=MH.HP+enemy1.damage;
                    System.out.println(dmc+"-"+enemy1.damage+"="+MH.HP);
                }
        }
        enemy1=null;
        enemy2=null;
        enemy3=null;
        return MH.HP;
    }
}
