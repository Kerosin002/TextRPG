import java.util.Scanner;
public class DropRate {
    public static void drop(Inventory inv, Humanoid MH){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<=3;i++) {
            int ch = (int) (Math.random() * 101);
            switch (i){
                case 0:{
                    if(ch>15) {
                        int hr = (int) (Math.random() * 6);
                        System.out.println("On corp of your enemy you found "+ hr+" healing salves");
                        inv.healingSalve+=hr;
                    }
                    break;
                }
                case 1:{
                    if(ch>15){
                        int mr = (int) (Math.random() * 6);
                        System.out.println("On corp of your enemy you found "+ mr+" clarities");
                        inv.Clarity+=mr;
                    }
                    break;
                }
                case 2:{
                    if(ch>80){
                        int wd=(int)(Math.random()*12);
                        switch (wd){
                            case 1:{
                                System.out.println("On corp of your enemy you found "+ Weapon.sword001.weaponName);
                                System.out.println(Weapon.sword001.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.sword001);
                                }
                                break;
                            }
                            case 2:{
                                System.out.println("On corp of your enemy you found "+ Weapon.sword002.weaponName);
                                System.out.println(Weapon.sword002.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.sword002);
                                }
                                break;
                            }
                            case 3:{
                                System.out.println("On corp of your enemy you found "+ Weapon.sword003.weaponName);
                                System.out.println(Weapon.sword003.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.sword003);
                                }
                                break;
                            }
                            case 4:{
                                System.out.println("On corp of your enemy you found "+ Weapon.sword004.weaponName);
                                System.out.println(Weapon.sword004.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.sword004);
                                }
                                break;
                            }
                            case 5:{
                                System.out.println("On corp of your enemy you found "+ Weapon.axe001.weaponName);
                                System.out.println(Weapon.axe001.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.axe001);
                                }
                                break;
                            }
                            case 6:{
                                System.out.println("On corp of your enemy you found "+ Weapon.axe002.weaponName);
                                System.out.println(Weapon.axe002.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.axe002);
                                }
                                break;
                            }
                            case 7:{
                                System.out.println("On corp of your enemy you found "+ Weapon.axe003.weaponName);
                                System.out.println(Weapon.axe003.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.axe003);
                                }
                                break;
                            }
                            case 8:{
                                System.out.println("On corp of your enemy you found "+ Weapon.axe004.weaponName);
                                System.out.println(Weapon.axe004.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.axe004);
                                }
                                break;
                            }
                            case 9:{
                                System.out.println("On corp of your enemy you found "+ Weapon.staff001.weaponName);
                                System.out.println(Weapon.staff001.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.staff001);
                                }
                                break;
                            }
                            case 10:{
                                System.out.println("On corp of your enemy you found "+ Weapon.staff002.weaponName);
                                System.out.println(Weapon.staff002.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.staff002);
                                }
                                break;
                            }
                            case 11:{
                                System.out.println("On corp of your enemy you found "+ Weapon.staff003.weaponName);
                                System.out.println(Weapon.staff003.weaponDMG);
                                System.out.println("Do you want to equip it?");
                                System.out.println("1:Yes");
                                System.out.println("2:No");
                                int ans=in.nextInt();
                                if (ans==1){
                                    MH.setWeapon(MH,Weapon.staff003);
                                }
                                break;
                            }
                        }
                    }
                }
                case 3:{
                    int gl = (int) (Math.random() * 51);
                    System.out.println("On corp of your enemy you found "+ gl+" clarities");
                    inv.gold+=gl;
                }
            }
        }

    }
}
