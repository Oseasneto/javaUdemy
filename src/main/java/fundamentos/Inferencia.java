package fundamentos;

public class Inferencia {

    public static void main(String[] args) {
        // o java faz a inferencia de que tipo é a variável
        var b = 4.5;
        System.out.println(b);
        var c = "Texto";
        System.out.println(c);
        c = "outro texto";
        System.out.println(c);
    }
}
