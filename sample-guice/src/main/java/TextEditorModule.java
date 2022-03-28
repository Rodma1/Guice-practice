import annotation.*;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import contract.Assertor;
import contract.SampleProvider;
import contract.SpellChecker;
import implementation.*;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/24 16:58
 * @Description: 绑定模块
 */
public class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);

        // 最后会输出子类
        bind(SpellCheckerImpl.class).to(WinWordSpellCheckerImpl.class);

        // 元注解绑定
        bind(Assertor.class).annotatedWith(UseJunit.class).to(JunitAssertor.class);
        bind(Assertor.class).annotatedWith(UseTestNG.class).to(TestNGAAssertor.class);

        // 命名绑定
        bind(Assertor.class).annotatedWith(Names.named("UseTest")).to(TestNGAAssertor.class);

        // 自定义绑定
        bind(Assertor.class).annotatedWith(AsserProvider.assertProvider(Provider.JUnit)).to(JunitAssertor.class);
        bind(Assertor.class).annotatedWith(AsserProvider.assertProvider(Provider.TestNG)).to(TestNGAAssertor.class);

        // 绑定String常量
        bind(String.class).annotatedWith(Names.named("Hello")).toInstance("你好呀");
        // 简写,如果是自定义的类就不能使用
        bindConstant().annotatedWith(Names.named("hello")).to("早上好");

        //  自定义参数绑定
        bind(String.class).annotatedWith(AsserProvider.assertProvider(Provider.Hello)).toInstance("你好呀");

        // 直接传,发现SampleProviderImpl需要传参数
//        bind(SampleProvider.class).annotatedWith(SampleAaction.class).to(SampleProviderImpl.class);

        // 绑定Configure参数
        bind(Integer.class).annotatedWith(AsserProvider.assertProvider(Provider.age)).toInstance(new Configure().age);
//        bind(String.class).annotatedWith(AsserProvider.assertProvider(Provider.name)).toInstance(new Configure().name);
        bindConstant().annotatedWith(Names.named("Name")).to(new Configure().name);

        // 绑定实现的provider
        bind(SampleProvider.class).annotatedWith(SampleAaction.class).toProvider(SampleClassProvider.class);
    }

//    @Provides
//    @SampleAaction
//    public SampleProvider sampleProvider() {
//        String name = "神的孩子都在歌唱";
//        int age = 23;
//
//        SampleProvider sampleProvider = new SampleProviderImpl(name , age);
//
//        return  sampleProvider;
//    }
}
