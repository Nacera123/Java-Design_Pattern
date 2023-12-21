package factory;

public class Sandwich {

    private String name;
    private float calorie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCalorie() {
        return calorie;
    }

    public void setCalorie(float calorie) {
        this.calorie = calorie;
    }


    public String preparing() {
        return "Sandwitch " +
                 name + " is prepared with  "  + calorie +
                        ", calories ";
    }
}
