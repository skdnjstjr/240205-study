package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. java.util.Scanner 를 이용한 다양한 자료형 값 받아보기. */

        /* 목차. 1. Scanner 객체 생성 */
        // Application app = new Application();
        /* 목차. 1-1. 원래는 이렇게 Scanner 객체를 만들어야 한다. */
//        java.util.Scanner sc = new java.util.Scanner(System.in);

        /* 목차. 1-2. 다른 패키지에 있는 클래스 사용시 패키지명을 생략하기 위해 import 를 사용. */
        Scanner sc = new Scanner(System.in);

        /* 목차. 2. 자료형별 값 입력받기 */
        /* 필기. nextLine() : 입력 받은 값을 문자열로 반환해줌. */
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다");

        /* 목차. 2-1. 정수형 값 입력 받기. */
        /* 필기. nextInt() : 입력받은 값을 int 형으로 반환한다.*/
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");

        /* 필기. nextLong() : 입력 받은 값을 long 형으로 반환한다.*/
        System.out.print("금액을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 "+money+ "원 입니다.");

        /* 필기. nextFloat() : 입력 받은 값을 float 형으로 반환한다. */
        System.out.print("키를 입력해주세요 : ");
        float height = sc.nextFloat();
        System.out.println("입려갛신 키는"+ height+ "cm 입니다.");

        /* 필기. nextDouble() : 입력 받은 값을 double 형으로 반환한다. */
        System.out.print("원하는 실수를 입력하세요 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 "+ number+ "입니다.");

        /* 필기. nextBoolean() : 입력 받은 값을 boolean 형으로 반환한다. */
        System.out.print("참과 거짓 둘 중 한 가지를 true of false 로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리값은"+ isTrue+"입니다.");

        /* 목차. 2-5. 문자형 값 입력받기 */
        sc.nextLine();
        System.out.print("아무 문자나 입력해주세요 : ");
        char ch = sc.nextLine().charAt(0);      //charAt메소드는 정수를 전달해주면 해당하는 번호의 문자를 반환해준다 0이 첫번째기준
        System.out.println("입력하신 문자는 "+ ch+ "입니다.");



    }

}
