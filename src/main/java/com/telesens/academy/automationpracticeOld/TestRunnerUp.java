package com.telesens.academy.automationpracticeOld;

import com.telesens.academy.automationpracticeOld.modelUpdate.EntityDressUp;
import com.telesens.academy.automationpracticeOld.tests.CartTestsUp;

public class TestRunnerUp {

   /* public static void main(String[] args) {
        CartTests cartTests = new CartTests();
        cartTests.init("chrome", "http://automationpractice.com/index.php");
        cartTests.testAddDresToCart();
    }*/



    public static void main(String[] args) {
        CartTestsUp cartTests = new CartTestsUp();
        cartTests.init("firefox", "http://automationpractice.com");

        EntityDressUp entityDress1 = new EntityDressUp();
        entityDress1.setName("Printed Dress");
        entityDress1.setModel("demo_3");
        entityDress1.setSize("S");
        entityDress1.setColor("Orange");
        entityDress1.setPrice(26.00);

        EntityDressUp entityDress2 = new EntityDressUp();
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
            cartTests.testAddDressToCart((EntityDressUp) testData[i][0], (int)testData[i][1]);
        }







    }
}
