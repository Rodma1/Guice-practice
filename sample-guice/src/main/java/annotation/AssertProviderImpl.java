package annotation;

import java.lang.annotation.Annotation;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/25 16:21
 * @Description: 任性一下，试试实现一个注解是什么感觉
 */
public class AssertProviderImpl implements AssertProvider{
    private  Provider value;

    public AssertProviderImpl(Provider value) {
        this.value = value;
    }

    @Override
    public Provider value() {
        return this.value;
    }


    @Override
    public Class<? extends Annotation> annotationType() {
        return AssertProvider.class;
    }
}
