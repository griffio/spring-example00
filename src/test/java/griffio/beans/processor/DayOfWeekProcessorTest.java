package griffio.beans.processor;

import com.google.common.base.Supplier;
import griffio.beans.day.DaySupplier;
import griffio.beans.inject.LocalDateSupplier;
import org.joda.time.LocalDate;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DayOfWeekProcessorTest {

    public void isDayOfWeekMonday() {

        Supplier<LocalDate> mondaySupplier = new LocalDateSupplier(LocalDate.parse("2014-02-03"));
        Processor<Boolean> dayOfWeekProcessor = new DayOfWeekProcessor(mondaySupplier, new DaySupplier());
        Assert.assertTrue(dayOfWeekProcessor.execute());

    }
}
