package kz.kazdream.reboot.demo.tests.testRunner;

import kz.kazdream.reboot.demo.tests.settings.ChromeSettings;
import kz.kazdream.reboot.demo.tests.testCases.FirstTestChallengePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

public class testChallenge extends ChromeSettings {

    private FirstTestChallengePage firstTestChallengePage = new FirstTestChallengePage();

    @Test
    void E2ETest() {
        firstTestChallengePage
                .setFirstName("a")
                .submitForm()
                .checkCase("Minimum value")
                .setFirstName("wwwwwwwwwwwwwwwwwwwwwwwwwwwwww")
                .submitForm()
                .checkCase("Maximum values")
                .setFirstName(String.valueOf(Keys.SPACE))
                .submitForm()
                .checkCase("Space")
                .setFirstName("asd")
                .submitForm()
                .checkCase("Average value")
                .checkCountCases();
    }

}
