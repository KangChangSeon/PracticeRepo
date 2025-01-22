package src.day11;

import java.util.Scanner;

public class Movie2 {
    public static void main(String[] args) {
        // 배열로 관리
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 영화의 총 개수를 입력하세요. ");
        int movieTotal = sc.nextInt();
        String movieArray[][] = new String[movieTotal][3];
        sc.nextLine();
        String tmp[] = new String[]{"영화제목", "출연배우", "등급"};

        //3개의 영화의 상세정보 목록 개수 3개(title,actor,grade)
        //영화 정보를 입력받고 내용이 자동으로 movieArray에 할당되도록 만들어주세요.
        for (int i = 0; i < movieArray.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(tmp[j] + "입력");
                movieArray[i][j] = sc.nextLine();
            }
        }
        for (int i = 0; i < movieArray.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tmp[j] + movieArray[i][j] + "|");
            }
            System.out.println();//
        }
    }
}