
import java.util.Scanner;
import java.io.IOException;


public class MGoth  {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner in = new Scanner(System.in);
        char inChar;
        int hh=0;
        int mh=0;
        int answer;
        int x=150;
        int y=75;

        cls.cls();
        System.out.println("Welcome to the Gothnos, stranger!");
        Thread.sleep(2000);
        System.out.println("Here begins your journey!");
        Thread.sleep(2000);
        System.out.println("Now you can create your character, choose his name, race, sex, and his specialization");
        System.out.println("( press Enter to continue)");
        in.nextLine();
        cls.cls();

        System.out.println("Please, tell us, who are you?");
        System.out.println("(enter your name)");
        String n= in.nextLine();
        while(n.equals(""))
        {
            System.out.println("(enter your name");
            n= in.nextLine();
        }
        cls.cls();
        System.out.println("(enter your race(Elf/Human)");
        Thread.sleep(3000);
        System.out.println("*************************************************************************************************************************************");
        System.out.println("Elves: A proud race living in the Great Forest. They try to stay away from people, not out of fear, but out of distrust of them. ");
        System.out.println("Nevertheless, guests of the forest should be treated hospitably, for this is their ancient habit");
        Thread.sleep(3000);
        System.out.println("*************************************************************************************************************************************");
        System.out.println("Humans: A young race that settled in Gothnos very quickly. They consider all elves to be snobs and pedants. ");
        System.out.println("Still appreciate their culture and learn magic from them");
        System.out.println("*************************************************************************************************************************************");

