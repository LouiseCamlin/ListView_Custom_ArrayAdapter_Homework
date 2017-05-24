package com.codeclan.example.topdogs;

import java.util.ArrayList;

/**
 * Created by Louise on 24/05/2017.
 */

public class TopDogs {

    private ArrayList<Dog> list;

    public TopDogs() {
        list = new ArrayList<Dog>();
        list.add(new Dog(1, "Miniature Schnauzer","Pupper" ));
        list.add(new Dog(2, "Labrador", "Doggo"));
        list.add(new Dog(3, "Cockapoo", "Fluffer"));
        list.add(new Dog(4, "Pug", "Pupperino"));
        list.add(new Dog(5, "French Bulldog", "Boofer"));
        list.add(new Dog(6, "Great Dane", "blep"));
        list.add(new Dog(7, "Boxer", "Doggo"));
        list.add(new Dog(8, "Irish Wofhound", "Long Boi"));
        list.add(new Dog(9, "Shiba Inu", "Cloud"));
        list.add(new Dog(10, "Cocker Spaniel", "woofer"));
        list.add(new Dog(11, "Dalmatian", "Bork"));
        list.add(new Dog(12, "Siberian Husky", "Doggo"));
        list.add(new Dog(13, "Old English Sheepdog", "Fluffer"));
        list.add(new Dog(14, "Corgi", "Corgo"));
        list.add(new Dog(15, "Alaskan Malamute", "Pupper"));
        list.add(new Dog(16, "Beagle", "Pupperino"));
        list.add(new Dog(17, "Saint Bernard", "Fluffer"));
        list.add(new Dog(18, "The Matrix", "blop"));
        list.add(new Dog(19, "Xoloitzcuintli", "Pupperino"));
        list.add(new Dog(20, "Weimaraner", "Doggo"));
    }

    public ArrayList<Dog> getList() {
        return new ArrayList<Dog>(list);
    }









}
