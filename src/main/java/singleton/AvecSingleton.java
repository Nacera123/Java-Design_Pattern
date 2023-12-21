package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AvecSingleton {

    private Integer[] listInteger = {1, 2, 3 , 4};
    List<Integer> listeI = Arrays.asList(listInteger);

    private static String text;

    private static AvecSingleton instance;


    /* On fait une sorte de getter */
    public static AvecSingleton getInstance(){
        if (instance == null){
            instance = new AvecSingleton();
        }
        return instance;
    }
    private   AvecSingleton(){
        System.out.println("Object created");
        Collections.shuffle(listeI);
        System.out.println(this.hashCode());
        this.text = text;
    }

    public void printer(){
        for (Integer item: listeI){
            System.out.print(item.toString() + " ");
        }
        System.out.println();
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
