package Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> titles = new ArrayList<>();
        List<String> contents = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();

        int id = 1;

        while(true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();

                titles.add(title);
                contents.add(content);
                ids.add(id);
                id++;

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                if (titles.isEmpty()) {
                    System.out.println("등록된 게시물이 없습니다.");
                } else {
                    System.out.println("==================");
                    for (int i = 0; i < titles.size(); i++) {
                        System.out.println("번호 : " + ids.get(i));
                        System.out.println("제목 : " + titles.get(i));
                        System.out.println("==========================");
                    }
                }
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int index = sc.nextInt();
                sc.nextLine();

                int targetIndex = -1;

                // 전체탐색
                for (int i = 0; i < ids.size(); i++) {
                    int a  = ids.get(i);

                    if(a == index) {
                        targetIndex = i;
                        break;
                    }
                }

                if (targetIndex == -1){
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.print("새로운 제목 : ");
                    String newTitle = sc.nextLine();
                    System.out.print("새로운 내용 : ");
                    String newContent = sc.nextLine();

                    titles.set(targetIndex, newTitle);
                    contents.set(targetIndex, newContent);

                    System.out.println(index + "번 게시물이 수정되었습니다.");
                }

            } else if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 명령어입니다. 다시 입력해주세요.");
            }
        }
    }
}
