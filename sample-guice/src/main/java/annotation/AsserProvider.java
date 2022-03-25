package annotation;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/25 16:24
 * @Description: 工厂类
 */
public class AsserProvider {
    public static  AssertProvider assertProvider(Provider value) {
        return new AssertProviderImpl(value);
    }
}
