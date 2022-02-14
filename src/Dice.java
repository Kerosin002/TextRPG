public class Dice {
    public static int dice(){
        int c1=0;
        int c2=0;
        while((c1==0)||(c2==0)) {
            c1 = (int) (Math.random() * 7);
            c2 = (int) (Math.random() * 7);
        }
        System.out.println(c1+" "+c2);
        return c1+c2;
    }
}
