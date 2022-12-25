public class RAM {
    private String type = "";
    private int memorySize = 0;
    private double weight = 0;

    public RAM(String type, int memorySize, double weight) {
        this.type = type;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getWeight() {
        return weight;
    }
    public RAM setType(String type){
        return new RAM(type, memorySize, weight);
    }
    public RAM setMemorySize(int memorySize){
        return new RAM(type, memorySize, weight);
    }
    public RAM setWeight(double weight){
        return new RAM(type, memorySize, weight);
    }

}

