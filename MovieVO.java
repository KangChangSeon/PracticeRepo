package src.day11;
//
public class MovieVO {
    private String Title;
    private String OpenDay;
    private String Actor;
    private String Gener;
    private String RunningTime;
    private String Grade;
    public MovieVO(){};
    public MovieVO(String title, String gener, String grade) {
        Title = title;
        Gener = gener;
        Grade = grade;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "Title='" + Title + '\'' +
                ", OpenDay='" + OpenDay + '\'' +
                ", Actor='" + Actor + '\'' +
                ", Gener='" + Gener + '\'' +
                ", RunningTime='" + RunningTime + '\'' +
                ", Grade='" + Grade + '\'' +
                '}';
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setOpenDay(String openDay) {
        OpenDay = openDay;
    }

    public void setActor(String actor) {
        Actor = actor;
    }

    public void setGener(String gener) {
        Gener = gener;
    }

    public void setRunningTime(String runningTime) {
        RunningTime = runningTime;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getTitle() {
        return Title;
    }

    public String getOpenDay() {
        return OpenDay;
    }

    public String getActor() {
        return Actor;
    }

    public String getGener() {
        return Gener;
    }

    public String getRunningTime() {
        return RunningTime;
    }

    public String getGrade() {
        return Grade;
    }
}
