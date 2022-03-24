import com.google.inject.Guice;
import com.google.inject.Injector;
import domain.TextEditor;
import implementation.SpellCheckerImpl;

import javax.xml.soap.Text;

/**
 * @author: 那就叫小智吧
 * @date: 2022/3/24 16:41
 * @Description:
 */
public class GuiceDemo {
    public static void main(String[] args) {
        System.out.println("hello word");

        // 注入
//        TextEditor textEditor = new TextEditor(new SpellCheckerImpl());
        // 通过容器，创建构造器
        Injector injector = Guice.createInjector(new TextEditorModule());

        TextEditor textEditor = injector.getInstance(TextEditor.class);


        textEditor.makeSpellChecker();
    }
}
