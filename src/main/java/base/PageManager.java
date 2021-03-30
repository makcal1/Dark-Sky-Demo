package base;

import pages.DarkSkyPage;

public class PageManager {
    public static DarkSkyPage loginPage;


    public static void initialize(){

     loginPage = new DarkSkyPage();
    }
}
