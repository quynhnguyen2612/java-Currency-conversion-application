import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double vnd = usd * rate;
        System.out.print("Giá tri VND: " + vnd);
    }
}