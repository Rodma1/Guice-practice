import com.google.inject.AbstractModule;
import contract.SpellChecker;
import implementation.SpellCheckerImpl;
import implementation.WinWordSpellCheckerImpl;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/24 16:58
 * @Description:
 */
public class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);

        // 最后会输出子类
        bind(SpellCheckerImpl.class).to(WinWordSpellCheckerImpl.class);
    }
}
