package com.juaracoding.soalautomation;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/11/2024 0:56
@Last Modified 01/11/2024 0:56
Version 1.0
*/
import io.cucumber.core.cli.Main;
public class RunningAll {
    public static void main(String[] args){
        try {
//            System.out.println("Path User Dir -> "+System.getProperty("user.dir"));
            Main.main(new String[]
                    {
                            "-g","com.juaracoding.soalautomation.impl",
                            "classpath:features",
                            "-p","pretty",
                            "-p","html:data-report/PTA/htmlreport/LoginRunnerOutline.html",
                            "-p","json:data-report/PTA/jsonreport/LoginRunnerOutline.json",
                            "-p","junit:data-report/PTA/junitreport/LoginRunnerOutline.xml",
                            "-m"
                    });
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Main Class Execption : "+e);
        }
    }
}
