package SOLID.ISP;

public class ISP {
    public static void main(String[] args) {
        Scan scan = new Scanner();
        scan.scan();

        Print print = new Printer();
        print.print();

        PrintAndScan printAndScan = new ModernPrinter();
        printAndScan.print();
        printAndScan.scan();
    }
}
