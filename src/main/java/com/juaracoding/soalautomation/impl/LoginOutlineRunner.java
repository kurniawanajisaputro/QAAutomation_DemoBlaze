package com.juaracoding.soalautomation.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 31/10/2024 0:28
@Last Modified 31/10/2024 0:28
Version 1.0
*/
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/features/001SignUpFeature.feature",
        },
        glue = "com.juaracoding.soalautomation.impl",
        monochrome=true,
        plugin = {"pretty","html:target/PTA/htmlreport/LoginRunnerOutline.html",
                "json:target/PTA/jsonreport/LoginRunnerOutline.json",
                "junit:target/PTA/junitreport/LoginRunnerOutline.xml"})
public class LoginOutlineRunner extends AbstractTestNGCucumberTests{}
