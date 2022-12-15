package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosBaguncado {
    public static void main(String[] args) {

        //Hashset são conjuntos

        HashSet conjunto = new HashSet();

        //ele converte as variáveis automaticamente para tipos não primitivos.
        //o conjunto não aceita elementos repetidos
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        //sabendo o tamanho do conjunto
        System.out.println("Tamanho é "+conjunto.size());

        //Removendo elementos do conjunto
        System.out.println(conjunto.remove("Teste"));

        //para saber se contem algo no conjunto
        System.out.println(conjunto.contains(true));

        //pode criar set de outra maneira

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);//fazendo união de conjuntos
        conjunto.retainAll(nums); //fazendo intercesão de conjuntos
        conjunto.clear(); //esvazia o conjunto
        System.out.println(conjunto);

    }
}
