public class Matcher {
    public static Exec checkHL(Matrix m, String[] keyword, int i, int j){ //horizontal left, ex URANUS
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        if (j + 1 - keyword.length < 0){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                compCount++;
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
            tempExec = new Exec(temp, compCount, flag);
        } else {
            tempExec = new Exec(new Matrix(0, 0), compCount, flag);
        }

        return tempExec;
    }

    public static Exec checkHR(Matrix m, String[] keyword, int i, int j){ //horizontal right, ex NEPTUNE
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;

        if (j + keyword.length > m.cols){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                compCount++;
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
            tempExec = new Exec(temp, compCount, flag);
        } else {
            tempExec = new Exec(new Matrix(0, 0), compCount, flag);
        }

        return tempExec;
    }   

    public static Exec checkVU(Matrix m, String[] keyword, int i, int j){ //vertical upper, ex VITAL
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;

        long tempTime = System.currentTimeMillis();
        if (i - keyword.length + 1 < 0){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                compCount++;
                // System.out.println(m.buffer[i - count][j] + " " + keyword[count]);
                if (!m.buffer[i - count][j].equals(keyword[count])){
                    flag = false;
                } else {
                    count++; 
                }
            }
        }
        if(flag){
            System.out.println(System.currentTimeMillis() - tempTime);
            Matrix temp = new Matrix(m.rows, m.cols);
            temp.blankMatrix();
            int a = 0;
            while (a < keyword.length){
                temp.buffer[i - a][j] = m.buffer[i - a][j];
                a++;
            }
            tempExec = new Exec(temp, compCount, flag);
        } else {
            tempExec = new Exec(new Matrix(0, 0), compCount, flag);
        }

        return tempExec;
    }

    public static Exec checkVL(Matrix m, String[] keyword, int i, int j){ //vertical lower, ex SATURN
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        if (i + keyword.length > m.rows){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                compCount++;
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
            tempExec = new Exec(temp, compCount, flag);
        } else {
            tempExec = new Exec(new Matrix(0, 0), compCount, flag);
        }

        return tempExec;
    }

    public static Exec checkDLU(Matrix m, String[] keyword, int i, int j){ //diagonal left upper
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        
        if (j + 1 - keyword.length < 0 || i - keyword.length + 1 < 0){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                compCount++;
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
                temp.buffer[i - a][j - a] = m.buffer[i - a][j - a];
                a++;
            }
            tempExec = new Exec(temp, compCount, flag);
        } else {
            tempExec = new Exec(new Matrix(0, 0), compCount, flag);
        }
        return tempExec;
    }

    public static Exec checkDLL(Matrix m, String[] keyword, int i, int j){ //diagonal left lower
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        
        if (j + 1 - keyword.length < 0 || i + keyword.length > m.rows){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                compCount++;
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
            tempExec = new Exec(temp, compCount, flag);
        } else {
            tempExec = new Exec(new Matrix(0, 0), compCount, flag);
        }

        return tempExec;
    }

    public static Exec checkDRU(Matrix m, String[] keyword, int i, int j){ //diagonal right upper
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        
        if (j + keyword.length > m.cols || i - keyword.length + 1 < 0){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                compCount++;
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
            tempExec = new Exec(temp, compCount, flag);
        } else {
            tempExec = new Exec(new Matrix(0, 0), compCount, flag);
        }

        return tempExec;
    }

    public static Exec checkDRL(Matrix m, String[] keyword, int i, int j){ //diagonal right lower, ex JUPITER
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        
        if (j + keyword.length > m.cols || i + keyword.length > m.rows){ 
            flag = false;
        } else {
            int count = 0;
            while (count < keyword.length && flag){
                compCount++;
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
            tempExec = new Exec(temp, compCount, flag);
        } else {
            tempExec = new Exec(new Matrix(0, 0), compCount, flag);
        }

        return tempExec;
    }
}