import annotation.*;
import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import contract.Assertor;
import contract.SpellChecker;
import implementation.JunitAssertor;
import implementation.SpellCheckerImpl;
import implementation.TestNGAAssertor;
import implementation.WinWordSpellCheckerImpl;

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

        //  自定义参数绑定
        bind(String.class).annotatedWith(AsserProvider.assertProvider(Provider.Hello)).toInstance("你好呀");
    }
}
