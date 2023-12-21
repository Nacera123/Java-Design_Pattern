package singleton;

import java.util.*;

public class SansSingleton {
    private String[] listeString = {"1", "2", "3", "4"};
    private List<String> listeS = Arrays.asList(listeString);

    private Integer[] listInteger = {1, 2, 3 , 4};
    List<Integer> listeI = Arrays.asList(listInteger);

    public SansSingleton(){
        System.out.println("l'objet a été crée");
        /* Pour generer un ordre  aléatoire de notre liste */
        Collections.shuffle(listeS);
        Collections.shuffle(listeI);
        System.out.println(this.hashCode());
    }
    
    public void printerString(){

        for (String i: listeS) {

            System.out.print(i + " ") ;
        }
        System.out.println();

    }
    public void printerInteger(){
        for (Integer i: listeI ){
            System.out.print(i.toString() + " ");
        }
        System.out.println();

    }
}
