public class Computer {

    private final String vendor;
    private final String name;
    private final Processor processor;
    private final RAM ram;
    private final HardDisk hard;
    private final Screen screen;
    private final Keyboard keyboard;
    private double totalWeight;

    public Computer(String vendor, String name, Processor processor, RAM ram, HardDisk hard, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.hard = hard;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public HardDisk getHard() {
        return hard;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double getTotalWeight() {
        return processor.getWeight() + ram.getWeight() + hard.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public Computer setVendor(String vendor){
        return new Computer(vendor, name, processor, ram, hard, screen, keyboard);
    }

    public Computer setName(String name){
        return new Computer(vendor, name, processor, ram, hard, screen, keyboard);
    }

    public Computer setProcessor(Processor processor){
        return new Computer(vendor, name, processor, ram, hard, screen, keyboard);
    }

    public Computer setRam(RAM ram){
        return new Computer(vendor, name, processor, ram, hard, screen, keyboard);
    }

    public Computer setHard(HardDisk hard){
        return new Computer(vendor, name, processor, ram, hard, screen, keyboard);
    }

    public Computer setScreen(Screen screen){
        return new Computer(vendor, name, processor, ram, hard, screen, keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard){
        return new Computer(vendor, name, processor, ram, hard, screen, keyboard);
    }


    public String toString(){
        return "Производитель Компьютера: " + vendor + "\n" + "Название компютера: " +
                name + "\n" + "Характеристики компьютера: " + "\n" + "Процессор: "  + processor.getFrequency() + " ГГц., " +
                processor.getNumberOfCores() + " ядерный, "  + processor.getVendor() + " ," + processor.getWeight() + "гр." + "\n" +
                "ОЗУ: " + ram.getType() + "," + ram.getMemorySize() + "Гб.," + ram.getWeight() + "гр." + "\n" +
                "Жесткий диск: " + hard.getType() + "," + hard.getMemorySize() + "Гб.," + hard.getWeight() + "гр." + "\n" +
                "Экран: " + screen.getDiagonal() + " дюймов, " + screen.getType() + "," + screen.getWeight() + "кг." + "\n" +
                "Клавиатура: " + keyboard.getType() + "," + "Есть подсветка: " + keyboard.isBacklight() + "," +
                keyboard.getWeight() + "кг.";
    }
}

