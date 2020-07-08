public class StringManipulator{

    public String trimAndConcat(String s1, String s2){
        s1 = s1.trim();
        s2 = s2.trim();
        return s1+s2;
    }

    public Integer getIndexOrNull(String s1, char c1){
        int check = s1.indexOf(c1);

        if (check >= 0){
            return check;
        }
        else {
            return null;
        }
    }

    public Integer getIndexOrNull(String s1, String s2){
        int check = s1.indexOf(s2);

        if (check >= 0){
            return check;
        }
        else {
            return null;
        }
    }

    public String concatSubstring(String s1, int p1, int p2, String s2){
        return s1.substring(p1, p2) + s2;
    }
}