package domain;

import com.google.inject.Inject;
import contract.SpellChecker;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/24 16:50
 * @Description: 绑定接口类和实现类 文本编辑器
 */
public class TextEditor {

    private SpellChecker spellChecker;

    // 通过以下构造函数注入
    @Inject
    public TextEditor(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }

    // 获取对象方法
    public void makeSpellChecker() {
        spellChecker.checkSpelling();
    }

}
