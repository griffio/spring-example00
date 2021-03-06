package griffio.beans.processor;

import com.google.common.base.Supplier;

public class UniqueProcessor implements Processor<String> {

    private final Supplier<String> uniqueId;

    public UniqueProcessor(Supplier<String> uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String execute() {
        return uniqueId.get();
    }

}