        String r= in.nextLine();
        while ((!r.equals("Elf"))&&(!r.equals("Human"))){
            System.out.println("Invalid race");
            r=in.nextLine();
        }
        System.out.println("(enter your sex(M/F))");
        char s= in.nextLine().charAt(0);
        System.out.println("(choose your specialization)");
        System.out.println("(Enter to see the next spec)");
        in.nextLine();
        System.out.println("*************************************************************************************************************************************");
        System.out.println("Ranger: a fighter whose main weapon is his agility. Prefers daggers and bows, but is just ");
        System.out.println("as good with one-armed swords. Possesses the skills of intelligence and skills that deal medium damage");
        System.out.println("stats:");
        System.out.println("Healpoints = 150");
        System.out.println("Manapoints = 100");
        Thread.sleep(3000);
        System.out.println("*************************************************************************************************************************************");
        System.out.println("Warrior: a fighter who relies only on his strength in battle. Crush enemies in close combat,");
        System.out.println(" because only cowards fight in ranged combat. Specializes in heavy melee weapons");
        System.out.println("(such as two-handed axes and two-handed swords). Skills that deal small damage and skills that increase defense and health");
        System.out.println("stats:");
        System.out.println("Healpoints = 200");
        System.out.println("Manapoints = 50");
        Thread.sleep(3000);
        System.out.println("*************************************************************************************************************************************");
        System.out.println("Mage: the fighter who values the power of knowledge the most. He wears neither weapons nor armor,");
        System.out.println(" because he prefers a staff and a robe. And this follows from the fact that his enemies turn");
        System.out.println(" to ashes without even having time to reach him. Owns high damage spells");
        System.out.println("stats:");
        System.out.println("Healpoint = 100");
        System.out.println("Manapoint = 150");
        System.out.println("*************************************************************************************************************************************");
        String sp=in.nextLine();
        while ((!sp.equals("Ranger"))&&(!sp.equals("Warrior"))&&(!sp.equals("Mage")))
        {
            System.out.println("Invalid spec");
            sp=in.nextLine();
        }
        if(sp.equals("Ranger")){
            hh=150;
            mh=100;
        }
        if(sp.equals("Warrior")){
            hh=200;
            mh=50;
        }
        if(sp.equals("Mage")){
            hh=100;
            mh=150;
        }
        cls.cls();
        Humanoid MainHero= new Humanoid(n,r,s," ",hh,mh,Weapon.noweapon);
        MainHero.setSpec(sp);
        MainHero.setMaxHP(MainHero.HP);
        MainHero.setMaxHHP(MainHero,MainHero.weapon);
        MainHero.setMaxMP(MainHero.manaP);
        MainHero.setMaxHMP(MainHero,MainHero.weapon);
        //System.out.println(MainHero.MaxHP+" "+MainHero.MaxMP);
        System.out.println("(Are you sure you want to play as this character?(Y/N))");
        Info.info(MainHero);
        inChar= (char) System.in.read();
        if ((inChar == 'N') || (inChar == 'n')) {
            while ((inChar != 'Y') && (inChar != 'y')) {
                System.out.println("(enter your name)");
                n = in.next();
                MainHero.setName(n);
                System.out.println("(enter your race)");
                r = in.next();
                MainHero.setRace(r);
                System.out.println("(enter your sex)");
                s = (char) System.in.read();
                MainHero.setSex(s);
                System.out.println("(choose your specialization)");
                sp = in.next();
                MainHero.setSpec(sp);
                MainHero.setMaxHHP(MainHero, MainHero.weapon);
                MainHero.setMaxHMP(MainHero, MainHero.weapon);
                System.out.println("Are you sure you want to play as this character?(Y/N)");
                Info.info(MainHero);
                inChar = (char) System.in.read();


            }
        }
        cls.cls();
        Inventory MHinvetory=new Inventory(100,0,0);
        in.nextLine();
        System.out.println("Moldor: Oh it's nice to meet you "+MainHero.name+"!");
        Thread.sleep(3000);
        System.out.println("Moldor: I'm glad to see new talented "+ MainHero.spec);
        Thread.sleep(3000);
        System.out.println("Moldor: My name is Moldor and I am the knight of the Holy Sarafan order");
        Thread.sleep(3000);
        System.out.println("Moldor: You want to leave this Fortress, aren't you?");
        Thread.sleep(3000);
        if(!MainHero.spec.equals("Mage")) {
            System.out.println("Moldor: But first, let me give you a weapon! But you can choose only one ");
            if (MainHero.spec.equals("Ranger")) {
                System.out.println("1:" + Weapon.sword001.getWeaponName());
                System.out.println("2:" + Weapon.axe001.getWeaponName());
                int cw = in.nextInt();
                switch (cw) {
                    case 1 -> MainHero.setWeapon(MainHero,Weapon.sword001);
                    case 2 -> MainHero.setWeapon(MainHero,Weapon.axe001);
                }
            }
            if (MainHero.spec.equals("Warrior")) {
                System.out.println("1:" + Weapon.sword002.getWeaponName());
                System.out.println("2:" + Weapon.axe002.getWeaponName());
                int cw = in.nextInt();
                switch (cw) {
                    case 1 -> MainHero.setWeapon(MainHero,Weapon.sword002);
                    case 2 -> MainHero.setWeapon(MainHero,Weapon.axe002);
                }
            }
        }
        else{
            System.out.println("Moldor: But first, we will give you this staff! I think mage as you will find it useful");
            MainHero.setWeapon(MainHero,Weapon.staff001);
        }
        System.out.println("("+MainHero.weapon.getWeaponName()+" equipped)");
        Thread.sleep(3000);
        System.out.println("And I'm giving you this potions");
        MHinvetory.healingSalve+=5;
        MHinvetory.Clarity+=5;
        System.out.println("Healing salves: "+MHinvetory.getHealingSalve());
        System.out.println("Clarities: "+MHinvetory.getClarity());
        System.out.println("Now, you can go");
        Thread.sleep(3000);
        System.out.println("1:But where should i go?");
        System.out.println("2:Farewell");
        answer=in.nextInt();
        if (answer==1)
        {
            System.out.println("Moldor: In the East lies capital city of our Kingdom!");
            Thread.sleep(3000);
            System.out.println("Moldor: For the west the Great Elven Forest.");
            Thread.sleep(3000);
            System.out.println("Moldor: If go to the North, you will find the Great Pillars.");
            Thread.sleep(3000);
            System.out.println("Moldor: And, at last, South. It's full of caves and monsters, so I don't advise you to go there");
        }
        else
        {
            System.out.println("Moldor: Farewell");
        }
        System.out.println("( press Enter to continue)");
        in.nextLine();
        cls.cls();

