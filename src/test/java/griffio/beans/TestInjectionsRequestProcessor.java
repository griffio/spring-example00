package griffio.beans;

import griffio.beans.processor.Processor;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.inject.Provider;

@Test
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestInjectionsRequestProcessor extends AbstractTestNGSpringContextTests {

    @Autowired
    Provider<LocalDate> systemDate;

    @Autowired
    Processor<String> uniqueIdProcessor;

    @Autowired
    Processor<Boolean> dayOfWeekProcessor;

    public void isDateDifferentInstance() {
        Assert.assertNotSame(systemDate.get(), systemDate.get());
    }

    public void isUniqueIdProcessor() {
        Assert.assertNotEquals(uniqueIdProcessor.execute(), uniqueIdProcessor.execute());
    }

    public void isDayOfWeekProcessor() {
        Assert.assertTrue(dayOfWeekProcessor.execute());
    }


}
