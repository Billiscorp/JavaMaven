package com.telesens.academy.automationpracticeOld.addres;

import com.academy.automationpractice.ddt.framework.model.AddressData;

public class ParseAddresDemo {

    public static void main(String[] args) {

      // 1

/*
//        FirstName,LastName,Address,City,State,ZipCode,Country,HomePhone,MobilePhone,addressAlias
//        Kolya,Ivanov,Petrovskogo st. 35,Kharkov,Alaska,61033,United States,+3809353613437,093234567,addressAddedRef

        String addressString = "Kolya,Ivanov,Petrovskogo st. 35,Kharkov,Alaska,61033,United States,+3809353613437,093234567,addressAddedRef";



        String [] addressArray = addressString.split(",");

        AddressData addres = new AddressData()
                .withFirstName(addressArray[0])
                .withLastName(addressArray[1])
                .withAddress(addressArray[2])
                .withCity(addressArray[3])
                .withState(addressArray[4])
                .withZipCode(addressArray[5])
                .withCountry(addressArray[6])
                .withHomePhone(addressArray[7])
                .withMobilePhone(addressArray[8])
                .withAddressAlias(addressArray[9]);

        System.out.println(addres.toString());
*/







// 2


//        FirstName,LastName,Address,City,State,ZipCode,Country,HomePhone,MobilePhone,addressAlias
//        Kolya,Ivanov,Petrovskogo st. 35,Kharkov,Alaska,61033,United States,+3809353613437,093234567,addressAddedRef

        String addressString = "Kolya,Ivanov,Petrovskogo st. 35,Kharkov,Alaska,61033,United States,+3809353613437,093234567,addressAddedRef";

        AddressData addres = parseAddress (addressString);

        System.out.println(addres.toString());



    }

    private static AddressData parseAddress(String addressString) {

        final int FIRST_NAME_INDEX = 0;
        final int LAST_NAME_INDEX = 1;
        final int ADDRESS_INDEX = 2;
        final int CITY_INDEX = 3;
        final int STATE_INDEX = 4;
        final int ZIP_INDEX = 5;
        final int COUNTRY_INDEX = 6;
        final int HOME_PHONE_INDEX = 7;
        final int MOBILE_PHONE_INDEX = 8;
        final int ADDRESS_ALIAS_INDEX = 9;


        String [] addressArray = addressString.split(",");

        AddressData addres = new AddressData()
                .withFirstName(addressArray[FIRST_NAME_INDEX])
                .withLastName(addressArray[LAST_NAME_INDEX])
                .withAddress(addressArray[ADDRESS_INDEX])
                .withCity(addressArray[CITY_INDEX])
                .withState(addressArray[STATE_INDEX])
                .withZipCode(addressArray[ZIP_INDEX])
                .withCountry(addressArray[COUNTRY_INDEX])
                .withHomePhone(addressArray[HOME_PHONE_INDEX])
                .withMobilePhone(addressArray[MOBILE_PHONE_INDEX])
                .withAddressAlias(addressArray[ADDRESS_ALIAS_INDEX]);
        return addres;
    }


}
