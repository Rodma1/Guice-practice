import annotation.UseJunit;
import annotation.UseTestNG;
import com.google.inject.AbstractModule;
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
    }
}
