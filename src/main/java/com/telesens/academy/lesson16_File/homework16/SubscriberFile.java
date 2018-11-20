package com.telesens.academy.lesson16_File.homework16;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Random;

public class SubscriberFile implements Comparable<SubscriberFile> {

    private static Long currentid = 2L;
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    //    private Gender gender; // создать перечисление Gender для мужского и женского пола
    private int age;
    private String phoneNumber;
    private String operator;
    private Random rand = new Random();


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

    public void setId(Long idx) {
        this.id = idx;
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


    public static void setCurrentId(Long id) {
        currentid = id;
    }

    public SubscriberFile nextSubscriber() { //throws FileNotFoundException

        SubscriberFile newSubscriber = null;
        try {
            newSubscriber = generateFullNameWithGender();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        long nextId;
        nextId = ++currentid;
//           id++;
        newSubscriber.setId(nextId);
        //currentid = nextId;
        newSubscriber.setAge(generateAge());
        String [] res = generatePhoneNumberWithOperator();
        newSubscriber.setPhoneNumber(res[0]);
        newSubscriber.setOperator(res[1]);

        return newSubscriber;
    }


    private SubscriberFile generateFullNameWithGender() throws FileNotFoundException {

        ReadProperty prop = new ReadProperty();
        String propFile = "hw.properties";
        String maleFirstName = prop.readProperty(propFile, "male.firstnames");
        String maleLastName = prop.readProperty(propFile, "male.lastnames");
        String femaleFirstName = prop.readProperty(propFile, "female.firstnames");
        String femaleLastName = prop.readProperty(propFile, "female.lastnames");


        SubscriberFile newSubscriber = new SubscriberFile();
        ReaderFile readerFile = new ReaderFile();

        if (rand.nextBoolean() == true) {

            newSubscriber.setFirstName(readerFile.randomStringFromFile(new File(maleFirstName)));
            newSubscriber.setLastName(readerFile.randomStringFromFile(new File(maleLastName)));
            newSubscriber.setGender(Gender.MAN.getGender());
        } else {
            newSubscriber.setFirstName(readerFile.randomStringFromFile(new File(femaleFirstName)));
            newSubscriber.setLastName(readerFile.randomStringFromFile(new File(femaleLastName)));
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
    public int generateAge() {
        int lowerLimit = 18;
        int upperLimit = 60;
        return rand.nextInt(upperLimit - lowerLimit) + lowerLimit;
    }

    // TODO есть вероятность одинакового номера у разных абонентов. Как быть ? Надо решать ?

    /* Телефонные номера для каждого оператора со следующими префиксами:
             - Life номера с префиксами: 38063*******, 38093*******, 38073*******
             - Kievstar номера с префиксами: 38097*******, 38067*******, 38098*******
             - Vodafone номера с префиксами: 38050*******, 38066*******, 38095********/

    private String[] generatePhoneNumberWithOperator() {

        String[] arrayPrefixLife = {"38063", "38093", "38073"};
        String[] arrayPrefixKievstar = {"38097", "38067", "38098"};
        String[] arrayPrefixVodafone = {"38050", "38066", "38095"};
        String prefixLife;
        String prefixKievstar;
        String prefixVodafone;
        String operator [] = {"Life","Kievstar","Vodafone"};
        String [] res = new String [2];

        int a = (int) (Math.random() * 3);
        Random ran = new Random();
//        System.out.println(a);

        switch (a) {
            case 0: {
                prefixLife = arrayPrefixLife[(int) (Math.random() * 3)];
                Integer middleDigits = ran.nextInt(10_000_000);
                res[0] = prefixLife + middleDigits.toString();
                res[1] = operator[a];
            }
            break;

            case 1: {
                prefixKievstar = arrayPrefixKievstar[(int) (Math.random() * 3)];
                Integer middleDigits = ran.nextInt(10_000_000);
                res[0] = prefixKievstar + middleDigits.toString();
                res[1] = operator[a];
            }
            break;

            case 2: {
                prefixVodafone = arrayPrefixVodafone[(int) (Math.random() * 3)];
                Integer middleDigits = ran.nextInt(10_000_000);
                res[0] = prefixVodafone + middleDigits.toString();
                res[1] = operator[a];
            }
        }
        return res;

    }

    }

