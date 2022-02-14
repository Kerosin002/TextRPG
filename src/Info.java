

public class Info {
    public static void info(Humanoid C) {
        String ss= String.valueOf(C.sex);
        String shh=String.valueOf(C.HP);
        String mhp = String.valueOf(C.MaxHP);
        String mmp = String.valueOf(C.MaxMP);
        String smh=String.valueOf(C.manaP);
        String[][] info = new String[8][2];
        info[0][0] = "Name:";
        info[0][1] = C.name;
        info[1][0] = "Race:";
        info[1][1] = C.race;
        info[2][0] = "Sex:";
        info[2][1] = ss;
        info[3][0] = "Spec:";
        info[3][1] = C.spec;
        info[4][0] = "HP:";
        info[4][1] = shh;
        info[5][0] = "MP";
        info[5][1] = smh;
        info[6][0] = "MaxHP";
        info[6][1] = mhp;
        info[7][0] = "MaxMP";
        info[7][1]= mmp;


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(info[i][j] + " ");
            }
            System.out.println();
        }
    }
}
