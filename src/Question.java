import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
//        문제1) 점수를 입력받아 점수 및 등급을 출력하는 프로그램을 작성하세요
//        else if 문을 사용하여 작성
//        A+ = 95 이상 A = 90 이상 B+ = 85이상 B = 80점이상 C+ = 75이상 C = 70이상 D = 60이상 60미만은 F
//        중첩 if문을 사용하여 중간점수 +대의 점수를 출력

        Scanner scan = new Scanner(System.in);

//        System.out.println("점수를 입력하세요 : ");
//
//        int grade = scan.nextInt();
//        if(grade >= 90) {
//            if (grade >= 95) {
//                System.out.println("당신의 점수는 " + grade + "이고 당신의 성적은 A+ 입니다.");
//            } else {
//                System.out.println("당신의 점수는 "+ grade + "이고 당신의 성적은 A 입니다.");
//            }
//        }
//        else if(grade >= 80){
//            if(grade >= 85){
//                System.out.println("당신의 점수는 "+grade+"이고 당신의 성적은 B+ 입니다.");
//            }
//            else{
//                System.out.println("당신의 점수는 "+grade+"이고 당신의 성적은 B 입니다.");
//            }
//        }
//        else if(grade >= 70){
//            if(grade >= 75){
//                System.out.println("당신의 점수는 "+grade+"이고 당신의 성적은 C+ 입니다.");
//            }
//            else {
//                System.out.println("당신의 점수는 "+grade+"이고 당신의 성적은 C 입니다.");
//            }
//        }
//        else if(grade >=60){
//            System.out.println("당신의 점수는 "+grade+"이고 당신의 성적은 D 입니다.");
//        }
//        else {
//            System.out.println("당신의 점수는 "+grade+"이고 당신의 성적은 F 입니다.");
//        }

//        연습문제 6
        System.out.println("돈의 액수를 입력하세요>>");
        int money = scan.nextInt();
        int m50000 = money/50000;
        money = money%50000;
        int m10000 = money/10000;
        money = money%10000;
        int m1000 = money/1000;
        money = money%1000;
        int m500 = money/500;
        money = money % 500;
        int m100 = money/100;
        money = money%100;
        int m10 = money/10;
        money = money%10;

        System.out.println("오만원권 "+m50000+"개");
        System.out.println("만원권 "+m10000+"개");
        System.out.println("천원권 "+m1000+"개");
        System.out.println("오백원 "+m500+"개");
        System.out.println("백원 "+m100+"개");
        System.out.println("십원 "+m10+"개");
        System.out.println("일원 "+money+"개");



//      연습문제 7
        System.out.println("성적을 입력하세요");
        String grade = scan.next();
        switch(grade){
            case "A":
            case "B":
                System.out.println("Excellent");
                break;

            case "C":
            case "D":
                System.out.println("Good");
                break;
            case "F":
                System.out.println("Bye");
                break;
        }
//      9번 문제
        System.out.println("1~99사이의 정수를 입력하세요 >>");

        int a = scan.nextInt(); //숫자 입력
        int first = a / 10; // 10으로 나눈 몫
        int second = a % 10;// 10으로 나눈 나머지

        if(first == 3 || first == 6 || first == 9){
            if(second == 3 || second ==6 || second ==9){
                System.out.println("박수짝짝");
            }
            else {
                System.out.println("박수짝");
            }
        }
        else{
            if(second==3 || second==6 || second==9){
                System.out.println("박수짝");
            }
            else {
                System.out.println("박수없음");
            }
        }



    }
}
