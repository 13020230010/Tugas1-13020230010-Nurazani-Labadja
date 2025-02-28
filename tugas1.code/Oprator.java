public class Oprator {
    public static void main(String[] args) {
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;

        Bool1 = true;
        Bool2 = false;
        TF = Bool1 && Bool2;
        TF = Bool1 || Bool2;
        TF = !Bool1;
        TF = Bool1 ^ Bool2;

        i = 5;
        j = 2;
        hsl = i + j;
        hsl = i - j;
        hsl = i / j;
        hsl = i * j;
        hsl = i / j;
        hsl = i % j;

        TF = (i == j);
        TF = (i != j);
        TF = (i < j);
        TF = (i > j);
        TF = (i <= j);
        TF = (i >= j);

        x = 5.0f;
        y = 3.0f;

        TF = (x != y);
        TF = (x < y);
        TF = (x > y);
        TF = (x <= y);

        res = x + y;
        res = x - y;
        res = x / y;
        res = x * y;

        System.out.println("Hasil perbandingan dan operasi: " + TF);
        System.out.println("Hasil operasi numerik: " + res);
    }
}
