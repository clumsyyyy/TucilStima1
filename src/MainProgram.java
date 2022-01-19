import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args){
        Matrix m = new Matrix(100, 100);
        ArrayList<String> keywords = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the solver!");
        ReadFile.readText(m, keywords, sc);
        m.printMatrix();
        for(int i = 0; i < keywords.size(); i++){
            SearchWord.search(m, keywords.get(i));
        }
    }
}
