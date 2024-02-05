package test;

public class level02 {

    public static void main(String[] args) {


        System.out.println("Application01");

        char ch1 = 'a';
        int ch2 =  ch1;
        System.out.println("문자 a의 unicode : " + ch2);
        /*변수 ch2 설정안하고 하는법*/
        System.out.println("문자 a의 unicode : " + (int) ch1);

        System.out.println("===================================");
        System.out.println("Application02");

        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        System.out.println("총점 : " + (int)(korean+math+english));
        System.out.println("평균 : " + (int)((korean+math+english)/3));






    }

}
