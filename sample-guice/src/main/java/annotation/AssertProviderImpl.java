package annotation;

import com.google.inject.internal.Annotations;

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

    // 生成唯一的hashcode
    @Override
    public int hashCode() {
        // 每次取得都是名字一样的hash值 ， 127不能变
        return (127 * "value".hashCode()) ^ value.hashCode();
    }

    // 重写toString方法，方便错误查看
    public String toString() {
        return "@" + AssertProvider.class.getName() + "(" + Annotations.memberValueString("value",value) + ")";
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return AssertProvider.class;
    }
}
