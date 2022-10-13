# Apache Commons Text RCE POC
Apache Commons Text below 1.10.0 RCE Vulnerability POC

https://mvnrepository.com/artifact/org.apache.commons/commons-text - Any version *below 1.10.0* is vulnerable. If you're using any older version and making use of StringSubstitutor Interpolator then please upgrade it to 1.10.0 or else do not use StringSubstitutor Interpolator

Apart from the above use-case any other library making use of StringSubstitutor with Interpolator then such library is also vulnerable. One such library is *Apache Common Configuration* (https://securitylab.github.com/advisories/GHSL-2022-017_Apache_Commons_Configuration/)

![image](https://user-images.githubusercontent.com/22236992/195710399-204edb80-796b-4d24-abea-9f7d3b77ab70.png)
