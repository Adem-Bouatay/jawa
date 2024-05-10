public class StringUtil {
    public static int occCount(String ch, char c){
        if (ch.indexOf(c) == -1)
            return -1;
        int count = 0;
        int start = 0;
        while (ch.indexOf(c,start) != -1){
            count++;
            start = ch.indexOf(c,start)+1;
        }
        return count;
    }
    public static int occCount(String ch, String ch2){
        if (ch.indexOf(ch2) == -1)
            return -1;
        int count = 0;
        int start = 0;
        while (ch.indexOf(ch2,start) != -1){
            count++;
            start = ch.indexOf(ch2,start)+1;
        }
        return count;
    }
    public static int distinctCount(String ch){
        int count = 0;
        for (int i = 0; i<ch.length(); i++){
            if (StringUtil.occCount(ch, ch.charAt(i)) == 1)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String ch = "aademkaademaaq";
        System.out.println(StringUtil.occCount(ch, "aaa"));
        System.out.println(StringUtil.distinctCount(ch));
    }
}
