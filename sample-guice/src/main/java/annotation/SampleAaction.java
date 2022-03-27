package annotation;

import com.google.inject.BindingAnnotation;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/27 16:35
 * @Description:
 */
@Qualifier
@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SampleAaction {
}
