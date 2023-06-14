package Make_Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Make_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> contents = new ArrayList<>();


        while (true){
            System.out.printf("명령어 : ");
            String cmd = scan.nextLine();

            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                System.out.printf("게시물 제목을 입력해주세요 : ");
                String title = scan.nextLine();
                System.out.printf("게시물 내용을 입력해주세요 : ");
                String content = scan.nextLine();

                titles.add(title);
                contents.add(content);

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                if (titles.size() == 0) {
                    System.out.println("등록된 게시물이 없습니다.");
                    continue;
                }
                System.out.println("==================");
                for (int i = 0; i < titles.size(); i++) {
                    System.out.printf("번호 : %d\n", i + 1);
                    System.out.printf("제목 : %s\n", titles.get(i));
                    System.out.printf("내용 : %s\n", contents.get(i));
                    System.out.println("====================");
                }
            } else if (cmd.equals("update")) {
                System.out.printf("수정할 게시물 번호 : ");
                int target = scan.nextInt();
                int targetIdx = target - 1;
                scan.nextLine();

                if (targetIdx < 0 || target > titles.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }

                System.out.printf("제목 : ");
                String title = scan.nextLine();
                System.out.printf("내용 : ");
                String content = scan.nextLine();

                titles.set(targetIdx, title);
                contents.set(targetIdx, content);
            }
        }
    }
}
