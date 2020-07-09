import java.util.*;

public class PuzzleJava{
    public static void main(String[] args){

        //Task 1
        int[] sumGreaterTen = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        int[] newArr = sumAndArray(sumGreaterTen);


        //Task 2
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        String[] namesFiveChar = shuffleReturnFiveChar(names);


        //Task 3

    }

    //Task 1
    public static int[] sumAndArray(int[] array){
        int sum = 0;
        ArrayList<Integer> listArr = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            if(array[i] > 10){
                listArr.add(array[i]);
            }
        }
        // System.out.println(sum);

        int[] returnArr = new int[listArr.size()];
        for (int j = 0; j < listArr.size(); j++){
            returnArr [j] = listArr.get(j);
            // System.out.println(returnArr[j]);
        }
        return returnArr;

    }


    //Task 2
    public static String[] shuffleReturnFiveChar(ArrayList<String> array){
        Collections.shuffle(array);
        System.out.println(array);
        ArrayList<String> listReturn = new ArrayList<String>();
        for (int i = 0; i < array.size(); i++){
            String check = array.get(i);
            if (check.length() > 5){
                listReturn.add(array.get(i));
            }
        }

        String[] returnArr = new String[listReturn.size()];
        for (int j = 0; j < returnArr.length; j++){
            returnArr[j] = listReturn.get(j);
            // System.out.println(returnArr[j]);
        }
        return returnArr;
    }


    //Task 3

}