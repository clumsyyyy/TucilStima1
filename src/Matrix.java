public class Matrix {
    String buffer[][];
    int rows;
    int cols;
    
    public Matrix(int row, int col){
        this.rows = row;
        this.cols = col;
        this.buffer = new String[row][col];
    }

    public void printMatrix(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                System.out.print(this.buffer[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void blankMatrix(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                this.buffer[i][j] = ".";
            }
        }
    }
}
