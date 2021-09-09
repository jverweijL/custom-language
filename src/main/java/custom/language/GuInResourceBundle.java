package custom.language;

import com.liferay.portal.kernel.language.UTF8Control;
import org.osgi.service.component.annotations.Component;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * @author jverweij
 */

@Component(
        immediate = true,
        property = {
                "language.id=gu_IN"
        },
        service = ResourceBundle.class
)
public class GuInResourceBundle extends ResourceBundle {

    private final ResourceBundle _resourceBundle = ResourceBundle.getBundle(
            "content.language_gu_IN", UTF8Control.INSTANCE);

    @Override
    public Enumeration<String> getKeys() {
        return _resourceBundle.getKeys();
    }
    @Override
    protected Object handleGetObject(String key) {
        return _resourceBundle.getObject(key);
    }
}
