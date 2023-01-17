package some;

import javax.annotation.meta.TypeQualifierDefault;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.PACKAGE})
@javax.annotation.Nonnull
@org.jetbrains.annotations.NotNull
@org.jspecify.annotations.NonNull
@TypeQualifierDefault({ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface NonNullApi {
}
