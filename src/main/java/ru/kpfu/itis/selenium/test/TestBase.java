package ru.kpfu.itis.selenium.test;

import lombok.Data;
import org.junit.After;
import org.junit.Before;
import ru.kpfu.itis.selenium.manager.AppManager;

import static org.junit.Assert.fail;

@Data
public class TestBase {
    protected AppManager manager;

    @Before
    public void setUp() {
        manager = new AppManager();
    }

    @After
    public void tearDown() {
        manager.getDriver().quit();
        String verificationErrorString = manager.getRepositoryHelper().getVerificationErrors().toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
