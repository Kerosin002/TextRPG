import java.util.Scanner;
public class Handle {
    public static void handle(Inventory MHI,Humanoid MH, NPC m){
        Scanner in=new Scanner(System.in);
        String cancel=" ";
        int c;
        int pPrice=10;
        System.out.println(m.name+": Heal potions, clarities , weapon! You want it? It's all yours, my friend, as long as you have enough gold");
        System.out.println("(If merchant is the same race as you, you have a discount)");
        in.nextLine();
        if(MH.race.equals(m.race)||m.race.equals("Human/Elf")) {
            System.out.println("(Your compatriot is glad to see you and is ready to make a discount for you)");
            pPrice=5;
        }
        else {
            System.out.println("("+m.race + "s around you look at you with disbelief, but they are not averse to sell you something from their goods)");
        }
        while (!cancel.equals("exit")) {
            System.out.println("1: Healing salve (10 g)");
            System.out.println("2: Clarity (10 g)");
            System.out.println("3:Weapon");
            int i = in.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("How much?");
                    c=in.nextInt();
                    if(MHI.gold>=(pPrice*c)) {
                        MHI.gold -= (pPrice * c);
                        MHI.healingSalve += c;
                        System.out.println("You've bought " + c + " healing salves for " + pPrice + " gold");
                    }
                    else
                        System.out.println("Sorry, " + MH.name + ", you have no enough gold.");

                }
                case 2:{
                    System.out.println("How much?");
                    c=in.nextInt();
                    if(MHI.gold>=(pPrice*c)) {
                        MHI.Clarity += c;
                        MHI.gold -= pPrice;
                        System.out.println("You've bought " + c + " clarities for " + pPrice + " gold");
                    }
                    else
                        System.out.println("Sorry, " + MH.name + ", you have no enough gold.");
                }
                case 3:{
                    if((m.race.equals("Elf"))||(m.race.equals("Human"))) {
                        for (int f = 0; f <= 2; f++) {
                            int f1 = f + 1;
                            System.out.println(f1 + ": " + m.wp[f].weaponName+"  "+m.wp[f].weaponPrice);
                        }
                        int r = in.nextInt();
                        if (MHI.gold >= m.wp[r].weaponPrice) {
                            r--;
                            MH.setWeapon(MH,m.wp[r]);
                            if(MH.weapon.equals(m.wp[r])) {
                                MHI.gold -= m.wp[r].weaponPrice;
                                MHI.gold += MH.weapon.weaponPrice;
                            }
                            else
                                System.out.println("The deal cannot be completed");

                        } else
                            System.out.println("Sorry, " + MH.name + ", you have no enough gold.");
                    }
                    else
                        System.out.println("This merchant has no weapon");


                }
            }
            System.out.println("Press Enter to continue or type ^exit^ to end handle");
            cancel=in.nextLine();
        }

    }
}
