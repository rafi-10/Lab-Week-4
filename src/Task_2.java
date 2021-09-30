public class Task_2 {
    public static void main(String[] args) {
        SeriesPrinter a = new SeriesPrinter();

        System.out.println(a.printSeries(5));
        System.out.println(a.printSeries(5,10));
        System.out.println(a.printSeries(5,15,3));
    }
}
class SeriesPrinter {
    int printSeries(int n) {
        System.out.print("printSeries("+n+") -> ");
        int i = 0;
        while (i != n){
            System.out.print(i + " ");
            i++;
        }
        return n;
    }
    int printSeries(int startindex , int endindex) {
        System.out.print("printSeries("+startindex+","+endindex + ") -> ");
        /*for (int i = startindex; i < endindex; i++) {
            System.out.print(i + " ");
        }*/
        int i= startindex;
        while (i != endindex){
            System.out.print(i + " ");
            i++;
        }
        return endindex;
    }
    int printSeries(int startindex, int endindex, int interval) {
        System.out.print("printSeries(" + startindex + "," + endindex + "," + interval + ") -> ");
        for (int i = startindex; i < endindex; i++) {
            System.out.print(i + " ");
            i = i + interval;
            i--;
        }
        return 0;
    }
}






























