package com.telesens.academy.lesson16_File.homework16;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Random;

public class SubscriberFile implements Comparable<SubscriberFile> {

    private static Long id ;
    private static String firstName;
    private static String lastName;
    private static String gender;
//    private Gender gender; // создать перечисление Gender для мужского и женского пола
    private static int age;
    private static String phoneNumber;
    private static String operator;
    private static Random rand = new Random();



    public SubscriberFile() {

    }


    public SubscriberFile(Long id, String firstName, String lastName, String gender, int age, String phoneNumber, String operator) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubscriberFile that = (SubscriberFile) o;
        return age == that.age &&
                Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                gender == that.gender &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, age, phoneNumber, operator);
    }

    @Override
    public String toString() {
        return "SubscriberFile{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }

    @Override
    public int compareTo(SubscriberFile o) {
        return 0;
    }



       public static SubscriberFile nextSubscriber()  { //throws FileNotFoundException

           SubscriberFile newSubscriber = null;
           try {
               newSubscriber = generateFullNameWithGender();
           } catch (FileNotFoundException e) {
               e.printStackTrace();
           }
           id = 2L;
           long nextId = id;
           id = id + rand.nextInt(100);
//           id++;
           newSubscriber.setId(nextId);
           newSubscriber.setAge(generateAge());
           newSubscriber.setPhoneNumber(generatePhoneNumber());

           return newSubscriber;
       }


    private static SubscriberFile generateFullNameWithGender() throws FileNotFoundException {

        String propFile = "hw.properties";
//        String pathData = prop.readProperty(propFile,"pathData");
        String maleFirstName = ReadProperty.readProperty(propFile,"male.firstnames");
        String maleLastName = ReadProperty.readProperty(propFile,"male.lastnames");
        String femaleFirstName = ReadProperty.readProperty(propFile,"female.firstnames");
        String femaleLastName = ReadProperty.readProperty(propFile,"female.lastnames");


        SubscriberFile newSubscriber = new SubscriberFile();

        if (rand.nextBoolean() == true) {

            newSubscriber.setFirstName(ReaderFile.randomStringFromFile(new File(maleFirstName)));
            newSubscriber.setLastName(ReaderFile.randomStringFromFile(new File(maleLastName)));
            newSubscriber.setGender(Gender.MAN.getGender());
        } else {
            newSubscriber.setFirstName(ReaderFile.randomStringFromFile(new File(femaleFirstName)));
            newSubscriber.setLastName(ReaderFile.randomStringFromFile(new File(femaleLastName)));
            newSubscriber.setGender(Gender.WOMAN.getGender());
        }
        return newSubscriber;
    }


    // для массива
    /* if (rand.nextBoolean() == true) {
        int randomNumber = rand.nextInt(firstNamesMen.length);
        newSubscriber.setFirstName(firstNamesMen[randomNumber]);
        randomNumber = rand.nextInt(lastNamesMen.length);
        newSubscriber.setLastName(lastNamesMen[randomNumber]);
        newSubscriber.setGender(Gender.MAN.getGender());
    } else {
        int randomNumber1 = rand.nextInt(firstNamesWomen.length);
        newSubscriber.setFirstName(firstNamesWomen[randomNumber1]);
        randomNumber1 = rand.nextInt(lastNamesWomen.length);
        newSubscriber.setLastName(lastNamesWomen[randomNumber1]);
        newSubscriber.setGender(Gender.WOMAN.getGender());
    }
        return newSubscriber;
}*/


// TODO Гаус ????
    public static int generateAge(){
        int lowerLimit = 18;
        int upperLimit = 60;
        return rand.nextInt(upperLimit-lowerLimit)+lowerLimit;
    }

    // TODO переделать
    public static String generatePhoneNumber() {
        int firstThreeNumbers = 999;
        int middleDigits = rand.nextInt(1_000_000);

        // 1 способ
        int lastDigit = rand.nextBoolean() ? 0 : 5;

        // 2 способ
//        if (rand.nextBoolean())
//            last = 0;
//        else
//            last = 5;

        long phoneNumber =
                firstThreeNumbers*1_000_0000L + // двигаем влево на 7 разрядов
                        middleDigits*10 + // умножаем на 10, чтобы сдвинуть влево на один разряд
                        lastDigit; // 0 или 5

        return Long.toString(phoneNumber);
    }


}
