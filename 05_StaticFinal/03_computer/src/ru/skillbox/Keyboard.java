public class Keyboard {
    private String type = "";
    private final boolean backlight;
    private double weight = 0;

    public Keyboard(String type, boolean backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public double getWeight() {
        return weight;
    }

    public Keyboard setType(String type){
        return new Keyboard(type, backlight, weight);
    }

    public Keyboard setBacklight(boolean backlight){
        return new Keyboard(type, backlight, weight);
    }

    public Keyboard setWeight(double weight){
        return new Keyboard(type, backlight, weight);
    }


}

