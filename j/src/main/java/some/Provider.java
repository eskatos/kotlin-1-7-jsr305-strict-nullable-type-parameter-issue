package some;

import org.jetbrains.annotations.Nullable;

public interface Provider<IN> {

    <OUT> Provider<OUT> map(Transformer<? extends @Nullable OUT, ? super IN> transformer);
}
