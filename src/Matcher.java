public class Matcher {
    public static boolean checkHL(Matrix m, String[] keyword, int i, int j){ //horizontal left, ex URANUS
        boolean flag = true;
        if (j + 1 - keyword.length < 0){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                // System.out.println(m.buffer[i][j - count] + " " + keyword[count]);
                if (!m.buffer[i][j - count].equals(keyword[count])){
                    flag = false;
                } else {
                    count++;
                }
            }
        }
        if(flag){
            Matrix temp = new Matrix(m.rows, m.cols);
            temp.blankMatrix();
            int a = 0;
            while (a < keyword.length){
                temp.buffer[i][j - a] = m.buffer[i][j - a];
                a++;
            }
            temp.printMatrix();
        }
        return flag;
    }

    public static boolean checkHR(Matrix m, String[] keyword, int i, int j){ //horizontal right, ex NEPTUNE
        boolean flag = true;
        if (j + keyword.length > m.cols){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                // System.out.println(m.buffer[i][j + count] + " " + keyword[count]);
                if (!m.buffer[i][j + count].equals(keyword[count])){
                    flag = false;
                } else {
                    count++;
                }
            }
        }
        if(flag){
            Matrix temp = new Matrix(m.rows, m.cols);
            temp.blankMatrix();
            int a = 0;
            while (a < keyword.length){
                temp.buffer[i][j + a] = m.buffer[i][j + a];
                a++;
            }
            temp.printMatrix();
        }
        return flag;
    }   

    public static boolean checkVU(Matrix m, String[] keyword, int i, int j){ //vertical upper, ex VITAL
        boolean flag = true;
        if (i - keyword.length + 1 < 0){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                // System.out.println(m.buffer[i - count][j] + " " + keyword[count]);
                if (!m.buffer[i - count][j].equals(keyword[count])){
                    flag = false;
                } else {
                    count++;
                }
            }
        }
        if(flag){
            Matrix temp = new Matrix(m.rows, m.cols);
            temp.blankMatrix();
            int a = 0;
            while (a < keyword.length){
                temp.buffer[i - a][j] = m.buffer[i - a][j];
                a++;
            }
            temp.printMatrix();
        }
        return flag;
    }

    public static boolean checkVL(Matrix m, String[] keyword, int i, int j){ //vertical lower, ex SATURN
        boolean flag = true;
        if (i + keyword.length > m.rows){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                // System.out.println(m.buffer[i + count][j] + " " + keyword[count]);
                if (!m.buffer[i + count][j].equals(keyword[count])){
                    flag = false;
                } else {
                    count++;
                }
            }
        }
        if(flag){
            Matrix temp = new Matrix(m.rows, m.cols);
            temp.blankMatrix();
            int a = 0;
            while (a < keyword.length){
                temp.buffer[i + a][j] = m.buffer[i + a][j];
                a++;
            }
            temp.printMatrix();
        }
        return flag;
    }

    public static boolean checkDLU(Matrix m, String[] keyword, int i, int j){ //diagonal left upper
        boolean flag = true;
        if (j + 1 - keyword.length < 0 || i - keyword.length + 1 < 0){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                // System.out.println(m.buffer[i - count][j - count] + " " + keyword[count]);
                if (!m.buffer[i - count][j - count].equals(keyword[count])){
                    flag = false;
                } else {
                    count++;
                }
            }
        }
        if(flag){
            Matrix temp = new Matrix(m.rows, m.cols);
            temp.blankMatrix();
            int a = 0;
            while (a < keyword.length){
                temp.buffer[i - a][j - a] = m.buffer[i - a][j = a];
                a++;
            }
            temp.printMatrix();
        }
        return flag;
    }

    public static boolean checkDLL(Matrix m, String[] keyword, int i, int j){ //diagonal left lower
        boolean flag = true;
        if (j + 1 - keyword.length < 0 || i + keyword.length > m.rows){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                // System.out.println(m.buffer[i + count][j - count] + " " + keyword[count]);
                if (!m.buffer[i + count][j - count].equals(keyword[count])){
                    flag = false;
                } else {
                    count++;
                }
            }
        }
        if(flag){
            Matrix temp = new Matrix(m.rows, m.cols);
            temp.blankMatrix();
            int a = 0;
            while (a < keyword.length){
                temp.buffer[i + a][j - a] = m.buffer[i + a][j - a];
                a++;
            }
            temp.printMatrix();
        }
        return flag;
    }

    public static boolean checkDRU(Matrix m, String[] keyword, int i, int j){ //diagonal right upper
        boolean flag = true;
        if (j + keyword.length > m.cols || i - keyword.length + 1 < 0){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                // System.out.println(m.buffer[i - count][j + count] + " " + keyword[count]);
                if (!m.buffer[i - count][j + count].equals(keyword[count])){
                    flag = false;
                } else {
                    count++;
                }
            }
        }
        if(flag){
            Matrix temp = new Matrix(m.rows, m.cols);
            temp.blankMatrix();
            int a = 0;
            while (a < keyword.length){
                temp.buffer[i - a][j + a] = m.buffer[i - a][j + a];
                a++;
            }
            temp.printMatrix();
        }
        return flag;
    }

    public static boolean checkDRL(Matrix m, String[] keyword, int i, int j){ //diagonal right lower, ex JUPITER
        boolean flag = true;
        if (j + keyword.length > m.cols || i + keyword.length > m.rows){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                // System.out.println(m.buffer[i + count][j + count] + " " + keyword[count]);
                if (!m.buffer[i + count][j + count].equals(keyword[count])){
                    flag = false;
                } else {
                    count++;
                }
            }
        }
        if(flag){
            Matrix temp = new Matrix(m.rows, m.cols);
            temp.blankMatrix();
            int a = 0;
            while (a < keyword.length){
                temp.buffer[i + a][j + a] = m.buffer[i + a][j + a];
                a++;
            }
            temp.printMatrix();
        }
        return flag;
    }
}