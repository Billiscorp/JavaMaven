package com.telesens.academy.lesson06_Encapsulation;


/*
6) Практика.
        a) Реализовать класс Button, который имеет следующие поля:
        - ширина (width)
        - высота (height)
        - надпись (text)
        - цвет фона (backgroundColor)
        - цвет текста (textColor)
        - статус enabled (активна/неактивна)

        Все поля должны быть помечены модификатором private
		- реализовать доступ к полям через методы set и get

                - реализовать возможность создания класса, с помощью перегруженных конструкторов !!!! ALT+Insert
                - реализовать метод print, который выводит информацию о кнопке в отформатированном виде
                - реализовать методы changeSize
                - реализовать методы changeFontColor, changeBackgroundColor (перегруженные методы)
                ....
*/


public class Button {

    private int width;
    private int height;
    private String text;
    private int [] backgroundColor;
    private int [] textColor;
    private boolean enabled;














    public Button() {
    }



    // Constructor
    public Button(int width, int height, String text, int[] backgroundColor, int[] textColor, boolean enabled) {
        this.width = width;
        this.height = height;
        this.text = text;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.enabled = enabled;
    }

    public Button(int width, int height, String text) {
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int[] getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int[] backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int[] getTextColor() {
        return textColor;
    }

    public void setTextColor(int[] textColor) {
        this.textColor = textColor;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }



    public void print () {
        System.out.println(String.format("Ширина: %d", width));
        System.out.println(String.format("Высота: %d", height));
        System.out.println(String.format("Текст: %s", text));
        /*System.out.println(String.format("Высота: %d", backgroundColor));
        System.out.println(String.format("Высота: %d", textColor));
        System.out.println(String.format("Высота: %d", enabled));*/
    }
}
