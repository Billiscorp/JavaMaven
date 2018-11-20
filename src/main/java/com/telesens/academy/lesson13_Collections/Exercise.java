package com.telesens.academy.lesson13_Collections;

import com.telesens.academy.automationpractice.model.EntityDress;
import com.telesens.academy.lesson11.CompareDresses;

import java.util.*;

public class Exercise {

    public static void main(String[] args) {

        EntityDress [] array = CompareDresses.getExpectedDresses();

        System.out.println("конвертировать массив в List");
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));
        List<EntityDress> list = convertArrayToList(array);
        System.out.println("List: ");
        System.out.println(list);


        System.out.println("***********************************");
        System.out.println("конвертировать List в массив");
        EntityDress[] arrayFromList = convertListToArray(list);
        System.out.println("Array from List:");
        System.out.println(Arrays.toString(arrayFromList));

        System.out.println("***********************************");
        System.out.println("конвертировать массив в Map в качестве ключа взять поле model");
        System.out.println("Array to map: ");
        Map<String, EntityDress> map = convertArrayToMap(array);
        System.out.println(map);



        System.out.println("***********************************");
        System.out.println("конвертировать отфильтровать List, оставив только позиции по заданному цвету");
        System.out.println("Filter list by orange: ");
        List<EntityDress> filteredList = filterByColor(list, "Orange");
        System.out.println(filteredList);


        System.out.println("***********************************");
        System.out.println("конвертировать Map в List");
        System.out.println("Map to List");
        System.out.println("Map: ");
        System.out.println(map);
        List<EntityDress> entityDressList = convertMapToList(map);
        System.out.println("List: ");
        System.out.println(entityDressList);


        System.out.println("***********************************");
        System.out.println("конвертировать List в Массив (массив содержит только String - значения поля model)");
        System.out.println("List to Array (String model)");
        System.out.println("List: ");
        System.out.println(list);
        System.out.println("Array: ");
        String[] entityDressesModel = convertListToModelArray (list);
        System.out.println("Array entityDressesModel: ");
        System.out.println(Arrays.toString(entityDressesModel));


        System.out.println("***********************************");
        System.out.println("проверить, равны ли два списка");
        System.out.println("List1: ");
        System.out.println(list);
        System.out.println("List2: ");
        System.out.println(entityDressList);

        boolean EqualLists = checkEqualLists(list, entityDressList);

        System.out.println("checkEqualLists = " + EqualLists);







    }

        // конвертировать List в массив
        public static EntityDress[] convertListToArray(List<EntityDress> list) {

                  return list.toArray(new EntityDress[]{});
                  //  return (EntityDress[]) list.toArray();
        }
         // #2
        // конвертировать массив в List
        public static List<EntityDress> convertArrayToList(EntityDress[] array){

                      return Arrays.asList(array);
        }

        // конвертировать массив в Map в качестве ключа взять поле model
        public static Map<String, EntityDress> convertArrayToMap(EntityDress[] array) {
            Map<String, EntityDress> map = new HashMap<>();

            // 1 способ
            for (int i = 0; i<array.length; i++) {
                        map.put(array[i].getModel(), array[i]);
                    }
                    return map;
                }


              // 2 Способ
           //        for (int i = 0; i<array.length; i++) {
           //            String model = array[i].getModel();
           //            EntityDress dress = array[i];
           //            map.put(model, dress);
           //        }
           //        return map;



                   /*// 3 способ
                   for (EntityDress dress: array) {
                       map.put(dress.getModel(), dress);
                   }
                   return map;
               }*/



    


        // проверить, равны ли два списка
        public static boolean checkEqualLists(List<EntityDress> list1, List<EntityDress> list2) {

            Collections.sort(list1);
            Collections.sort(list2);
            return list1.equals(list2);
        }

        // конвертировать Map в List
        public static List<EntityDress> convertMapToList(Map<String, EntityDress> map) {

            List<EntityDress> list = new ArrayList<>(map.values());
            return list;
        }

        // конвертировать List в Массив (массив содержит только String - значения поля model)
        public static String[] convertListToModelArray(List<EntityDress> list) {

            String [] arrayModels = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arrayModels[i] = list.get(i).getModel();
            }
//            Iterator<E> iterator ?????
            return arrayModels;
        }

        // конвертировать отфильтровать List, оставив только позиции по заданному цвету
        public static List<EntityDress> filterByColor(List<EntityDress> list, String color) {

            List<EntityDress> filteredList = new ArrayList<>();
            for (EntityDress dress : list){
                if (dress.getColor().equals(color)){
                    filteredList.add(dress);
                }
            }
            return filteredList;
        }



}
