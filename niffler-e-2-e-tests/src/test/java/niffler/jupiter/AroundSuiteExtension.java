package niffler.jupiter;

import niffler.api.controllers.Category;
import niffler.api.controllers.Spend;
import niffler.config.Configure;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AroundSuiteExtension implements AroundAllTestExtension {

    @Override
    public void beforeAllTests(ExtensionContext context) {
        new Configure().configure();

        new Category().addCategory("Products");
        new Category().addCategory("Dog");
        new Category().addCategory("Home");

        new Spend().addSpend("","","");
        new Spend().addSpend("","","");
        new Spend().addSpend("","","");

    }

    @Override
    public void afterAllTests() {
        System.out.println("After Suite!");
    }
}
