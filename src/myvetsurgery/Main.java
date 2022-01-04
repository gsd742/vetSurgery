package myvetsurgery;

import myvetsurgery.animals.cat;
import myvetsurgery.animals.dog;

import java.util.ArrayList;

public class Main {

    private static ArrayList<cat> mycatlist = new ArrayList<>();

    public static void main(String[] args) {

        //String petID, String name, int age, String breed, double weight, char sex
        cat myNewcat = new cat("897wjdw","fudge", 10, "mixed" , 2.8, 'm');

        dog mynewdog = new dog ("792sfkih", "pixel", 12, "chow chow", 15, 'f');

    }
}
