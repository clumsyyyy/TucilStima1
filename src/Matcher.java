public class Matcher {
    public static Exec checkHL(Matrix m, String[] keyword, int i, int j){ //horizontal left
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        int count = 1;

        while (count < keyword.length && flag && (j - count >= 0)){
            compCount++;
            if (!m.buffer[i][j - count].oriChar.equals(keyword[count])){
                flag = false;
            } else {
                count++;
            }
        }

        if(count == keyword.length && j - (keyword.length - 1) >= 0){
            int a = 0;
            while (a < keyword.length){
                m.buffer[i][j - a].colorChar =  "\u001B[1m\u001B[38;5;" + (((keyword.length + (16 *  i)  + (16 * j) + 19) % 185) + 20) + "m" + m.buffer[i][j - a].oriChar + "\u001B[0m";
                a++;
            }
        }

        tempExec = new Exec(compCount, (count == keyword.length && j - (keyword.length - 1) >= 0));
        return tempExec;
    }

    public static Exec checkHR(Matrix m, String[] keyword, int i, int j){ //horizontal right
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        int count = 1;

        while (count < keyword.length && flag && (j + count <= m.cols)){
            compCount++;
            if (!m.buffer[i][j + count].oriChar.equals(keyword[count])){
                flag = false;
            } else {
                count++;
            }
        }

        if(count == keyword.length && (j + (keyword.length - 1) <= m.cols - 1)){
            int a = 0;
            while (a < keyword.length){
                m.buffer[i][j + a].colorChar  =  "\u001B[1m\u001B[38;5;" + (((keyword.length + (16 *  i)  + (16 * j) + 19) % 185) + 20) + "m" + m.buffer[i][j + a].colorChar + "\u001B[0m";
                a++;
            }
        }

        tempExec = new Exec(compCount, (count == keyword.length && j + (keyword.length - 1) <= m.cols - 1));
        return tempExec;
    }   

    public static Exec checkVU(Matrix m, String[] keyword, int i, int j){ //vertical upper
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        int count = 1;

        while (count < keyword.length && flag && (i - count >= 0)){
            compCount++;
            if (!m.buffer[i - count][j].oriChar.equals(keyword[count])){
                flag = false;
            } else {
                count++; 
            }
        }
    
        if(count == keyword.length && (i - (keyword.length - 1) >= 0)){
            int a = 0;
            while (a < keyword.length){
                m.buffer[i - a][j].colorChar  =  "\u001B[1m\u001B[38;5;" + (((keyword.length + (16 *  i)  + (16 * j) + 19) % 185) + 20) + "m" + m.buffer[i - a][j].oriChar + "\u001B[0m";
                a++;
            }
        }

        tempExec = new Exec(compCount, (count == keyword.length && (i - (keyword.length - 1) >= 0)));
        return tempExec;
    }

    public static Exec checkVL(Matrix m, String[] keyword, int i, int j){ //vertical lower
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        int count = 1;

        while (count < keyword.length && flag && (i + count <= m.rows)){
            compCount++;
            if (!m.buffer[i + count][j].oriChar.equals(keyword[count])){
                flag = false;
            } else {
                count++;
            }
        }
        
        if(count == keyword.length && (i + (keyword.length - 1) <= m.rows - 1)){
            int a = 0;
            while (a < keyword.length){
                m.buffer[i + a][j].colorChar  =  "\u001B[1m\u001B[38;5;" + (((keyword.length + (16 *  i)  + (16 * j) + 19) % 185) + 20) + "m" + m.buffer[i + a][j].oriChar + "\u001B[0m";
                a++;
            }
        }

        tempExec = new Exec(compCount, (count == keyword.length && (i + (keyword.length - 1) <= m.rows - 1)));
        return tempExec;
    }

    public static Exec checkDLU(Matrix m, String[] keyword, int i, int j){ //diagonal left upper
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        int count = 1;

        while (count < keyword.length && flag && (j - count >= 0) && (i - count >= 0)){
            compCount++;
            if (!m.buffer[i - count][j - count].oriChar.equals(keyword[count])){
                flag = false;
            } else {
                count++;
            }
        }
        
        if(count == keyword.length && j - (keyword.length - 1) >= 0 && (i - (keyword.length - 1) >= 0) ){
            int a = 0;
            while (a < keyword.length){
                m.buffer[i - a][j - a].colorChar  =  "\u001B[1m\u001B[38;5;" + (((keyword.length + (16 *  i)  + (16 * j) + 19) % 185) + 20) + "m" + m.buffer[i - a][j - a].oriChar + "\u001B[0m";
                a++;
            }
        }

        tempExec = new Exec(compCount, (count == keyword.length && j - (keyword.length - 1) >= 0 && (i - (keyword.length - 1) >= 0)));
        return tempExec;
    }

    public static Exec checkDLL(Matrix m, String[] keyword, int i, int j){ //diagonal left lower
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        int count = 1;

        while (count < keyword.length && flag && (j - count >= 0) && (i + count <= m.rows)){
            compCount++;
            if (!m.buffer[i + count][j - count].oriChar.equals(keyword[count])){
                flag = false;
            } else {
                count++;
            }
        }
        
        if(count == keyword.length && j - (keyword.length - 1) >= 0 && (i + (keyword.length - 1) <= m.rows - 1)){
            int a = 0;
            while (a < keyword.length){
                m.buffer[i + a][j - a].colorChar  =  "\u001B[1m\u001B[38;5;" + (((keyword.length + (16 *  i)  + (16 * j) + 19) % 185) + 20) + "m" + m.buffer[i + a][j - a].oriChar + "\u001B[0m";
                a++;
            }
        }

        tempExec = new Exec(compCount, (count == keyword.length && j - (keyword.length - 1) >= 0 && (i + (keyword.length - 1) <= m.rows - 1)));
        return tempExec;
    }

    public static Exec checkDRU(Matrix m, String[] keyword, int i, int j){ //diagonal right upper
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        int count = 1;

        while (count < keyword.length && flag && (j + count <= m.cols) && (i - count >= 0)){
            compCount++; 
            //System.out.println(m.buffer[i - count][j + count].oriChar + " " + keyword[count]);
            if (!m.buffer[i - count][j + count].oriChar.equals(keyword[count])){
                flag = false;
            } else {
                count++;
            }
        }
        if(count == keyword.length && (i - (keyword.length - 1) >= 0) && (j + (keyword.length - 1) <= m.cols - 1)){
            int a = 0;
            while (a < keyword.length){
                m.buffer[i - a][j + a].colorChar  =  "\u001B[1m\u001B[38;5;" + (((keyword.length + (16 *  i)  + (16 * j) + 19) % 185) + 20) + "m" + m.buffer[i - a][j + a].oriChar + "\u001B[0m";
                a++;
            }
        }

        tempExec = new Exec(compCount, (count == keyword.length && (i - (keyword.length - 1) >= 0) && (j + (keyword.length - 1) <= m.cols - 1)));
        return tempExec;
    }

    public static Exec checkDRL(Matrix m, String[] keyword, int i, int j){ //diagonal right lower
        boolean flag = true;
        int compCount = 0;
        Exec tempExec;
        int count = 1;
        while (count < keyword.length && flag && (j + count <= m.cols) && (i + count <= m.rows)){
            compCount++;
            
            if (!m.buffer[i + count][j + count].oriChar.equals(keyword[count])){
                flag = false;
            } else {
                count++;

            }
        }
        
        if(count == keyword.length && (j + (keyword.length - 1) <= m.cols - 1) && (i + (keyword.length - 1) <= m.rows - 1)){
            int a = 0;
            while (a < keyword.length){
                m.buffer[i + a][j + a].colorChar  =  "\u001B[1m\u001B[38;5;" + (((keyword.length + (16 *  i)  + (16 * j) + 19) % 185) + 20) + "m" + m.buffer[i + a][j + a].oriChar + "\u001B[0m";
                a++;
            }
        }
        tempExec = new Exec(compCount, (count == keyword.length && (j + (keyword.length - 1) <= m.cols - 1) && (i + (keyword.length - 1) <= m.rows - 1)));
        return tempExec;
    }
}