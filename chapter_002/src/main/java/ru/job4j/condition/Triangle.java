package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc ){
        boolean result = ab + ac > bc && bc + ac > ab && bc + ab > ac;
        return result;
    }
}
