# Проект по автоматизации тестирования hh.ru

### Технологии и инструменты:
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

### Реализованные проверки:
* Отображение строки поиска на главной странице
* Проверка плейсхолдера строки поиска на главной странице
* Переход на страницу результатов поиска при выполнении поиска с главной страницы
* Переход на страницу расширенного поиска с главной страницы
* Отображение поисковых подсказок на главной странице
* Проверка заголовка строки поиска на главной странице
* Отображение popup подтверждения региона на главной странице
* Отсутствие ошибок в логах консоли

### Запуск тестов из терминала
#### Локальный запуск тестов:
```bash
gradle clean test
```

#### Удаленный запуск тестов с параметрами:

```bash
gradle clean test 
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${VIDEO_STORAGE}/video/
-Dthreads=${THREADS}
```
где: 

- <code>BROWSER</code> – браузер, в котором будут выполняться тесты.
- <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты.
- <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты.
- <code>BROWSER_MOBILE</code> - название мобильного устройства.
- <code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
- <code>VIDEO_STORAGE</code> - адрес удаленного сервера, по которому можно получить видео. 
- <code>THREADS</code> - количество потоков.