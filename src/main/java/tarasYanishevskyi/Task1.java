package tarasYanishevskyi;

public class Task1 {

        public static void main(String[] args) {
            try {
                Task1.div(8, 0);
            } catch (Exception ex) {
                System.out.println("You cannot divide number by zero");
            }
        }

        public static void div(int a, int b) {
        int result = a / b;
                if (b != 0) {
                    System.out.println(result);
                }
        }
    }
