package griffio.beans.inject;

import com.google.common.base.Supplier;
import org.joda.time.LocalDate;

public class LocalDateSupplier implements Supplier<LocalDate> {

    private final LocalDate localDate;

    public LocalDateSupplier(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public LocalDate get() {
        return localDate;
    }
}
