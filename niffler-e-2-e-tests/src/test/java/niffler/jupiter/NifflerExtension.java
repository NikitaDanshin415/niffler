package niffler.jupiter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.*;

public class NifflerExtension implements BeforeAllCallback, AfterAllCallback, BeforeEachCallback, AfterEachCallback, BeforeTestExecutionCallback, AfterTestExecutionCallback {
    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("beforeAllExt: " + context.getDisplayName());
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("afterAllExt: " + context.getDisplayName());
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("        afterEachExt: " + context.getDisplayName());
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("        beforeEachExt: " + context.getDisplayName());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("                    afterTestExecution: " + context.getDisplayName());
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        System.out.println("                    beforeTestExecution: " + context.getDisplayName());
    }
}
