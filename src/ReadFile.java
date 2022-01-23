import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFile{
    public static void readText(Matrix m, ArrayList<String> keywords, Scanner sc){

        String filename = "";

        System.out.print("Input your filename (without .txt): ");
        filename = sc.nextLine();
        while (filename == ""){
            System.out.print("Input your filename (without .txt): ");
            filename = sc.nextLine();
        }
        try{
            File text = new File("test/" + filename + ".txt");
            Scanner sizeReader = new Scanner(text);
            int rowSize = 1;

            while (sizeReader.hasNextLine() && !sizeReader.nextLine().equals("")){
                rowSize++;
            }
            
            sizeReader.close();
            m.rows = rowSize - 1;
            
            Scanner lineReader = new Scanner(text);
            m.cols = 0;
            try{
                for(int i = 0; i < m.rows; i++){
                    String line = lineReader.nextLine();
                    String rows[] = line.split(" ");
                    if (m.cols < rows.length){
                        m.cols = rows.length;
                    }
                    for(int j = 0; j < rows.length; j++){
                        m.buffer[i][j] = new CharObj(rows[j]);
                    }

                    if (rows.length < m.cols){
                        for(int j = rows.length + 1; j  < m.cols; j++){
                            m.buffer[i][j] = new CharObj(" ");
                        }
                    }
                }
                lineReader.nextLine();
                while(lineReader.hasNextLine()){
                    String kw = lineReader.nextLine();
                    keywords.add(kw);
                }
                
            } finally {
                lineReader.close();
            }


        } catch (FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}