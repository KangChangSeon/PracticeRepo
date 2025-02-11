import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("관리할 영화 개수");
        int mvNum = sc.nextInt();
        sc.nextLine();
        String[][] mvArr = new String[mvNum][3]; // 영화 객체 타입 아니라 스트링 타입으로.

        for (int i = 0; i < mvNum; i++) {

                System.out.print("제목 입력: ");
                String title = sc.nextLine();
                System.out.print("러닝타임 입력: ");
                String runtime = sc.nextLine();
                System.out.print("등급입력: ");
                String grade = sc.nextLine();

                // 받은 스트링을 1행의 0, 1, 2에 저장.
                mvArr[i][0] = title;
                mvArr[i][1] = runtime;
                mvArr[i][2] = grade;

        }

        System.out.println("총 영화 정보:");
        for (int i = 0; i < mvArr.length; i++) {
            for (int j = 0; j < mvArr[i].length; j++) { // 행 하나당 길이 = 배열길이
                System.out.printf("%d 번째 영화의 %d번째 정보 : " + mvArr[i][j] + "\n", i, j);
            }
        }


    }
}
