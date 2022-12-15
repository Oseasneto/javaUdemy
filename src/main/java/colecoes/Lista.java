package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<ListaUsuario> lista = new ArrayList<>();
        
        //Criando um usuário e adicionando a minha lista
        lista.add(new ListaUsuario("Carlos"));
        lista.add(new ListaUsuario("Lia"));
        lista.add(new ListaUsuario("Bia"));
        lista.add(new ListaUsuario("Manu"));
        lista.add(new ListaUsuario("Ana"));

        for (ListaUsuario u: lista ) {
            System.out.println(u.nome);
        }
        //mostrar um usuário específico
        System.out.println(lista.get(3)); //acessar pelo indice

        //removendo um elemento
        lista.remove(1); //removido pelo indice

        //ver se tem algo na lista
        System.out.println("Tem? " + lista.contains(new ListaUsuario("Carlos")));
    }
}
