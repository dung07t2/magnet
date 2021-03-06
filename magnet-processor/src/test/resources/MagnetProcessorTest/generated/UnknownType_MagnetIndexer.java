package magnet;

import app.extension.MagnetUnknownTypeTabFactory;
import java.util.HashMap;
import java.util.Map;
import magnet.internal.Factory;
import magnet.internal.Range;

public final class MagnetIndexer {
    public static void register(MagnetImplementationManager implementationManager) {
        Factory[] factories = new Factory[] {
                new MagnetUnknownTypeTabFactory(),
        };
        Map<Class, Object> index = new HashMap<>();
        index.put(MagnetUnknownTypeTabFactory.getType(), new Range(0, 1, ""));
        implementationManager.register(factories, index);
    }
}
