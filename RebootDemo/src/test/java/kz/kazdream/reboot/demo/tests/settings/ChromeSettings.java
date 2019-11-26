package kz.kazdream.reboot.demo.tests.settings;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class ChromeSettings {
    @BeforeEach
    void setUpChrome() {
        Configuration.browserSize="1920x1080";
        Configuration.fileDownload = PROXY;
        Configuration.proxyEnabled = true;
        open("http://testingchallenges.thetestingmap.org/index.php");
    }
    @AfterEach
    void closeALL() {
        close();
    }
}

