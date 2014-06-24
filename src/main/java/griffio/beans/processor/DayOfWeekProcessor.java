package griffio.beans.processor;

import com.google.common.base.Supplier;
import org.joda.time.LocalDate;

/**
 * Processor is true when the provided date is equal to the supplied day of the week
 */
public class DayOfWeekProcessor implements Processor<Boolean> {

    private final Supplier<LocalDate> currentDate;
    private final Supplier<Integer> isoDayOfWeek;

    public DayOfWeekProcessor(Supplier<LocalDate> currentDate, Supplier<Integer> isoDayOfWeek) {
        this.currentDate = currentDate;
        this.isoDayOfWeek = isoDayOfWeek;
    }

    public Boolean execute() {
        return currentDate.get().getDayOfWeek() == isoDayOfWeek.get();
    }

}
