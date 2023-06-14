package Board;

import java.util.Scanner;

public class Board_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                //add기능 구현
            }
        }
    }
}
