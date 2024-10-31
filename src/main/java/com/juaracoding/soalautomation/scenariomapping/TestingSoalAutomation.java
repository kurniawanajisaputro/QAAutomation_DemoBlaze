package com.juaracoding.soalautomation.scenariomapping;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 31/10/2024 0:27
@Last Modified 31/10/2024 0:27
Version 1.0
*/

public enum TestingSoalAutomation {
    T1("Test001 Sign Up Website (user)"),
    T2("Test002 Log In Website (user)");
    private String testName;

    private TestingSoalAutomation(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
