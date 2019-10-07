import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int maxsize = 50;
        int k = 2;
        MinHeap A = new MinHeap(maxsize, k);
        try ( Scanner fin = new Scanner(new File("karyHeap-input.txt"))) {
            while (fin.hasNextLine()) {
                Scanner in = new Scanner(fin.nextLine());
                String choice = in.next();
                if (choice.equals("IN")) {
                    A.insert(in.nextInt());
                }
                else
                    A.extractMin();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("There was no file found with the name karyHeap-input.txt");
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed/1000+" micro-sec");
    }

}
