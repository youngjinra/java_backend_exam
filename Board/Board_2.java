package Board;

import java.util.Scanner;

public class Board_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("명령어 :");
            String cmd = sc.nextLine();

            if (cmd.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (cmd.equals("add")){
                System.out.printf("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.printf("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();
                System.out.println("게시물이 등록되었습니다.");
            }
        }
    }
}
