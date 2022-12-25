public class HardDisk {
    private Storagetype type;
    private int memorySize = 0;
    private int weight = 0;

    public HardDisk(Storagetype type, int memorySize, int weight) {
        this.type = type;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public Storagetype getType() {
        return type;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getWeight() {
        return weight;
    }

    public HardDisk setType(Storagetype type){
        return new HardDisk(type, memorySize, weight);
    }

    public HardDisk setMemorySize(int memorySize) {
        return new HardDisk(type, memorySize, weight);
    }

    public HardDisk setWeight(int weight){
        return new HardDisk(type, memorySize, weight);
    }
}

