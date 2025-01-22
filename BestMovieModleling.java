package src.day11;

import java.util.Scanner;

public class BestMovieModleling {
    public static void main(String[] args) {
        // 배열로 관리
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 영화의 총 개수를 입력하세요. ");
        int movieTotal = sc.nextInt();
        sc.nextLine();
        MovieVO[] movieArray;

        movieArray = new MovieVO[movieTotal];
        //3개의 영화의 상세정보 목록 개수 3개(title,actor,grade)
        //영화 정보를 입력받고 내용이 자동으로 movieArray에 할당되도록 만들어주세요.
        for (int i = 0; i < movieArray.length; i++) {
            MovieVO movie = new MovieVO();
            movieArray[i] = movie;
            System.out.print("영화제목 : ");
            movie.setTitle(sc.nextLine());
            System.out.print("배우 : ");
            movie.setActor(sc.nextLine());
            System.out.print("등급 : ");
            movie.setGrade(sc.nextLine());
        }
        for(int i = 0; i<movieArray.length; i++){
            MovieVO mv = movieArray[i];
            System.out.print("영화제목 "+ mv.getTitle()+" | ");
            System.out.print("출연배우 "+mv.getActor()+" | ");
            System.out.print("등급 "+mv.getGrade()+" | ");
            System.out.println();
        }
    }
}


//
//        MovieVO avata = new MovieVO("아바타","액션","15세");
//        avata.setOpenDay("2022.12.14");
//        avata.setActor("제이크설리");
//        avata.setRunningTime("192");
//
//
//
//        System.out.println("*".repeat(15)+avata.getTitle()+"영화정보"+"*".repeat(15));
//        System.out.printf("제목 : %s%n",avata.getTitle());
//        System.out.printf("배우 : %s%n",avata.getActor());
//        System.out.printf("러닝타임 : %s%n",avata.getRunningTime());
//        System.out.printf("장르 : %s%n",avata.getGener());
//        System.out.printf("관람등급 : %s%n",avata.getGrade());
//        System.out.println("*".repeat(37));
//    }
//}
