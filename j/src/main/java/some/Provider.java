package some;

import org.jspecify.annotations.Nullable;

public interface Provider<IN> {

    <OUT extends @Nullable Object> Provider<OUT> mapNullable(Transformer<? extends OUT, ? super IN> transformer);

    <OUT> Provider<OUT> mapNonNullable(Transformer<? extends OUT, ? super IN> transformer);
}
