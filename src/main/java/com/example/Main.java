package com.example;

import com.intuit.karate.FileUtils;
import com.intuit.karate.driver.chrome.Chrome;

import java.io.File;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Chrome p = Chrome.startHeadless();
        p.setUrl("https://github.com/intuit/karate");

        FileUtils.writeToFile(new File("github.pdf"), p.pdf(new HashMap<>()));

        p.quit();
    }
}
