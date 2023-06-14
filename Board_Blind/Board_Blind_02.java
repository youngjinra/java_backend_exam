package Board_Blind;

import java.util.Scanner;

public class Board_Blind_02 {
    public static void main(String[] args) {
//        명령어 : add
//        게시물 제목을 입력해주세요 : 제목1
//        게시물 내용을 입력해주세요 : 내용1
//        게시물이 등록되었습니다.
//        명령어 : add
//        게시물 제목을 입력해주세요 : 제목2
//        게시물 내용을 입력해주세요 : 내용2
//        게시물이 등록되었습니다.

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            if(cmd.equals("add") ){
                System.out.println("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.println("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();
                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("exit")){
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }
    }
}
