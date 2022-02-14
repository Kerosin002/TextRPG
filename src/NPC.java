public class NPC extends WeaponInv  {
    Inventory inventory;
    String race;
    String name;
    Weapon[] wp;


    public NPC(Inventory inventory, String race, String name, Weapon[] p) {
        this.inventory = inventory;
        this.race = race;
        this.name = name;
       this.wp=p;
    }
    public static Inventory merchInv= new Inventory(10000,10000,10000);
    public static NPC kaldor=new NPC(merchInv,"Elf","Kaldor",WeaponInv.wpEInv);
    public static NPC wilkas=new NPC(merchInv,"Human","Wilkas",WeaponInv.wpHInv);
    public static NPC moldor=new NPC(merchInv,"Human/Elf","Moldor",null);

}
