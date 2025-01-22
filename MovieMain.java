import java.io.*;
import java.util.Arrays;

public class MovieMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 콘솔로 출력

        bw.write("관리할 영화 개수: ");
        bw.flush();
        int mvNum = Integer.parseInt(br.readLine());
        MovieVO[][] mvArr = new MovieVO[mvNum][mvNum];

        for (int i = 0; i < mvNum; i++) {
            MovieVO mvVO = new MovieVO();
            for (int j = 0; j < mvNum; j++) {
                bw.write("영화 제목 입력: ");
                bw.flush();
                String mvTitle = br.readLine();
                mvVO.setTitle(mvTitle);
                bw.write("영화 러닝타임 입력: ");
                bw.flush();
                String mvRunningTime = br.readLine();
                mvVO.setRunningTime(mvRunningTime);
                bw.write("영화 등급 입력: ");
                bw.flush();
                String mvGrade = br.readLine();
                mvVO.setGrade(mvGrade);
                mvArr[i][j] = mvVO;
                bw.write("입력된 영화 정보는: " + mvArr[i][j] + "\n");
                bw.flush();
            }
            bw.write("총  영화 목록은: " + Arrays.deepToString(mvArr));
            bw.flush();
        }

    }
}
