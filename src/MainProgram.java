import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args){
        long duration = 0;

        Matrix m = new Matrix(100, 100);
        ArrayList<String> keywords = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the solver!");
        ReadFile.readText(m, keywords, sc);

        System.out.println("Read puzzle from the file: ");
        m.printMatrix();
        System.out.println("\nThere are " + keywords.size() +" read keywords from the file: ");
        for(int i = 0; i < keywords.size(); i++){
            System.out.println("- " + keywords.get(i));
        }
        System.out.println();
        for(int i = 0; i < keywords.size(); i++){
            duration += SearchWord.search(m, keywords.get(i));
        }

        System.out.println("Comparison time in total (parsing excluded): " + duration + " ms.");
    }
}
