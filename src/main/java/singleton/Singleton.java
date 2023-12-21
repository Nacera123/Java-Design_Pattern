package singleton;

public class Singleton {
    // Variable String
    private String data;

    // Instance unique de la classe
    private static Singleton instance;

    // Constructeur privé pour empêcher l'instanciation directe
    private Singleton() {
        // Initialisation de la variable String
        data = "blabla";
    }

    // Méthode pour obtenir l'instance unique de la classe
    public static Singleton getInstance() {
        if (instance == null) {
            // Création de l'instance si elle n'existe pas encore
            instance = new Singleton();
        }
        return instance;
    }

    // Méthode pour accéder à la variable String
    public String getData() {
        return data;
    }

    // Méthode pour mettre à jour la variable String
    public void setData(String newData) {
        data = newData;
    }


}

