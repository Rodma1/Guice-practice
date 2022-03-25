package implementation;

import contract.Assertor;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/25 15:39
 * @Description:
 */
public class JunitAssertor implements Assertor {
    @Override
    public void equal(int expectedValue, int facValue) {
        System.out.println("相等");
    }
}
