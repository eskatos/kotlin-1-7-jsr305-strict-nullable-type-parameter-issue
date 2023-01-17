package some;

import org.jspecify.annotations.Nullable;

interface Transformer<OUT extends @Nullable Object, IN> {

    OUT transform(IN original);
}
