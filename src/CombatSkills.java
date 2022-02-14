public class CombatSkills {
    public static void getCombatSkills(Humanoid c){
        if(c.spec.equals("Mage")){
            System.out.println("1: Blizzard");
            System.out.println("2: PyroBlast");
            System.out.println("3: ArcaneBlast");
            System.out.println("4: Info");
        }
        if(c.spec.equals("Ranger")){
            System.out.println("1: ArcaneShot");
            System.out.println("2: SneakyBlow");
            System.out.println("3: MultiShot");
            System.out.println("4: Use Weapon");
            System.out.println("5:Info");
        }
        if(c.spec.equals("Warrior")){
            System.out.println("1: Brawl");
            System.out.println("2: StormHammer");
            System.out.println("3: BattleCry");
            System.out.println("4:Use weapon");
            System.out.println("5:Info");
        }

    }
    public static String combatSkills(int i, Humanoid c){
        String skill=" ";
        if(c.spec.equals("Mage")) {
            switch (i) {
                case 1 -> skill = "You are casting Blizzard";
                case 2 -> skill = "You are casting PyroBlast";
                case 3 -> skill = "You are casting ArcaneBlast";
                case 4 -> skill = "Info about enemies";
            }
        }
        if(c.spec.equals("Ranger")) {

            skill = switch (i) {
                case 1 -> "You are casting ArcaneShot";
                case 2 -> "You are casting SneakyBlow";
                case 3 -> "You are casting MultiShot";
                case 4 -> "You are attacking with your weapon";
                case 5 -> "Info about enemies";
                default -> skill;
            };
        }
        if (c.spec.equals("Warrior"))
        {
            skill = switch (i) {
                case 1 -> "You are casting God's Strength";
                case 2 -> "You are casting StormHammer";
                case 3 -> "You are casting BattleCry";
                case 4 -> "You are attacking with your weapon";
                case 5 -> "Info about enemies";
                default -> skill;
            };

    }
        return skill;
    }
    public static int skillDamage(String skill,Humanoid c){
        int dmg=0;
        if(skill.equals("You are casting Blizzard")) {
            dmg = 25+c.weapon.weaponDMG;
            c.manaP-=45;

        }
        if(skill.equals("You are casting PyroBlast")) {
            dmg = 45 + c.weapon.weaponDMG;
            c.manaP-=30;
        }
        if(skill.equals("You are casting ArcaneBlast")) {
            dmg = 20 + c.weapon.weaponDMG;
            c.manaP-=10;
        }
        if(skill.equals("You are casting ArcaneShot")) {
            dmg = 25;
            c.manaP-=10;
        }
        if(skill.equals("You are casting SneakyBlow")) {
            dmg = 30;
            c.manaP-=15;
        }
        if(skill.equals("You are casting MultiShot")) {
            dmg = 20;
            c.manaP-=30;
        }
        if(skill.equals("You are casting StormHammer")) {
            dmg = 30;
            c.manaP-=20;
        }
        if(skill.equals("You are attacking with your weapon"))
            dmg=c.weapon.weaponDMG;
        System.out.println(skill);
        return dmg;

    }
    public static int skillBuff(String skill, Humanoid c){
        int bf=0;
        if(skill.equals("You are casting God's Strength")){
           bf=c.weapon.weaponDMG;
            c.manaP-=25;
        }
        if(skill.equals("You are casting BattleCry")) {
            bf = 30;
            c.manaP-=10;
        }
        return bf;
    }

}
