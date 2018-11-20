package com.telesens.academy.lesson06_Encapsulation;

public class ButtonTests {

    public static void main(String[] args) {
        Button button = new Button();
        button.print();


        testConstructor();

    }

    private static void testConstructor() {
        Button button = new Button(10,20,"Login");
        int width = button.getWidth();
        int height = button.getHeight();
        String text = button.getText();
        button.print();

        // Verifiy
        System.out.println(width == 10);

       /* // Verify alternativ (VM = -ea)
        assert width == 10;*/

    }
}
