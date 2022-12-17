package some;

import org.jetbrains.annotations.Nullable;

interface Transformer<OUT extends @Nullable Object, IN> {

    OUT transform(IN original);
}
