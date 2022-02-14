

public class Moving {
    public static int travelX(String Where,int x, int y,int d) {
        String k=" ";
        int p=0;
        int t=0;
        if(!Location.location(x,y).equals(" You are on the high road")){
            k=Location.location(x,y);
            p++;
        }
        if(Location.location(x,y).equals(" You are on the high road")){
            k=Location.location(x,y);
            t++;
        }
        if (Where.equals("East")){
            x=x+d;
            System.out.println("You are moving to the East");
        }
        if (Where.equals("West"))
        {
            x=x-d;
            System.out.println("you are moving to the West");
        }
        if(Location.location(x,y).equals(" You are on the high road")&&(p==1)) {
            System.out.println("You are leaving " + k);
        }
        if(!Location.location(x,y).equals(" You are on the high road")&& (t==1)) {
            System.out.println("You are entering " + Location.location(x,y));
        }
        return x;
    }
    public static int travelY(String Where,int x, int y, int d) {
        String k=" ";
        int p=0;
        int t=0;
        if(!Location.location(x,y).equals(" You are on the high road")){
            k=Location.location(x,y);
            p++;
        }
        if(Location.location(x,y).equals(" You are on the high road")){
            k=Location.location(x,y);
            t++;
        }
        if (Where.equals("North")){
            y+=d;
            System.out.println("you are moving to the North");
        }
        if (Where.equals("South"))
        {
            y-=d;
            System.out.println("you are moving to the South");
        }
        if(Location.location(x,y).equals(" You are on the high road")&& (p==1)) {
            System.out.println("You are leaving " + k);
        }
        if(!Location.location(x,y).equals(" You are on the high road")&& (t==1)) {
            System.out.println("You are entering " + Location.location(x,y));
        }
        return y;
    }

}
