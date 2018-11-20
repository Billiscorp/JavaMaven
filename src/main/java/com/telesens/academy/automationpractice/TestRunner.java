package com.telesens.academy.automationpractice;

// TODO ИСПРАВИТь !!!!!!!
//import com.academy.automationpractice.ddt.framework.model.AddressData;
import com.telesens.academy.automationpractice.addres.ParseAddressDemo;
import com.telesens.academy.automationpractice.model.EntityDress;
import com.telesens.academy.automationpractice.tests.CartTests;


public class TestRunner {

   /* public static void main(String[] args) {
        CartTests cartTests = new CartTests();
        cartTests.init("chrome", "http://automationpractice.com/index.php");
        cartTests.testAddDresToCart();
    }*/



    public static void main(String[] args) {
        CartTests cartTests = new CartTests();
        cartTests.init("firefox", "http://automationpractice.com");

        EntityDress entityDress1 = new EntityDress();
        entityDress1.setName("Printed Dress");
        entityDress1.setModel("demo_3");
        entityDress1.setSize("S");
        entityDress1.setColor("Orange");
        entityDress1.setPrice(26.00);

        EntityDress entityDress2 = new EntityDress();
        entityDress2.setName("Printed Dress");
        entityDress2.setModel("demo_3");
        entityDress2.setSize("S");
        entityDress2.setColor("Orange");
        entityDress2.setPrice(26.00);

        Object[][] testData = {
                {entityDress1, 2},
                {entityDress2, 2}
        };

        // TODO
//        cartTests.testAddDressToCart();
      /*  cartTests.testAddDressToCart(entityDress1, 2);
        cartTests.testAddDressToCart(entityDress2, 2);*/

        for (int i = 0; i < testData.length; i++) {
            cartTests.testAddDressToCart((EntityDress) testData[i][0], (int)testData[i][1]);
        }



        // TODO ИСПРАВИТь !!!!!!!
      /*  String rawData = "";
        AddressData address = ParseAddressDemo.parseAddress(rawData);
        Object[][] addressData = {
                {address},
        };*/

        // TODO
        cartTests.testAddDressToCart(entityDress1, 2);
        cartTests.testAddDressToCart(entityDress2, 2);







    }
}
