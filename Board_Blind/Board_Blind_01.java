package Board_Blind;

import java.util.Scanner;

public class Board_Blind_01 {
    public static void main(String[] args) {
        //        1. 기능1 : 종료
//                - 명령어 : exit
//                - 설명 : 루프 종료.
//        - 입력출 예시
//  ```
//        명령어 : exit
//        프로그램을 종료합니다.
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.equals("exit")){
                System.out.println("프로그램을 종료합니다");
                break;

            }
        }



    }
}
