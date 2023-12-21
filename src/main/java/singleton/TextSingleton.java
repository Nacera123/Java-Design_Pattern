package singleton;

public class TextSingleton {

    private static  TextSingleton instance;
    private String text;

    private TextSingleton(String text) {
        this.text = text;
        System.out.println(hashCode());
    }

    public  static TextSingleton getInstance(String text){
        if (instance == null){

                instance = new TextSingleton(text);
        }
        return instance;
    }


    public String getText() {
        return text;
    }

    public void setText(String newText) {
        text = newText;
    }

    /*
    * 1- Creer la variable
    * 2- la construire en private et sans args
    * 3- Creer une private static instance avec le nom du constructeur
    * 4- Creer getter pour instance
    */

}
