public class teste {
    public static void main(String[] args) {

        double s = 1500;
        double n = 0;
        if (s < 1450){
        n = s*(7.5/100);
        } else if ( s > 1450) {
            n = 10/4;
        }
        System.out.println(n);
    }
}
