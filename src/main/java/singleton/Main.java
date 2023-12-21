package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Objet Sans SINGLETON *********");


        System.out.println(" ** objet string ****");
        SansSingleton listS1 = new SansSingleton();
        listS1.printerString();

        SansSingleton listS2 = new SansSingleton();
        listS2.printerString();




        System.out.println(" ** objet integer ****");
        SansSingleton number1 = new SansSingleton();
        number1.printerInteger();

        SansSingleton number2 = new SansSingleton();
        number2.printerInteger();


        System.out.println(" ********* Objet Avec SINGLETON ********");
        AvecSingleton numberAvecSingleton1 = AvecSingleton.getInstance();
        AvecSingleton numberAvecSingleton2 = AvecSingleton.getInstance();

        numberAvecSingleton1.printer();
        numberAvecSingleton2.printer();
        System.out.println("***test text*******");

        TextSingleton text = TextSingleton.getInstance("titi");
        System.out.println("Donnée d'origine : " + text.getText());
        TextSingleton text1 = TextSingleton.getInstance("loulou");
        System.out.println("Donnée nouvelle: " + text1.getText());

        System.out.println("***test text exemple 2*******");
        // Utilisation du Singleton
        Singleton singleton = Singleton.getInstance();
        System.out.println("Donnée d'origine : " + singleton.getData());

        // Modification de la donnée via l'instance unique
        singleton.setData("pipi");
        System.out.println("Donnée mise à jour : " + singleton.getData());

        // Tentative de création d'une nouvelle instance (ne devrait pas être possible)
        Singleton newSingleton = Singleton.getInstance();
        System.out.println("Donnée de la nouvelle instance : " + newSingleton.getData());
        // Cette ligne devrait afficher la même donnée que la précédente, car il n'y a qu'une seule instance
    }
}
