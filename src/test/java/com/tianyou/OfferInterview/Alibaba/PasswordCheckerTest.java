package com.tianyou.OfferInterview.Alibaba;

import org.junit.Test;

public class PasswordCheckerTest {

    PasswordChecker checker=new PasswordChecker();

    @Test
    public void TeststrongPasswordChecker(){
        String password="ABABABABABABABABABAB1";
        int value=checker.strongPasswordChecker(password);
        System.out.println(value);
    }

    @Test
    public void Testcharat(){
        String password="1";
        password=password.replace(password.charAt(0),'#');
        System.out.println(password);
    }
}
