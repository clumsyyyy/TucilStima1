public class Matrix {
    CharObj buffer[][];
    int rows;
    int cols;
    
    public Matrix(int row, int col){
        this.rows = row;
        this.cols = col;
        this.buffer = new CharObj[row][col];
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                this.buffer[i][j] = new CharObj(" ");
            }
        }
    }

    public void printOriMatrix(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                System.out.print(this.buffer[i][j].oriChar + " ");
            }
            System.out.println();
        }
    }

    public void printColorMatrix(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                System.out.print(this.buffer[i][j].colorChar + " ");
            }
            System.out.println();
        }
    }
}
