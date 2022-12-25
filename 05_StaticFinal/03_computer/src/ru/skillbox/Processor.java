public class Processor {
    private double frequency = 0;
    private int numberOfCores = 0;
    private String vendor = "";
    private double weight = 0;

    public Processor(double frequency, int numberOfCores, String vendor, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.vendor = vendor;
        this.weight = weight;

    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getVendor() {
        return vendor;
    }

    public double getWeight() {
        return weight;
    }
    public Processor setFrequency(double frequency){
        return new Processor(frequency, numberOfCores, vendor, weight);
    }
    public Processor setNumberOfCores(int numberOfCores){
        return new Processor(frequency, numberOfCores, vendor, weight);
    }
    public Processor setVendor(String vendor){
        return new Processor(frequency, numberOfCores, vendor, weight);
    }
    public Processor setWeight(double weight){
        return new Processor(frequency, numberOfCores, vendor, weight);
    }
}

