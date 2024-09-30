package br.com.alura.screenmatch.modelos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("Interestelar", 2015);
        favorito.avalia(10);

        Filme outro = new Filme("Questão de Tempo", 2009);
        outro.avalia(10);

        Serie serie=new Serie("This is us", 2000);

        ArrayList<Titulo> lista=new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for(Titulo item : lista){
            System.out.println("Nome: " + item.getNome());
            if(item instanceof Filme ){}
        }

        ArrayList<Titulo> lista2 = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        Collections.sort(lista);
        System.out.println(lista);

    }
}
