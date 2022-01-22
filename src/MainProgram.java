import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args){
        long duration = 0;
        long count = 0;
        Matrix m = new Matrix(100, 100);
        ArrayList<String> keywords = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the solver!");
        ReadFile.readText(m, keywords, sc);

        System.out.println("Read puzzle from the file: ");
        m.printOriMatrix();
        System.out.println("Size: " + m.rows + " x " + m.cols);
        System.out.println("\nThere are " + keywords.size() +" read keywords from the file: ");
        for(int i = 0; i < keywords.size(); i++){
            System.out.println("- " + keywords.get(i));
        }
        System.out.println();

        for(int i = 0; i < keywords.size(); i++){
            long[] results = SearchWord.search(m, keywords.get(i));
            duration += results[0];
            count += results[1];
        }

        m.printColorMatrix();
        System.out.println();
        System.out.println("Comparison time in total (parsing excluded): " + duration + " ms.");
        System.out.println("Comparison count in total: " + count + " time(s)");
        System.out.println("Press any key to quit...");
        sc.nextLine();
    }
}
