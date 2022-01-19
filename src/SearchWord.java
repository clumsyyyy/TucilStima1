public class SearchWord {
    public static void search(Matrix m, String keyword){
        String[] keyArr = keyword.split("");
        String first = keyArr[0];
        for (int i = 0; i < m.rows; i++){
            for (int j = 0; j < m.cols; j++){
                if (first.equals(m.buffer[i][j])){
                    //System.out.println("Character found in " + i + " " + j);
                    if (Matcher.checkHL(m, keyArr, i, j)){
                        System.out.println(keyword + " FOUND HORIZONTAL LEFT");
                    }
                    else if (Matcher.checkHR(m, keyArr, i, j)){
                        System.out.println(keyword + " FOUND HORIZONTAL RIGHT");
                    }
                    else if (Matcher.checkVL(m, keyArr, i, j)){
                        System.out.println(keyword + " FOUND VERTICAL LOWER");
                    }
                    else if (Matcher.checkVU(m, keyArr, i, j)){
                        System.out.println(keyword + " FOUND VERTICAL UPPER");
                    }
                    else if (Matcher.checkDLU(m, keyArr, i, j)){
                        System.out.println(keyword + " FOUND DIAGONALLY LEFT UPPER");
                    }
                    else if (Matcher.checkDLL(m, keyArr, i, j)){
                        System.out.println(keyword + " FOUND DIAGONALLY LEFT LOWER");
                    }
                    else if (Matcher.checkDRL(m, keyArr, i, j)){
                        System.out.println(keyword + " FOUND DIAGONALLY RIGHT LOWER");
                    }
                    else if (Matcher.checkDRU(m, keyArr, i, j)){
                        System.out.println(keyword + " FOUND DIAGONALLY RIGHT UPPER");
                    }
                }
            }
        }
    }
}
