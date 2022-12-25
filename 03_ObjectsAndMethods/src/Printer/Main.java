public class Main {
    public static void main(String[] args) {
        Printer document1 = new Printer();
        document1.append("Olleh dlrow!",1,18);
        document1.append("!Dlrow olleh", 1, 10);
        document1.print("random symbols: ");
        Printer document2 = new Printer();
        document2.append("Hello world!", 1, 9);
        document2.append("!World hello",1, 12);
        document2.print("random symbols: ");
    }
}
