//package Board_Blind;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Board_Blind_03 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        ArrayList<String> titles = new ArrayList<>();
//        ArrayList<String> bodies = new ArrayList<>();
//        ArrayList<Article> articles = new ArrayList<>();
//        int id =1;
//
//        while(true) {
//            System.out.printf("명령어 : ");
//            String cmd = sc.nextLine();
//
//            if (cmd.equals("exit")){
//                System.out.println("프로그램을 종료합니다.");
//                break;
//
//            } else if (cmd.equals("add")){
//                System.out.printf("게시물 제목을 입력해주세요 : ");
//                String title = sc.nextLine();
//                System.out.printf("게시물 내용을 입력해주세요 : ");
//                String body = sc.nextLine();
//
//                titles.add(title);
//                bodies.add(body);
//
//                Article article = new Article(id, title, body);
//                articles.add(article);
//
//                id++;
//
//                System.out.println("게시물이 등록되었습니다.");
//
//
//            } else if
//        }
//    }
//}
