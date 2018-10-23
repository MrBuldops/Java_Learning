public class Printer {


    private int tonerLevel; //%%%
    private int pagesPrinted;
    private boolean isDuplex;

    public void FillToner(int inkAdded){

        if(tonerLevel+ inkAdded > 100)
            tonerLevel = 100;
        else if (inkAdded < 0)
            tonerLevel = tonerLevel;
        else
            tonerLevel = tonerLevel+ inkAdded;

        System.out.println("Toner level: "+tonerLevel);
    }

    public void printPage(){

        if(isDuplex){
            tonerLevel = tonerLevel -4;
            if(tonerLevel>0) {
                System.out.println("page was printed on both sides");
                pagesPrinted = pagesPrinted + 1;
            }
            else {
                System.out.println("Printing cancled. Toner is empty.");
            }
        }
        else {
            tonerLevel = tonerLevel - 2;
            if (tonerLevel > 0) {
                System.out.println("page was printed");
                pagesPrinted = pagesPrinted + 1;
            } else {
                System.out.println("Printing cancled. Toner is empty.");
            }
        }
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }
}
