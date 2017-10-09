public class Main {

    public static void main(String[] args) {
        int[] pole  = new int[10];

        int i;
        for (i = 0; i < 10; i++) {
            pole[i] = i + 1;
        }

        for ( int p : pole ) {
            System.out.println(p);
        }


    }
}
