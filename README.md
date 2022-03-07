# Prak_21_22
# Задание к Практической №21 и №22
## 1) Реализовать класс Абстрактная фабрика для комплексных чисел 
## 2) Реализовать класс Абстрактная фабрика для различных типов стульев: 
Виды стульев: 
- Викторианский стул;
- Многофункциональный стул;
- Магический стул;
- интерфейс Стул, от которого наследуются все классы стульев, и класс Клиент, который использует интерфейс стул в своем методе Sit (Chair chair). 
## 3) Компании нужно написать редактор текста, редактор изображений и редактор музыки. 
В трёх приложениях будет очень много общего. 

Главное окно, панель инструментов, команды меню будут весьма схожими. Чтобы не писать повторяющуюся основу трижды, вам
поручили разработать основу (каркас) приложения, которую можно использовать во всех трёх редакторах. На совещании в
компании была принята следующая архитектура:

    Есть некий базовый интерфейс IDocument, представляющий документ неопределённого рода. 
    От него впоследствии будут унаследованы конкретные документы: TextDocument, ImageDocument, MusicDocument и т.п. 
    Интерфейс
    IDocument перечисляет общие свойства и операции для всех документов.
    • При нажатии пунктов меню File -&gt; New и File -&gt; Open требуется создать новый экземпляр документа (конкретного подкласса).
    Однако каркас не должен быть привязан ни к какому конкретному виду документов.
    • Нужно создать фабричный интерфейс ICreateDocument. Этот интерфейс содержит два абстрактных фабричных метода: CreateNew
    и CreateOpen, оба возвращают экземпляр IDocument
    • Каркас оперирует одним экземпляром IDocument и одним экземпляром ICreateDocument. Какие конкретные классы будут
    подставлены сюда, определяется во время запуска приложения.
Требуется:
1. Создать перечисленные классы.    Создать каркас приложения — окно редактора с меню File. В меню File реализовать пункты New,Open, Save, Exit.
2. Продемонстрировать работу каркаса на примере текстового редактора. Потребуется создать конкретный унаследованный класс
TextDocument и фабрику для него — CreateTextDocument. В данной практической работе рекомендуется использовать следующие
паттерны: Абстрактная фабрика и фабричный метод.
