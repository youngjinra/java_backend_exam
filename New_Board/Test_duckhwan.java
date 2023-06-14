package New_Board;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class Test_duckhwan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> titles = new ArrayList();
        ArrayList<String> bodies = new ArrayList();
        ArrayList<Integer> boardnum = new ArrayList();
        ArrayList<Integer> views = new ArrayList();
        ArrayList<String> comment = new ArrayList();
        ArrayList<Date> dateList = new ArrayList();
        ArrayList<Date> dateList2 = new ArrayList();
        ArrayList<Integer> recommendation = new ArrayList();
        Date currentDate = new Date();
        Date currentDate2 = new Date();
        int num = 0;


        titles.add("안녕하세요 반갑습니다. 자바 공부중이에요. ");
        titles.add("자바 질문좀 할게요~ ");
        titles.add("정처기 따야되나요? ");
        bodies.add(" ");
        bodies.add(" ");
        bodies.add(" ");
        comment.add(" ");
        comment.add(" ");
        comment.add(" ");
        dateList.add(currentDate);
        dateList.add(currentDate);
        dateList.add(currentDate);
        dateList2.add(currentDate2);
        dateList2.add(currentDate2);
        dateList2.add(currentDate2);
        boardnum.add(num += 1);
        boardnum.add(num += 1);
        boardnum.add(num += 1);
        views.add(1);
        views.add(1);
        views.add(1);
        recommendation.add(0);
        recommendation.add(0);
        recommendation.add(0);

        while (true) {
            System.out.print("명령어 : ");
            String sca = sc.nextLine();
            if (sca.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;


            } else if (sca.equals("add")) {
                System.out.println("게시물 제목을 입력해주세요: ");
                String sca1 = sc.nextLine();
                titles.add(sca1);
                System.out.println("게시물 내용을 입력해주세요: ");
                String sca2 = sc.nextLine();
                bodies.add(sca2);
                System.out.println("게시물이 등록되었습니다.");
                dateList.add(currentDate);
                boardnum.add(num += 1);
                views.add(1);
                comment.add(" ");
                recommendation.add(0);
                continue;


            } else if (sca.equals("help")) {
                System.out.println("아래는 이용가능한 명령어입니다.");
                System.out.println("add    : 게시물을 작성합니다.");
                System.out.println("list   : 게시물 목록을 확인합니다.");
                System.out.println("update : 게시물을 수정합니다.");
                System.out.println("delete : 게시물을 삭제합니다.");
                System.out.println("detail : 상세보기 를합니다.");
                System.out.println("search : 게시물을 검색합니다.");
            }


            if (sca.equals("list")) {
                for (int a = 0; a < titles.size(); a++) {
                    System.out.println("===========================");
                    System.out.println(boardnum.get(a) + "번째 게시판");
                    System.out.println("게시판 제목: " + titles.get(a));
                    System.out.println("게시판 내용: " + bodies.get(a));
                    System.out.println("===========================");
                }

            } else if (sca.equals("update")) {
                System.out.println("몇번째꺼 수정할거?: ");
                int sca6 = sc.nextInt();
                sc.nextLine();
                for (int bb = 0; bb < titles.size(); bb++) {
                    if (boardnum.get(bb) == sca6) {

                        System.out.println("게시물 제목을 수정해주세요: ");
                        String sca3 = sc.nextLine();
                        titles.set(bb, sca3);


                        System.out.println("게시물 내용을 수정해주세요: ");
                        String sca4 = sc.nextLine();
                        bodies.set(bb, sca4);

                        System.out.println("게시물이 수정되었습니다.");
                    }
                }


            } else if (sca.equals("delete")) {
                System.out.println("몇번꺼 지울라고?: ");
                int sca31 = sc.nextInt();
                sc.nextLine();
                for (int a = 0; a < titles.size(); a++) {
                    if (boardnum.get(a) == sca31) {
                        titles.remove(a);
                        boardnum.remove(a);
                        bodies.remove(a);
                        views.remove(a);
                        comment.remove(a);
                        recommendation.remove(a);
                        dateList2.remove(a);
                        dateList.remove(a);
                    }
                }
                System.out.println("제거되었습니다.");


            } else if (sca.equals("detail")) {
                System.out.println("상세보기");
                System.out.println("게시물 번호를 입력해 주세요: ");
                int sca66 = sc.nextInt();
                sc.nextLine();

                boolean non = true;

                for (int a1 = 0; a1 < titles.size(); a1++) {
                    if (boardnum.get(a1) == sca66) {
                        System.out.println(boardnum.get(a1) + "번째 게시판");
                        System.out.println("게시판 제목: " + titles.get(a1));
                        System.out.println("게시판 내용: " + bodies.get(a1));
                        System.out.println("등록일: " + dateList.get(a1));
                        System.out.println("조회수: " + views.get(a1));
                        System.out.println("댓글: " + comment.get(a1));
                        System.out.println("추천수: " + recommendation.get(a1));
                        views.set(a1, views.get(a1) + 1);
                        non = false;
                        break;
                    }


                }
                if (non) {
                    System.out.println("없는 게시판 입니다.");
                }
                while (true) {

                    System.out.println("상세보기 기능을 선택해주세요. (1. 댓글등록 2.추천 3.수정 4.삭제 5.목록으로)");
                    String sca53 = sc.nextLine();
                    if (sca53.equals("1")) {

                        for (int b = 0; b < comment.size(); b++) {
                            if (boardnum.get(b) == sca66) {
                                System.out.println("댓글을 입력해주세요.");
                                String scab = sc.nextLine();
                                comment.set(b, scab);
                                break;
                            }
                        }
                        dateList2.add(currentDate2);
                        break;

                    } else if (sca53.equals("2")) {

                        for (int b2 = 0; b2 < recommendation.size(); b2++) {
                            if (boardnum.get(b2) == sca66) {
                                System.out.println("추천합니다.");
                                recommendation.set(b2, b2 + 1);
                            }
                        }
                        break;
                    } else if (sca53.equals("3")) {
                        System.out.println("수정할 댓글 내용을 입력해주세요");
                        String scab2 = sc.nextLine();
                        for (int b3 = 0; b3 < comment.size(); b3++) {
                            if (boardnum.get(b3) == sca66) {
                                comment.set(b3, scab2);
                                recommendation.set(b3, 0);
                            }
                        }
                        break;
                    } else if (sca53.equals("4")) {
                        System.out.println("삭제합니다.");
                        for (int b4 = 0; b4 < comment.size(); b4++) {
                            if (boardnum.get(b4) == sca66) {
                                comment.remove(b4);
                                dateList2.remove(b4);
                            }
                        }
                        break;
                    } else if (sca53.equals("5")) {
                        System.out.println("1. 목록재선택 2. 명령어선택");
                        int scab3 = sc.nextInt();
                        sc.nextLine();
                        if (scab3 == 2) {
                            break;
                        }
                    }
                }


            } else if (sca.equals("search")) {
                System.out.println("제목을 검색해 주세요: ");
                String sca43 = sc.nextLine();
                int search = titles.indexOf(sca43);
                try {
                    System.out.println("게시판 제목: " + titles.get(search));
                    System.out.println("게시판 내용: " + bodies.get(search));
                } catch (IndexOutOfBoundsException s2) {
                    System.out.println("존재하지 않는 제목입니다.");
                }


            } else {

                System.out.println("잘못된 명령어 입니다.");


            }
        }
    }
}