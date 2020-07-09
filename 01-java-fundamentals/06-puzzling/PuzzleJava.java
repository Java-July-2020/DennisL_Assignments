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
        ArrayList<Character> alpha = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        suffleAlpha(alpha);


        //Task 4
        int[] ranArry = randomTen();


        //Task 5
        int[] ranArryDisplay = randomTenDisplay();


        //Task 6
        String randomStr = randomString();
        System.out.println(randomStr);


        //Task 7
        String[] ranStrTen = randomStringArray();
        for (int i = 0; i < ranStrTen.length; i++){
            System.out.println(ranStrTen[i]);
        }
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
        System.out.println(sum);

        int[] returnArr = new int[listArr.size()];
        for (int j = 0; j < listArr.size(); j++){
            returnArr [j] = listArr.get(j);
            System.out.println(returnArr[j]);
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
            System.out.println(returnArr[j]);
        }
        return returnArr;
    }


    //Task 3
    public static void suffleAlpha(ArrayList<Character> array){
        Collections.shuffle(array);
        for(int i = 0; i < array.size(); i++){
            if (i == array.size() - 1){
                System.out.println(array.get(i));
            }
        }
        for(int j = 0; j < array.size(); j++){
            if (j == 0){
                System.out.println(array.get(j));
                if (array.get(j).equals('a') ||  array.get(j).equals('e') || array.get(j).equals('i') ||
                array.get(j).equals('o') || array.get(j).equals('u') || array.get(j).equals('y')){
                    System.out.println("This is a vowel!");
                }
            }
        }

    }


    //Task 4
    public static int[] randomTen(){
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = 55 + (int) (Math.random() * 100);
            System.out.println(randomArray[i]);
        }
        return randomArray;

    }


    //Task5
        public static int[] randomTenDisplay(){
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = 55 + (int) (Math.random() * 100);
        }

        Arrays.sort(randomArray);
        for (int i = 0; i < randomArray.length; i++){
            if (i == 0 || i == randomArray.length - 1){
                System.out.println(randomArray[i]);
            }
        }
        return randomArray;
    }


    //Task 6
    public static String randomString(){
        StringBuilder word = new StringBuilder(5); 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 5; i++){
            int index = (int)(AlphaNumericString.length() * Math.random());
            word.append(AlphaNumericString.charAt(index));
        }
        String sword = String.valueOf(word.toString());
        return sword;
    }


    //Task 7
    public static String[] randomStringArray(){
        String[] stringArray = new String[10];
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        for (int i = 0; i < stringArray.length; i++){
            StringBuilder word = new StringBuilder(5);
            for (int j = 0; j < 5; j++){
                int index = (int)(AlphaNumericString.length() * Math.random());
                word.append(AlphaNumericString.charAt(index));
            }

            stringArray[i] = String.valueOf(word.toString());
        }
        return stringArray;
    }
}