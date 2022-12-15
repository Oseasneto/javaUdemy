package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        //o map é como se fosse tabela (tem chave valor)
        Map <Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo"); //substituiu o valor pois a chave é a mesma
        usuarios.put(2, "Alan");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());

        System.out.println(usuarios.keySet()); //as chaves
        System.out.println(usuarios.values()); //valores
        System.out.println(usuarios.entrySet()); //chave e valor ao mesmo tempo

        System.out.println(usuarios.containsKey(3));//contem chave 3
        System.out.println(usuarios.get(3)); // qual o valor da chave 3?

        //percorrendo as chaves
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }
        //percorrendo valores
        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }
        //percorrendo os dois
        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
