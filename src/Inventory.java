public class Inventory{
    int gold;
    int healingSalve;
    int Clarity;

    public Inventory(int gold, int healingSalve, int clarity) {
        this.gold = gold;
        this.healingSalve = healingSalve;
        this.Clarity = clarity;
    }

    public int getGold() {
        return gold;
    }

    public int getHealingSalve() {
        return healingSalve;
    }

    public int getClarity() {
        return Clarity;
    }

    public void Heal (Humanoid MH ){

        if(this.healingSalve>0) {
            MH.HP += 75;
            if (MH.HP > MH.MaxHP)
                MH.HP = MH.MaxHP;
            System.out.println("+75 HealPoints");
            Info.info(MH);
            this.healingSalve--;
        }
        else{
            System.out.println("You have no more");
        }

    }
    public void ManaReg(Humanoid MH){
        if(this.Clarity>0) {
            MH.manaP += 75;
            if (MH.manaP > MH.MaxMP)
                MH.manaP = MH.MaxMP;
            System.out.println("+75 ManaPoints");
            Info.info(MH);
            this.Clarity--;
        }
        else{
            System.out.println("You have no more");
        }

    }

}
