==============================================================================
Как подключить библиотеку 'java-part-1.0-SNAPSHOT-tests.jar' к Maven проекту

==========Способ 1=============
1) Скачать исходники этой библиотеки, для этого выполнить команду с консоли:
	git clone https://github.com/Oleg-Afanasiev/selenium-04.git
	
2) Перейти в папку проекта: selenium-04

3) Сделать сборку, выполнив команду с консоли:
	mvn clean install -DskipTests -Pbuild
	
	(	mvn - команда maven
		clean - фаза clean
		install - фаза install
		-DskipTests - пропускаем запуск тестов
		-Pbuild - профайл сборки
			c maven мы будем работать до конца курса - с деталями запусков и конфигураций я познакомлю)
		
=> 	в результате сборки файл 'java-part-1.0-SNAPSHOT-tests.jar' будет находится в директории target 
	и в локальном репозитории userdir/.m2/repository/com/academy/java-part/java-part-1.0-SNAPSHOT-tests.jar
	
4) В текущем проекте можем подключить эту библиотеку, указав зависимость в pom.xml
	<dependencies>
        <dependency>
            <groupId>com.academy</groupId>
            <artifactId>java-part</artifactId>
            <version>1.0-SNAPSHOT</version>
            <classifier>tests</classifier>
            <type>test-jar</type>
        </dependency>
	</dependencies>

==========Способ 2=============
1) Подключить руками. Для этого в IDE:
	File->Project Structure->Libraries-> нажать '+' и загрузить библиотеку из файловой системы
	
==========Способ 3=============
1) Скопировать библиотеку 'java-part-1.0-SNAPSHOT-tests.jar' в локальный репозиторий:
	userdir/.m2/repository/com/academy/java-part/java-part-1.0-SNAPSHOT-tests.jar
	
2) В текущем проекте можем подключить эту библиотеку, указав зависимость в pom.xml
	<dependencies>
        <dependency>
            <groupId>com.academy</groupId>
            <artifactId>java-part</artifactId>
            <version>1.0-SNAPSHOT</version>
            <classifier>tests</classifier>
            <type>test-jar</type>
        </dependency>
	</dependencies>
	