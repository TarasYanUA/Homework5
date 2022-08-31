package tarasYanishevskyi;

public class Task6 {
    public static void main(String[] args) {
        int a=60;
        int b=17;
        int c=55;
        int d=89;
        int e=180;

        System.out.println("Минимальное число: " + min(a,b,c,d,e));
    }

    private static int min(int a, int b, int c, int d, int e) {
        return Math.min(Math.min(Math.min(Math.min(a,b), c), d), e);
    }
}
