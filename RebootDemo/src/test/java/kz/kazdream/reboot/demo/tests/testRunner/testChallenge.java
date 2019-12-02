package kz.kazdream.reboot.demo.tests.testRunner;

import kz.kazdream.reboot.demo.tests.settings.ChromeSettings;
import kz.kazdream.reboot.demo.tests.testCases.FirstTestChallengePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

public class testChallenge extends ChromeSettings {

    @Test
    void E2ETest() {
        new FirstTestChallengePage()
                .setFirstName("a")
                .submitForm()
                .checkCase("Minimum value")
                .setFirstName("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww")
                .submitForm()
                .checkCase("More than maximum values")
                .setFirstName(String.valueOf(Keys.SPACE))
                .submitForm()
                .checkCase("Space")
                .setFirstName("asd")
                .submitForm()
                .checkCase("Average value")
                .checkCountCases();
    }

}
