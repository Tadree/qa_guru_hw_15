# Проект по автоматизации тестирования hh.ru

### Технологии и инструменты:
<p align="center">
<img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/>
<img src="images/Java.svg" width="50" height="50"  alt="Java"/>
<img src="images/Github.svg" width="50" height="50"  alt="Github"/>
<img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/>
<img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/>
<img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/>
<img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/>
<img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/>
<img src="images/Allure_TO.svg" width="50" height="50"  alt="Allure"/>
<img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/>
<img src="images/Jira.svg" width="50" height="50"  alt="Jenkins"/>
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
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${VIDEO_STORAGE}/video/
```
где: 

- <code>BROWSER</code> – браузер, в котором будут выполняться тесты.
- <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты.
- <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты.
- <code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
- <code>VIDEO_STORAGE</code> - адрес удаленного сервера, по которому можно получить видео. 