package test;

public class Levell01 {

    public static void main(String[] args) {

        System.out.println("Application01");

        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x+=2);
        System.out.println( !('A' <= c && c <='Z') );
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);


        System.out.println("=============================");
        System.out.println("Application02");

        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1: 0);

        // numOfApples / sizeOfBucket = 몫 : 9
        // numOfApples % sizeOfBucket = 나머지 2
        // 나머지가 0보다 클 경우 1을 반환
        // 나머지가 0일 경우 0을 반환

        System.out.println("필요한 바구니의 수 : " + numOfBucket);

    }

}
