public class SearchWord {
    public static long search(Matrix m, String keyword){
        String[] keyArr = keyword.split("");
        String first = keyArr[0];
        boolean found = false;
        int i = 0;
        int j = 0;
        int count = 0;
        long tempStart = System.currentTimeMillis();
        long time = 0;

        System.out.println("Searching the keyword \'" + keyword + "\'..." );
        
        while (i < m.rows && !found){
            while (j < m.cols && !found){
                count++;
                if (first.equals(m.buffer[i][j])){
                    Exec temp = Matcher.checkHL(m, keyArr, i, j);
                    if (!found){
                        count += temp.count;
                        if (temp.flag){
                            temp.m.printMatrix();
                            time = System.currentTimeMillis() - tempStart;
                            System.out.println(keyword + " FOUND HORIZONTAL LEFT");
                            System.out.println("Number of comparison: " + count + " time(s).");
                            System.out.println("Comparison time: " + time + " ms.");
                            found = true;
                        }
                    }
                    
                    temp = Matcher.checkHR(m, keyArr, i, j);
                    if (!found){
                        count += temp.count;
                        if (temp.flag){
                            temp.m.printMatrix();
                            time = System.currentTimeMillis() - tempStart;
                            System.out.println(keyword + " FOUND HORIZONTAL RIGHT");
                            System.out.println("Number of comparison: " + count + " time(s).");
                            System.out.println("Comparison time: " + time+ " ms.");
                            found = true;
                        }
                    }


                    temp = Matcher.checkVL(m, keyArr, i, j);
                    if (!found){
                        count += temp.count;
                        if (temp.flag){
                            temp.m.printMatrix();
                            time = System.currentTimeMillis() - tempStart;
                            System.out.println(keyword + " FOUND VERTICAL LOWER");
                            System.out.println("Number of comparison: " + count + " time(s).");
                            System.out.println("Comparison time: " + time + " ms.");
                            found = true;
                        }
                    }


                    temp = Matcher.checkVU(m, keyArr, i, j);
                    if (!found){
                        count += temp.count;
                        if (temp.flag ){
                            temp.m.printMatrix();
                            time = System.currentTimeMillis() - tempStart;
                            System.out.println(keyword + " FOUND VERTICAL UPPER");
                            System.out.println("Number of comparison: " + count + " time(s).");
                            System.out.println("Comparison time: " + time + " ms.");
                            found = true;
                        } 
                    }
                    

                    temp = Matcher.checkDLU(m, keyArr, i, j);
                    if (!found){
                        count += temp.count;
                        if (temp.flag){
                            temp.m.printMatrix();
                            time = System.currentTimeMillis() - tempStart;
                            System.out.println(keyword + " FOUND DIAGONALLY LEFT UPPER");
                            System.out.println("Number of comparison: " + count + " time(s).");
                            System.out.println("Comparison time: " + time + " ms.");
                            found = true;
                        } 
                    }
                    

                    temp = Matcher.checkDLL(m, keyArr, i, j);
                    if (!found){
                        count += temp.count;
                        if (temp.flag){
                            temp.m.printMatrix();
                            time = System.currentTimeMillis() - tempStart;
                            System.out.println(keyword + " FOUND DIAGONALLY LEFT LOWER");
                            System.out.println("Number of comparison: " + count + " time(s).");
                            System.out.println("Comparison time: " + time + " ms.");
                            found = true;
                        }
                    }

                    temp = Matcher.checkDRL(m, keyArr, i, j);
                    if (!found){
                        count += temp.count;
                        if (temp.flag){
                            temp.m.printMatrix();
                            time = System.currentTimeMillis() - tempStart;
                            System.out.println(keyword + " FOUND DIAGONALLY RIGHT LOWER");
                            System.out.println("Number of comparison: " + count + " time(s).");
                            System.out.println("Comparison time: " + time + " ms.");
                            found = true;
                        } 
                    }
                    

                    temp = Matcher.checkDRU(m, keyArr, i, j);
                    if (!found){
                        count += temp.count;
                        if (temp.flag && !found){
                            temp.m.printMatrix();
                            time = System.currentTimeMillis() - tempStart;
                            System.out.println(keyword + " FOUND DIAGONALLY RIGHT UPPER");
                            System.out.println("Number of comparison: " + count + " time(s).");
                            System.out.println("Comparison time: " + time + " ms.");
                            found = true;
                        } 
                    }  
                }
                j = j + 1;
            }
            j = 0;
            i = i + 1;
        }
        if (!found){
            time = System.currentTimeMillis() - tempStart;
            System.out.println("Keyword \'" + keyword + "\' not found...");
            System.out.println("Number of comparison: " + count + " time(s).");
            System.out.println("Comparison time: " + time + " ms.");
        }
        System.out.println();
        return time;
    }
}
