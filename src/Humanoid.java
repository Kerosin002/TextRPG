public class Humanoid {
    String name;
    String race;
    char sex; //m-for male and f-for female
    String spec;
    int HP;
    int manaP;
    int MaxHP;
    int MaxMP;
    int ClearMaxHP;
    int ClearMaxMP;
    Weapon weapon;


    public Humanoid(String name, String race, char sex, String spec, int HP, int manaP,Weapon wp) {
        this.name = name;
        this.race = race;
        this.sex = sex;
        this.spec=spec;
        this.HP = HP;
        this.manaP=manaP;
        weapon=wp;
    }

   public void setWeapon(Humanoid c,Weapon wp){
        if(c.spec.equals(wp.spec)||wp.spec.equals("ALL")) {
            weapon = wp;
            setMaxHMP(c,wp);
            setMaxHHP(c,wp);
        }
        else
            System.out.println("You can't equip this weapon, because of your specialization");
   }
    public void setMaxHP(int HP) {

        this.ClearMaxHP= HP;
    }
    public void setMaxMP(int manaP){
        this.ClearMaxMP=manaP;
    }

    public void setMaxHMP(Humanoid c,Weapon wp) {
        MaxMP=c.ClearMaxMP+ wp.manaIncrease;
    }
    public void setMaxHHP(Humanoid c,Weapon wp) {
        MaxHP=c.ClearMaxHP+ wp.healIncrease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setSpec(String spec) {
        this.spec = spec;
        if(spec.equals("Ranger")){
            this.HP=150;
            this.ClearMaxHP=150;
            this.manaP=100;
            this.ClearMaxMP=100;

        }
        if(spec.equals("Warrior")){
            this.HP=200;
            this.ClearMaxHP=200;
            this.manaP=50;
            this.ClearMaxMP=50;
        }
        if(spec.equals("Mage")){
            this.HP=100;
            this.ClearMaxHP=100;
            this.manaP=150;
            this.ClearMaxMP=150;
        }
    }

}
