Instructions:

Setup selenium images:

`docker-compose up -d`

Run tests:

`./gradlew test`

Output looks like:

`[INFO ] 2021-11-04 09:50:59.690 [Test worker] DriverCreationTest - Selenium 3 Opened in 622 ms
nov 04, 2021 9:50:59 A. M. org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
[INFO ] 2021-11-04 09:50:59.851 [Test worker] DriverCreationTest - Selenium 3 Opened in 97 ms
nov 04, 2021 9:51:00 A. M. org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
[INFO ] 2021-11-04 09:51:00.005 [Test worker] DriverCreationTest - Selenium 3 Opened in 94 ms
nov 04, 2021 9:51:01 A. M. org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
[INFO ] 2021-11-04 09:51:01.723 [Test worker] DriverCreationTest - Selenium 4 Opened in 1652 ms
nov 04, 2021 9:51:06 A. M. org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
[INFO ] 2021-11-04 09:51:06.715 [Test worker] DriverCreationTest - Selenium 4 Opened in 4918 ms
nov 04, 2021 9:51:11 A. M. org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
[INFO ] 2021-11-04 09:51:11.718 [Test worker] DriverCreationTest - Selenium 4 Opened in 4929 ms
`