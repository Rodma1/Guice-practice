import domain.TextEditor;
import implementation.SpellCheckerImpl;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/24 16:41
 * @Description:
 */
public class GuiceDemo {
    public static void main(String[] args) {
        System.out.println("hello word");

        // 注入
        TextEditor textEditor = new TextEditor(new SpellCheckerImpl());

        textEditor.makeSpellChecker();
    }
}
