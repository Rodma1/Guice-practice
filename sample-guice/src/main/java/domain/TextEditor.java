package domain;

import annotation.AssertProvider;
import annotation.Provider;
import annotation.SampleAaction;
import annotation.UseJunit;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import contract.Assertor;
import contract.SampleProvider;
import contract.SpellChecker;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/24 16:50
 * @Description: 绑定接口类和实现类 文本编辑器
 */
public class TextEditor {

    private SpellChecker spellChecker;

    // 通过元注解注入
    private Assertor assertor;

    // 参数
    private String ss;

    SampleProvider sampleProvider;

    // 通过以下构造函数注入
    @Inject
    public TextEditor(SpellChecker spellChecker,
                      @AssertProvider(Provider.TestNG) Assertor assertor,
                      @AssertProvider(Provider.Hello) String ss,
                      @SampleAaction SampleProvider sampleProvider
    ){
        this.spellChecker = spellChecker;

        this.assertor = assertor;

        this.ss = ss;

        this.sampleProvider = sampleProvider;
    }

    // 获取对象方法
    public void makeSpellChecker() {
        spellChecker.checkSpelling();

        assertor.equal(1,2);

        System.out.println(ss);

        sampleProvider.someAction();

    }

}
