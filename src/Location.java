public class Location {
    public static String location(int x, int y){
        String lc=" ";
        int k=0;
        if((x>=138)&&(x<=162)&&(y>=63)&&(y<=87)){
            lc="The Fortress";
            k++;
        }
        if((x>=25)&&(x<=49)&&(y>=63)&&(y<=87)){
            lc="The Forest";
            k++;
        }
        if((x>=138)&&(x<=162)&&(y>=138)&&(y<=162)){
            lc="The Pillars";
            k++;
        }
        if((x>=63)&&(x<=87)&&(y>=-12)&&(y<=12)){
            lc="Dark Caves";
            k++;
        }
        if((x>=288)&&(x<=312)&&(y>=63)&&(y<=87)){
            lc="Capital of the Kingdom";
            k++;
        }
        if (k==0){
            lc=" You are on the high road";
        }
        return lc;
    }
}
