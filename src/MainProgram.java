import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args){
       
        long duration = 0;
        long count = 0;
        long[] results;
        Matrix m = new Matrix(100, 100);
        ArrayList<String> keywords = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" ____  _     ____  ____  _____ ____  ____  ____  _    ");
        System.out.println("/  __\\/ \\ /\\/_   \\/_   \\/  __//  _ \\/  __\\/   _\\/ \\ /|");
        System.out.println("|  \\/|| | || /   / /   /|  \\  | / \\||  \\/||  /  | |_||");
        System.out.println("|  __/| \\_/|/   /_/   /_|  /_ | |-|||    /|  \\_ | | ||");
        System.out.println("\\_/   \\____/\\____/\\____/\\____\\\\_/ \\|\\_/\\_\\\\____/\\_/ \\|");
        System.out.println();

        System.out.println("Welcome to the Puzzearch solver!");

        ReadFile.readText(m, keywords, sc);
        
        System.out.println("Read puzzle from the file: (Size: " + m.rows + " x " + m.cols + ")");
        m.printOriMatrix();
        
        System.out.println("\nThere are " + keywords.size() +" read keywords from the file: ");
        for(int i = 0; i < keywords.size(); i++){
            System.out.println("- " + keywords.get(i));
        }

        System.out.println("Press any key to start searching!");
        sc.nextLine();

        SearchWord.search(m, keywords.get(0), -1);

        for(int i = 0; i < keywords.size(); i++){            
            results = SearchWord.search(m, keywords.get(i), i);
            duration += results[0];
            count += results[1];
        }

        
        m.printColorMatrix();
        System.out.println();
        System.out.println("Comparison time in total (parsing excluded): " );
        System.out.println(duration + " ns (" + String.format("%.3f", (double)(duration / 10e5)) + " ms)");
        System.out.println("Comparison count in total: " + count + " time(s)");
        System.out.println("Press any key to quit...");
        sc.nextLine();
    }
}
