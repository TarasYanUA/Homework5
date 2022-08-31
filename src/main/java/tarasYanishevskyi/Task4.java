package tarasYanishevskyi;

public class Task4 {

    public static String multiply(String s)
    {
        String result = "";

        for(int i =0;i<5;i++){
            result+=s;
        }
        return result;
    }

    public static String multiply(String s, int count)
    {
        String result = "";

        for(int j= 0;j<count;j++ ){
            result+=s;
        }
        return result;
    }
    public static void main(String[]args){
        System.out.println(multiply("five times"));
        System.out.println(multiply("count",3));
    }
}
