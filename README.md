# Тестовое задание для Soft Engineering
## Задача 3.2 UI-автотесты
Написать автотест, покрывающий следующий кейс:

* Разница двух целых чисел
* Открыть сайт [https://testsheepnz.github.io/BasicCalculator.html](https://testsheepnz.github.io/BasicCalculator.html)
* Проскроллить вниз до конца
* Выбрать сборку (Build) «Prototype»
* Ввести в поле First number значение «2»
* Ввести в поле Second number значение «3»
* Выбрать операцию (Operation) «Subtract»
* Нажать на кнопку «Calculate»
* Проверить, что в поле ответа (Answer) значение равно «-1»
## Стек технологий:
* Java
* Junit
* Maven
* Selenium
* Allure
* Использование паттерна PageObject
* Использование библиотеки WebDriverManager
## Порядок запуска тестов:
* Клонировать проект используя команду "$ git clone https://github.com/bigsurmoon/petApiTest" 
* Открыть проект в IDE (напр. [IntelliJ IDEA](https://www.jetbrains.com/ru-ru/idea/) или [Aqua](https://www.jetbrains.com/aqua/))
* Собрать проект: mvn clean install
* Запуск тестов: mvn test
* Генерация Allure отчета: mvn allure:serve

* ## Структура проекта

```plaintext
project-root/
├── .allure                    # Каталог для отчетов Allure
├── .idea                      # Настройки проекта IntelliJ IDEA
├── src                        # Исходный код и тесты
│   ├── test
│   │   └── java
│   │       └── ru
│   │           └── se
│   │               └── calculator
│   │                   ├── helper                 # Помощники и утилиты
│   │                   │   └── TestValues         # Класс с тестовыми значениями
│   │                   ├── pages                  # Страницы Page Object
│   │                   │   ├── BasePage           # Базовый класс для страниц
│   │                   │   └── CalculatorPage     # Класс для страницы калькулятора
│   │                   └── test                   # Тестовые классы
│   │                       ├── BaseTest           # Базовый класс для тестов
│   │                       └── CalculatorPageTest # Тест для страницы калькулятора
├── .gitignore                 # Файл, указывающий, какие файлы/каталоги игнорировать Git
├── pom.xml                    # Maven проект файл, описывающий зависимости и сборку проекта
└── resources                  # Ресурсы проекта (например, конфигурационные файлы)
