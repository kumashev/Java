public class Screen {
    private double diagonal = 0;
    private ScreenType type;
    private double weight = 0;

    public Screen(double diagonal, ScreenType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public ScreenType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public Screen setDiagonal(double diagonal){
        return new Screen(diagonal, type, weight);
    }

    public Screen setType(ScreenType type){
        return new Screen(diagonal, type, weight);
    }

    public Screen setWeight(double weight){
        return new Screen(diagonal, type, weight);
    }

}

