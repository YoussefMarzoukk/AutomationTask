package com.saucedemo.DataProvider;

import org.testng.annotations.DataProvider;

public class Data {
                      ///***VALID Login Data**///

    @DataProvider(name = "Valid_Login_Data")
    public static Object[][] ValidLogin() {
        return new Object[][]{{"standard_user","secret_sauce"}};

                    ///***INVALID Login Data**///
    }
    @DataProvider(name = "InValid_Login_Data")
    public static Object[][] InValidLogin() {
        return new Object[][]{{"Invalid_User","secret_sauce"}};
    }
    @DataProvider(name = "InValid_Login_Data_Empty_Username")
    public static Object[][] InValidLogin_Username() {
        return new Object[][]{{"","secret_sauce"}};
    }
    @DataProvider(name = "InValid_Login_Data_Empty_Password")
    public static Object[][] InValidLogin_Password() {
        return new Object[][]{{"standard_user",""}};
    }

}
