package example;

import arc.util.*;

class ScalaLog{
    private static final Object[] empty = {};

    public static void info(Object object){
        Log.info(String.valueOf(object), empty);
    }
}