package New_Board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03 {
    //테스트 데이터 생성 메서드에서 등록날짜 코드가 중복이 발생하므로 메서드로 만들기.
    //테스트 데이터 고려해서 lastId 수정하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String>titles = new ArrayList<>();
        List<String>contents = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();
        List<String>today = new ArrayList<>();

        int id = 1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd.ss");

//        테스트 데이터 추가

        titles.add("안녕하세요 반갑습니다. 자바 공부중이에요.");
        contents.add("첫 번째 게시물 내용입니다.");
        ids.add(id);
        id++;
        today.add(LocalDateTime.now().format(formatter));

        titles.add("자바 질문좀 할게요~");
        contents.add("두 번째 게시물 내용입니다.");
        ids.add(id);
        id++;
        today.add(LocalDateTime.now().format(formatter));

        titles.add("정처기 따야되나요?");
        contents.add("세 번째 게시물 내용입니다.");
        ids.add(id);
        id++;
        today.add(LocalDateTime.now().format(formatter));

        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.equals("add")) {
                System.out.print("제목 : ");
                String title = sc.nextLine();
                System.out.print("내용 : ");
                String content = sc.nextLine();
                LocalDateTime currentDateTime = LocalDateTime.now();
                String formattedDateTime = currentDateTime.format(formatter);

                titles.add(title);
                contents.add(content);
                ids.add(id);
                id++;
                today.add(formattedDateTime);

                System.out.println("게시물이 등록됨.");
            } else if (cmd.equals("list")) {
                if (titles.isEmpty()) {
                    System.out.println("등록된 게시물 X");
                } else{
                    System.out.println("=================");
                    for (int i = 0; i < titles.size(); i++) {
                        System.out.println("번호 : " + ids.get(i));
                        System.out.println("제목 : " + titles.get(i));
                        System.out.println("===============");
                    }
                }
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int index = sc.nextInt();
                sc.nextLine();

                int targetIndex = -1;
                //전체탐색

                for (int i = 0; i < ids.size(); i++) {
                    int a = ids.get(i);

                    if (a == index){
                        targetIndex = i;
                        break;
                    }
                }

                if (targetIndex == -1){
                    System.out.println("게시물 X");
                } else {
                    System.out.print("새로운 제목 : ");
                    String newTitle = sc.nextLine();
                    System.out.print("새로운 내용 : ");
                    String newContent = sc.nextLine();
                    LocalDateTime currentDateTime = LocalDateTime.now();
                    String formattedDateTime = currentDateTime.format(formatter);

                    titles.set(targetIndex, newTitle);
                    contents.set(targetIndex, newContent);
                    today.set(targetIndex, formattedDateTime);


                    System.out.println(index + "번 내용 수정됨.");
                }
            } else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int index = sc.nextInt();
                sc.nextLine();

                int targetIndex = -1;

                //전체탐색
                for (int i = 0; i < ids.size(); i++) {
                    int a = ids.get(i);

                    if (a == index) {
                        targetIndex = i;
                        break;
                    }
                }

                if (targetIndex == -1) {
                    System.out.println("없는 게시물 번호다.");
                } else {
                    titles.remove(targetIndex);
                    contents.remove(targetIndex);
                    ids.remove(targetIndex);
                    System.out.println(index + "번 게시물 삭제됨.");
                }
            } else if (cmd.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int index = sc.nextInt();
                sc.nextLine();
                int targetIndex = -1;

                //게시물 번호에 해당하는 인덱스 찾기
                for (int i = 0; i < ids.size(); i++) {
                    int a  = ids.get(i);

                    if (a == index) {
                        targetIndex = i;
                        break;
                    }
                }

                if (targetIndex == -1) {
                    System.out.println("없는 게시물 번호다.");
                } else {
                    System.out.println("=============");
                    System.out.println("번호 : " + ids.get(targetIndex));
                    System.out.println("제목 : " + titles.get(targetIndex));
                    System.out.println("내용 : " + contents.get(targetIndex));
                    System.out.println("등록 날짜 : " + today.get(targetIndex));
                    System.out.println("=============");
                }
            } else if (cmd.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 명령어다.똑바로 해라.");
            }
        }
    }
}
