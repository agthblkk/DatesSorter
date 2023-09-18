import java.time.LocalDate;
import java.util.*;
public class DateSorter {
    public static Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> datesWithR = new ArrayList<>();
        List<LocalDate> datesWithoutR = new ArrayList<>();

        List<LocalDate> sortedDates = new ArrayList<>();

        for (LocalDate date : unsortedDates) {
            if (date.getMonth().toString().toLowerCase().contains("r")) {
                datesWithR.add(date);
            } else {
                datesWithoutR.add(date);
            }
        }

        datesWithR.sort(LocalDate::compareTo);

        datesWithoutR.sort(Collections.reverseOrder());

        sortedDates.addAll(datesWithR);
        sortedDates.addAll(datesWithoutR);

        return sortedDates;
    }
}
