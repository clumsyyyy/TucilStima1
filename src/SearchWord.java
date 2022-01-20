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
                    System.out.println(i + " " + j + " " + count);
                    Exec temp = Matcher.checkHL(m, keyArr, i, j);
                    if (temp.flag && !found){
                        temp.m.printMatrix();
                        time = System.currentTimeMillis() - tempStart;
                        System.out.println(keyword + " FOUND HORIZONTAL LEFT");
                        System.out.println("Number of comparison: " + count + " time(s).");
                        System.out.println("Comparison time: " + time + " ms");
                        found = true;
                    } else {
                        count += temp.count; System.out.println(count + " " + temp.count);
                    }

                    temp = Matcher.checkHR(m, keyArr, i, j);
                    if (temp.flag && !found){
                        temp.m.printMatrix();
                        time = System.currentTimeMillis() - tempStart;
                        System.out.println(keyword + " FOUND HORIZONTAL RIGHT");
                        System.out.println("Number of comparison: " + count + " time(s).");
                        System.out.println("Comparison time: " + time+ " ms");
                        found = true;
                    } else {
                        count += temp.count; System.out.println(count + " " + temp.count);
                    }


                    temp = Matcher.checkVL(m, keyArr, i, j);
                    if (temp.flag && !found){
                        temp.m.printMatrix();
                        time = System.currentTimeMillis() - tempStart;
                        System.out.println(keyword + " FOUND VERTICAL LOWER");
                        System.out.println("Number of comparison: " + count + " time(s).");
                        System.out.println("Comparison time: " + time + " ms");
                        found = true;
                    } else {
                        count += temp.count; System.out.println(count + " " + temp.count);
                    }

                    temp = Matcher.checkVU(m, keyArr, i, j);
                    if (temp.flag && !found){
                        temp.m.printMatrix();
                        time = System.currentTimeMillis() - tempStart;
                        System.out.println(keyword + " FOUND VERTICAL UPPER");
                        System.out.println("Number of comparison: " + count + " time(s).");
                        System.out.println("Comparison time: " + time + " ms");
                        found = true;
                    } else {
                        count += temp.count; System.out.println(count + " " + temp.count);
                    }

                    temp = Matcher.checkDLU(m, keyArr, i, j);
                    if (temp.flag && !found){
                        temp.m.printMatrix();
                        time = System.currentTimeMillis() - tempStart;
                        System.out.println(keyword + " FOUND DIAGONALLY LEFT UPPER");
                        System.out.println("Number of comparison: " + count + " time(s).");
                        System.out.println("Comparison time: " + time + " ms");
                        found = true;
                    } else {
                        count += temp.count; System.out.println(count + " " + temp.count);
                    }

                    temp = Matcher.checkDLL(m, keyArr, i, j);
                    if (temp.flag && !found){
                        temp.m.printMatrix();
                        time = System.currentTimeMillis() - tempStart;
                        System.out.println(keyword + " FOUND DIAGONALLY LEFT LOWER");
                        System.out.println("Number of comparison: " + count + " time(s).");
                        System.out.println("Comparison time: " + time + " ms");
                        found = true;
                    } else {
                        count += temp.count; System.out.println(count + " " + temp.count);
                    }

                    temp = Matcher.checkDRL(m, keyArr, i, j);
                    if (temp.flag && !found){
                        temp.m.printMatrix();
                        time = System.currentTimeMillis() - tempStart;
                        System.out.println(keyword + " FOUND DIAGONALLY RIGHT LOWER");
                        System.out.println("Number of comparison: " + count + " time(s).");
                        System.out.println("Comparison time: " + time + " ms");
                        found = true;
                    } else {
                        count += temp.count; System.out.println(count + " " + temp.count);
                    }

                    temp = Matcher.checkDRU(m, keyArr, i, j);
                    if (temp.flag && !found){
                        temp.m.printMatrix();
                        time = System.currentTimeMillis() - tempStart;
                        System.out.println(keyword + " FOUND DIAGONALLY RIGHT UPPER");
                        System.out.println("Number of comparison: " + count + " time(s).");
                        System.out.println("Comparison time: " + time + " ms");
                        found = true;
                    } else {
                        count += temp.count; System.out.println(count + " " + temp.count);
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
            System.out.println("Comparison time: " + time + " ms");
        }
        System.out.println();
        return time;
    }
}
