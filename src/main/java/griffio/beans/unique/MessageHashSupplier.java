package griffio.beans.unique;

import com.google.common.base.Supplier;
import com.google.common.hash.Hashing;

import java.security.SecureRandom;

public class MessageHashSupplier implements Supplier<String> {

    private final SecureRandom secureRandom = new SecureRandom();

    @Override
    public String get() {
        byte[] bytes = new byte[64];
        secureRandom.nextBytes(bytes);
        return Hashing.sha1().hashBytes(bytes).toString();
    }
}
