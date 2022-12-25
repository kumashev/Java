public class Printer {
    private String queue = "";
    private double totalPages = 0;
    private int totalDocumentsPrinted = 0;

    public void append(String text) {

        append(text, 0, 0);
    }

    public void append(String text, int documentsPrinted) {

        append(text, documentsPrinted,0);
    }

    public void append(String text, int documentsCount , double pagesCount) {
        queue = queue + "\n" +  text + " - " + documentsCount + " - " + pagesCount;
        totalPages = totalPages + pagesCount;
        totalDocumentsPrinted = totalDocumentsPrinted + documentsCount;
    }
    public void  clear() {

        queue = "";
        totalPages = 0;
        totalDocumentsPrinted = 0;
    }
    public double getTotalPages() {
        return totalPages;
    }
    public int getTotalDocumentsPrinted() {
        return totalDocumentsPrinted;
    }


    public void print(String title) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
        }
        System.out.println(queue);

        System.out.println("Общее количество распечатанных страниц: " + totalPages);
        System.out.println("Общее количество распечатанных документов: " + totalDocumentsPrinted);
        System.out.println("Общее количество распечатанных страниц и документов: " + totalPages + " - " + totalDocumentsPrinted);
        clear();
    }

}
