public class Enemy {
    int HP;
    String type;
    int damage;
    public static String enemyCreation(int x,int y){

        String type=" ";
        if ((x>137)&&(x<170)&&(y>100)&&(y<=150)){
            int ch=(int)(Math.random()*101);
            if(ch>=70){
                type="Acient ghost";
            }
            else {
                type = "ghost";
            }
        }
        if ((x>170)&&(x<280)&&(y>0)&&(y<=150)){
            int ch=(int)(Math.random()*101);
            if(ch>=70){
                type="Lead rogue";
            }
            else {
                type = "rogue";
            }
        }
        if ((x>50)&&(x<125)&&(y>0)&&(y<=150)){
            int ch=(int)(Math.random()*101);
            if(ch>=70){
                type="Orc warchief";
            }
            else {
                type = "orc";
            }
        }
        if ((x>137)&&(x<170)&&(y>0)&&(y<=50)){
            int ch=(int)(Math.random()*101);
            if(ch>=70){
                type="undead";
            }
            else {
                type = "skeleton";
            }
        }
        return type;
    }

    public static int setHP(String ec) {
        int HP=0;
        if (ec.equals("ghost")){
            HP=40;
        }
        if (ec.equals("Ancient ghost")){
            HP=50;
        }
        if (ec.equals("rogue")){
            HP=45;
        }
        if (ec.equals("Lead rogue")){
            HP=55;
        }
        if (ec.equals("orc")){
            HP=50;
        }
        if (ec.equals("Orc warchief")){
            HP=60;
        }
        if (ec.equals("undead")){
            HP=50;
        }
        if (ec.equals("skeleton")){
            HP=30;
        }
        return HP;
    }
    public static int setDamage(String ec) {
        int dmg=0;
        if (ec.equals("ghost")){
            dmg=25;
        }
        if (ec.equals("Ancient ghost")){
            dmg=40;
        }
        if (ec.equals("rogue")){
            dmg=25;
        }
        if (ec.equals("Lead rogue")){
            dmg=45;
        }
        if (ec.equals("orc")){
            dmg=30;
        }
        if (ec.equals("Orc warchief")){
            dmg=55;
        }
        if (ec.equals("undead")){
            dmg=45;
        }
        if (ec.equals("skeleton")){
            dmg=20;
        }
        return dmg;
    }

    public Enemy(String type, int HP,  int damage) {
        this.type = type;
        this.HP = HP;
        this.damage = damage;
    }
}
