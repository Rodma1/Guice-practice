package implementation;

import contract.SampleProvider;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/27 0:02
 * @Description:
 */
public class SampleProviderImpl implements SampleProvider {

    private String name;
    private int age;

    public  SampleProviderImpl(String name , int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void someAction() {
        System.out.println(name + "的年龄是" + age);
    }
}
