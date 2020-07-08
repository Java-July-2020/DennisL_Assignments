import java.util.*;
public class BasicJava{

    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //Print 1-255
        for (int i = 1; i < 256; i++){
            arrayList.add(i);
            System.out.println(i);
        }

        //Print odd numbers between 1-255
        for (int j = 0; j < arrayList.size(); j++){
            if (arrayList.get(j) % 2 != 0){
                System.out.println(arrayList.get(j));
            }
        }

        //Print Sum
        int sum = 0;
        for (int k = 0; k < arrayList.size(); k++){
            sum += arrayList.get(k);
            System.out.println("New number: " + arrayList.get(k) + " Sum: " + sum);
        }

        //Iterating through an array
        int x[] = {1, 3, 5, 7, 9, 13};
        for (int l = 0; l < x.length; l++){
            System.out.println(x[l]);
        }

        //Find Max
        int max = 0;
        int maxArray[] = {-3, -5, -7};
        // int maxArray[] = {-3, 0, -7};
        // int maxArray[] = {-3, 0, 2};
        for (int m = 0; m < maxArray.length; m++){
            if (m == 0){
                max = maxArray[m];
            }
            else {
                if (maxArray[m] > max){
                    max = maxArray[m];
                }
            }
        }
        System.out.println("The max element from the maxArray[] is: " + max);


        //Get Average
        int sum2 = 0;
        int aveArray[] = {2, 10, 3};
        for (int n = 0; n < aveArray.length; n++){
            sum2 += aveArray[n];
        }
        int ave = sum2/aveArray.length;
        System.out.println(ave);


        //Array with Odd Numbers
        ArrayList<Integer> arrListOdd = new ArrayList<Integer>();
        for (int p = 0; p <= 255; p++){
            if (p % 2 != 0){
                arrListOdd.add(p);
            }
        }
        int[] y = new int[arrListOdd.size()];

        for (int q = 0; q < y.length; q++){
            y[q] = arrListOdd.get(q);
            System.out.println(y[q]);
        }


        //Greater Than Y
        int[] arrayGreater = {1, 3, 5, 7};
        int y1 = 3;
        int count = 0;
        for (int r = 0; r < arrayGreater.length; r++){
            if (arrayGreater[r] > y1){
                count++;
            }
        }
        System.out.println(count);


        //Square the values
        int[] arrayX = {1, 5, 10, -2};
        for (int s = 0; s < arrayX.length; s++){
            arrayX[s] = arrayX[s] * arrayX[s];
            System.out.println(arrayX[s]);
        }


        //Emliminate Negative Numbers
        int[] arrayNeg = {1, 5, 10, -2};
        for (int t = 0; t < arrayNeg.length; t++){
            if(arrayNeg[t] < 0){
                arrayNeg[t] = 0;
            }
            System.out.println(arrayNeg[t]);
        }


        //Max, Min and Average
        double[] arrayMaxMinAve = {1, 5, 10, -2};
        double[] returnArray = returnMaxMinAve(arrayMaxMinAve);


        //Shifting the Values in the Array
        int[] arrayShift = {1, 5, 10, 7, -2};
        for (int v = 0; v < arrayShift.length; v++){
            if(v == arrayShift.length - 1){
                arrayShift[v] = 0;
            }
            else{
                arrayShift[v] = arrayShift[v+1];
            }
            System.out.println(arrayShift[v]);
        }

    }
            //Max, Min and Average
            public static double[] returnMaxMinAve(double[] array){
            double[] returnArr = new double[3];
            double max = 0;
            double min = 0;
            double sum = 0;
            for(int u = 0; u < array.length; u++){
                if(u == 0){
                    max = array[u];
                    max = array[u];
                    sum = array[u];
                }
                else {
                    if (array[u] > max){
                        max = array[u];
                    }
                    if (array[u] < min){
                        min = array[u];
                    }
                    sum += array[u];
                }
            }
            returnArr[0] = max;
            returnArr[1] = min;
            returnArr[2] = sum/array.length;

            System.out.println(returnArr[0] + " " + returnArr[1] + " " + returnArr[2]);
            return returnArr;
        }
}