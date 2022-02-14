public class Weapon  {
    String weaponName;
    String weaponType;
    int weaponDMG;
    int weaponPrice;

    int manaIncrease;
    int healIncrease;
    String specialAbility;
    String spec;
    public Weapon(String weaponName,String weaponType, int weaponDMG,int weaponPrice, int manaIncrease,int healIncrease, String specialAbility, String spec) {
        this.weaponName=weaponName;
        this.weaponType=weaponType;
        this.weaponDMG=weaponDMG;
        this.weaponPrice=weaponPrice;
        this.manaIncrease=manaIncrease;
        this.healIncrease=healIncrease;
        this.specialAbility=specialAbility;
        this.spec=spec;
    }

    public static Weapon noweapon=new Weapon("No weapon","No weapon",0,0,0,0,null, "ALL");
    //1
    public static Weapon sword001= new Weapon("Short twin blades","short sword",30,5,0,0,null,"Ranger");
    //2
    public static Weapon sword002= new Weapon("Two-Handed Long Sword", "two-handed sword",20,5,0,0,"Splash damage","Warrior");
    //3
    public static Weapon axe001=new Weapon("short double axes","short axe",40,5,0,0,"Splash damage","Ranger");
    //4
    public static Weapon axe002=new Weapon("Two-Handed Double Axe","two-handed axe",30,5,0,0,null,"Warrior");
    //5
    public static Weapon staff001=new Weapon("Staff of wizzardy","staff", 5,5,50,0,null,"Mage");
    //6
    public static Weapon sword003= new Weapon("Elven twin blades","short sword",60,40,0,0,null,"Ranger");
    //7
    public static Weapon sword004=new Weapon("Two-Handed Sword of Great Warrior","two-handed sword",40,40,0,0,"Splash damage","Warrior");
    //8
    public static Weapon axe003=new Weapon("Dwarven axes","short axe", 80,60,0,0,null,"Ranger");
    //9
    public static Weapon axe004=new Weapon("Orc's heavy axe","two-handed axe",60,60,0,0,"Splash damage","Warrior");
    //10
    public static Weapon staff002=new Weapon("Warlock's Staff","staff",15,50,50,10,null,"Mage");
    //11
    public static Weapon staff003=new Weapon("Priestess Staff","staff",10,50,10,50,null,"Mage");

    public String getWeaponName() {
        return weaponName;
    }

}
