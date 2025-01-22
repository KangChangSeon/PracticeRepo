package Day11;

import java.util.Scanner;

class MovieVO {
    private String title;
    private String openDay;
    private String actor;
    private String runtime;
    private String gener;
    private String grade;

    public MovieVO() {
    }

    public MovieVO(String title, String openDay, String actor, String runtime, String gener, String grade) {
        this.title = title;
        this.openDay = openDay;
        this.actor = actor;
        this.runtime = runtime;
        this.gener = gener;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", openDay='" + openDay + '\'' +
                ", actor='" + actor + '\'' +
                ", runtime=" + runtime +
                ", gener='" + gener + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getGrade() {
        return grade;
    }

    public String getGener() {
        return gener;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getActor() {
        return actor;
    }

    public String getOpenDay() {
        return openDay;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOpenDay(String openDay) {
        this.openDay = openDay;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class BestVOModeling {
    public static void main(String[] args) {
        // 레벨업 : 5개의 영화를 배열로 관리하고 싶다.
        // movieArray를 만들어 5개의 영화정보를 입력 한 후 해당 전체 영화 리스트를 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 영화의 총 개수를 입력하세요.");
        int movieTotal = sc.nextInt();
        sc.nextLine();
        System.out.println("각 영화당 상세정보 개수를 입력하세요");
        int movieInfo = sc.nextInt();
        sc.nextLine();
        MovieVO[][] movieArray = new MovieVO[movieTotal][movieInfo];

        // 3개의 영화의 상세정보 목록의 개수는 3개(title, actor, grade)
        // 정보를 입력 받고 해당 영화정보의 내용이 자동으로 movieArray에 할당되도록 만들 것
        // 영화 정보 입력 for 문을 작성하고 슬랙으로 제출하세요
        for (int i = 0; i < movieTotal; i++) {
            MovieVO movie = new MovieVO();
            System.out.println("\n[" + (i + 1) + "번째 영화 입력]");

            System.out.print("제목: ");
            movie.setTitle(sc.nextLine());

            System.out.print("개봉일: ");
            movie.setOpenDay(sc.nextLine());

            System.out.print("배우: ");
            movie.setActor(sc.nextLine());

            System.out.print("런닝타임 (분): ");
            movie.setRuntime(sc.nextLine());

            System.out.print("장르: ");
            movie.setGener(sc.nextLine());

            System.out.print("등급: ");
            movie.setGrade(sc.nextLine());

            movieArray[i][0] = movie;
        }

        sc.close();

        System.out.println("\n======== 개별 영화 상세 정보 ========");
        for (int i = 0; i < movieTotal; i++) {
            MovieVO mv = movieArray[i][0];
            System.out.println("+++++++++ " + mv.getTitle() + " 영화정보 +++++++++++");
            System.out.printf("제목 : %s\n", mv.getTitle());
            System.out.printf("개봉일 : %s\n", mv.getOpenDay());
            System.out.printf("배우 : %s\n", mv.getActor());
            System.out.printf("런닝타임 : %s 분\n", mv.getRuntime());
            System.out.printf("장르 : %s\n", mv.getGener());
            System.out.printf("등급 : %s세 이상 관람 가능\n", mv.getGrade());
            System.out.println();
        }
    }
}
