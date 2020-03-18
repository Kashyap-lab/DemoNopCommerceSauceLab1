package WebTest5;

import org.junit.After;
import org.junit.Before;

public class BaseTest extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();

    @Before

    public void OpenBrowser()
    {
        browserSelector.openBrowser();
    }
    @After
    public void CloseBrowser()
    {
      browserSelector.CloseBrowser();
    }
}
