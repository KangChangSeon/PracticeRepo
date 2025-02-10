package yes;

import java.util.List;

public interface SudentIO extends StudentInput,SearchSutent,SortedStudent{
    List<String> saveStudntData();
    List<String> getStudntData();
}
