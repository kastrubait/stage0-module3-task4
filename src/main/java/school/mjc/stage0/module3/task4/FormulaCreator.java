package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double res;
        int a=1, b=1, c=1;
        int pres1 = 9 * a * a - 5 * b + a - 7;
        double pres2 = (a + b - 4 * a * c) >> 1;
        res = pres1 * pres2;
        System.out.println(res);
    }
}
