public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(3, 4, "Intel", 200);
        RAM ram = new RAM("DDR4", 8, 100);
        HardDisk hard = new HardDisk(Storagetype.SSD, 1000, 500);
        Screen screen = new Screen(49, ScreenType.IPS, 5);
        Keyboard keyboard = new Keyboard("Механическая",true, 1 );
        Computer computer = new Computer("Intel", "Destroyer", processor, ram, hard, screen, keyboard);
        System.out.println(computer);

    }
}
