package annotation;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/25 15:34
 * @Description: 元注解
 */
@Qualifier
@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UseJunit {
}
