----------------------------------------------------------------
	Java программа при запуске выводит поздравление на консоль.
Если передано имя в качестве параметра, то поздравляет по имени	
----------------------------------------------------------------

1) зайти с консоли в корень программы - папка /task
	cd /d d:/work/task
	
2) скомпилировать программу /src/com/academy/telesens/AppMain.java в директорию out/
	(out/com/academy/telesens/AppMain.class):
	
		javac ./src/com/academy/telesens/AppMain.java -d out
		
3) запустить скомпилированный файл /out/com/academy/telesens/AppMain.class
		java -cp ./out/ com.academy.telesens.AppMain 
		(java -cp ./out/ com.academy.telesens.AppMain Peter)
		(java -classpath ./out/ com.academy.telesens.AppMain)
		
4) упаковать приложение в директорию /jar 
	- перейдем в папку out (это важно)
		cd ./out
	- jar cf ../jar/demo.jar *
	
5) запускаем приложение 
	- перейдем в папку jar
	- java -cp demo.jar com.academy.telesens.AppMain
	(java -classpath demo.jar com.academy.telesens.AppMain)
	(java -classpath demo.jar com.academy.telesens.AppMain Helen)

		