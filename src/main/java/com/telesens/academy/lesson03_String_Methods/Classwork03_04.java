package com.telesens.academy.lesson03_String_Methods;

/*
4.
Имеем исходный массив:
String[] tracks={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};
Вывести на консоль треки от 10 до 15 включительно
=>
track_15
track_12
track_11
track_10
*/


public class Classwork03_04 {
    public static void main(String[] args) {

        String[] tracks = {"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};

        for (String track : tracks) {
            if (isTrackInRange(track, 10, 15))
                System.out.println(track);
        }
    }

    private static boolean isTrackInRange(String track, int from, int to) {
        int n = Integer.parseInt(track.substring(track.length()-2));
        if (n >= from && n <= to)
            return true;
        else
            return  false;
    }



    }


