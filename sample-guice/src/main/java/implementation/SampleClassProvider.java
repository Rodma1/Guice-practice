package implementation;

import annotation.AssertProvider;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;
import contract.SampleProvider;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/27 22:42
 * @Description: 通过provider将这些方法移动到独立的类中
 */
public class SampleClassProvider implements Provider<SampleProvider> {

    private String name;
    private int age;

    @Inject
    public SampleClassProvider(@Named("Name") String name ,
                               @AssertProvider(annotation.Provider.age) int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public SampleProvider get() {

        SampleProvider sampleProvider = new SampleProviderImpl(name , age);

        return  sampleProvider;

    }
}
