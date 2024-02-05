package test;

public class level01 {

    public static void main(String[] args) {

        System.out.println("application01");

        int num1 = 20;
        int num2 = 30;

        int plus = num1 + num2;
        int minus = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("더하기 결과 : " + plus);
        System.out.println("빼기 결과 : " + minus);
        System.out.println("곱하기 결과 : " + multi);
        System.out.println("나누기 한 몫 : " + div);
        System.out.println("나누기 한 나머지 : " + mod);

        System.out.println("=============================");
        System.out.println("Application02");
        double weight = 12.5;
        double height = 36.4;

        double area = weight * height;
        double round = (weight + height) * 2;

        System.out.println("면적 : " + area);
        System.out.println("둘레 : " + round);

    }

}
