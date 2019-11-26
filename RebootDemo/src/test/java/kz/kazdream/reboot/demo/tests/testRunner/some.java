package kz.kazdream.reboot.demo.tests.testRunner;

import com.sun.javafx.scene.traversal.TopMostTraversalEngine;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class some {
    @Test
    void somes() {
        open("https://auto.ru/");
        $("#confirm-button").click();
    }
}