        Thread.sleep(3000);
        System.out.println("(Here your journey begins) ");
        Thread.sleep(3000);
        System.out.println("(You can go everywhere you want and do everything you want)");
        Thread.sleep(3000);
        System.out.println("(Do not forget about your mortality. If your Heal points equal 0, you die, and your journey ends) ");
        System.out.println("(for traveling you just need to type ^travel^ and after that, type the name of the cardinal point) ");
        Thread.sleep(3000);
        System.out.println("(after that you need to throw your dice. Just type ^throw^ for that) ");
        Thread.sleep(3000);
        System.out.println("(GoodLuck)");
        System.out.println("( press Enter to continue)");
        in.nextLine();
        cls.cls();
        while(MainHero.HP>0){
            int ecount=0;
            System.out.println("*************************************************************************************************************************************");
            System.out.println("Type ^Travel^ for traveling");
            System.out.println("Type ^Heal^ to use healing salve from your inventory");
            System.out.println("Type ^ManaReg^ to use clarity from your inventory");

            System.out.println("Type ^Location^ to get information about your actual location");
            System.out.println("Type ^Info^ to get actual information about your character");
            System.out.println("Type ^Inv^ to get information about your inventory");
            if((Location.location(x,y).equals("The Fortress"))||(Location.location(x,y).equals("The Forest"))||(Location.location(x,y).equals("Capital of the Kingdom")))
                System.out.println("Type ^Handle^ to handle with nearest merchant");
            System.out.println("Type ^Save^ to save your progress");
            System.out.println("*************************************************************************************************************************************");
            String command = in.nextLine();
            cls.cls();
            if((command.equals("Travel"))||command.equals("1")) {
                ecount++;
                System.out.println("(Type down your destination)");
                String dest = in.nextLine();
                while((!dest.equals("East"))&&(!dest.equals("West"))&&(!dest.equals("South"))&&(!dest.equals("North"))){
                    System.out.println("Wrong destination");
                    dest = in.nextLine();

                }
                System.out.println("(Throw your dice!(command ^Throw^)");
                String con = in.nextLine();
                if (con.equals("Throw")) {
                    int d=Dice.dice();
                    if ((dest.equals("East")) || dest.equals("West")) {
                        x = Moving.travelX(dest, x, y, d);
                        System.out.println(x + " " + y);
                    }
                    if ((dest.equals("North")) || dest.equals("South")) {
                        y = Moving.travelY(dest, x, y,d);
                        System.out.println(x + " " + y);
                    }
                    if((EnemyMeeting.meetingChance(x,y)==1)&&(Location.location(x,y).equals(" You are on the high road"))){
                        int swd=MainHero.weapon.weaponDMG;
                        System.out.println("You are under attack! Defend yourself!");
                        int acm=CombatMode.combat(x,y,MainHero);
                        if (acm>0){
                            System.out.println("Congratulations! That was great fight!");
                            if (acm>MainHero.MaxHP)
                                MainHero.HP=MainHero.MaxHP;
                            MainHero.weapon.weaponDMG=swd;
                            DropRate.drop(MHinvetory,MainHero);
                            MainHero.setMaxHHP(MainHero,MainHero.weapon);
                            MainHero.setMaxHMP(MainHero,MainHero.weapon);
                        }
                        else{
                            System.out.println("Your enemies were stronger.");
                            System.out.println("Here ends your story, "+ MainHero.name+".");
                            break;
                        }
                    }
                }
                else {
                    System.out.println("canceled");
                }


            }
            if((command.equals("Handle"))||(command.equals("7"))){
                ecount++;
                if(Location.location(x,y).equals("The Fortress"))
                    Handle.handle(MHinvetory,MainHero,NPC.moldor);
                if(Location.location(x,y).equals("The Forest"))
                    Handle.handle(MHinvetory,MainHero,NPC.kaldor);
                if(Location.location(x,y).equals("Capital of the Kingdom"))
                    Handle.handle(MHinvetory,MainHero,NPC.wilkas);
                if((Location.location(x,y).equals(" You are on the high road"))||(Location.location(x,y).equals("Dark Caves"))||
                        (Location.location(x,y).equals("The Pillars")))
                    System.out.println("No merchants here");

            }
            if((command.equals("Heal"))||(command.equals("2")))
            {
                ecount++;
                MHinvetory.Heal(MainHero);
            }
            if((command.equals("ManaReg"))||(command.equals("3"))){
                ecount++;
                MHinvetory.ManaReg(MainHero);
            }
            if ((command.equals("Location"))||(command.equals("4"))){
                ecount++;
                System.out.println(Location.location(x,y));
            }
            if ((command.equals("Info"))||(command.equals("5"))){
                ecount++;
                Info.info(MainHero);
            }
            if((command.equals("Inv"))||(command.equals("6"))){
                ecount++;
                System.out.println("Healing salves: "+MHinvetory.getHealingSalve());
                System.out.println("Clarities: "+MHinvetory.getClarity());
                System.out.println("Gold: "+MHinvetory.getGold());
            }
            if(ecount==0){
                System.out.println("Invalid command");
            }
            System.out.println("( press Enter to continue)");
            in.nextLine();
            cls.cls();


        }







    }




}


