package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SplashScreen extends BaseScreen{


    public SplashScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/versionText']")
    AndroidElement versionTextView;

    public String getCurrentVersion() {
        return versionTextView.getText();
    }
}
