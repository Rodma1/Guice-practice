package implementation;

import contract.Assertor;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/25 15:40
 * @Description: 代表另一种实现
 */
public class TestNGAAssertor implements Assertor {

    @Override
    public void equal(int expectedValue, int facValue) {
        System.out.println("不相等");
    }
}
