package ru.job4j.condition;

public class Triangle1 {
    public static boolean exist(double ab, double ac, double bc){
        boolean result = ab + ac > bc && ac + bc > ab && bc + ab > ac;
        return result;
    }
}
