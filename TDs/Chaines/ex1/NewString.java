public class NewString{
    public String string;
    public int length;

    public NewString(String string){
        this.string = string;
        this.length = string.length();
    }
    public int compareTo(String string2){
        if (string.equals(string2))
            return 0;
        for (int i=0; i<Math.min(length,string2.length()); i++){
            if (string.charAt(i) == string2.charAt(i)){
                continue;
            }
            if (string.charAt(i) < string2.charAt(i))
                return -1;
            else
                return 1;
        }
        return length < string2.length() ? -1 : 1;
    }
    public static void main(String[] args) {
        String s1 = "adem";
        String s2 = "adam";
        System.out.println(s1.compareTo(s2));
        NewString s3 = new NewString(s1);
        System.out.println(s3.compareTo(s2));
    }
}