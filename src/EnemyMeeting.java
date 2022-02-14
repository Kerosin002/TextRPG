public class EnemyMeeting {
    public static int meetingChance(int x,int y){
        int k=0;
        if(((x>137)&&(x<170)&&(y>100)&&(y<=150))||((x>170)&&(x<280)&&(y>0)&&(y<=150))||((x>50)&&(x<125)&&(y>0)&&(y<=150))||((x>137)&&(x<170)&&(y>0)&&(y<=50))) {

            int ch = (int) (Math.random() * 101);
            if (ch >= 65) {
                k++;
            }
        }
        return k;
    }
}
