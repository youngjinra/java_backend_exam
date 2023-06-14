package New_Board;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.equals("exit")) {
                System.out.print("프로그램을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();
                System.out.println("게시물이 등록되었습니다.");

            }
        }
    }
}
