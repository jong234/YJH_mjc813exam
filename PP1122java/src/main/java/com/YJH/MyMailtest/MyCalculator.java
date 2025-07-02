package com.YJH.MyMailtest;

public class MyCalculator<I extends Number> {
public static <E extends Number> E add(E mc1, E mc2) {
    if(mc1 instanceof Integer || mc2 instanceof Integer){
        return (E) Integer.valueOf(mc1.intValue() + mc2.intValue());
    }else if(mc1 instanceof Double || mc2 instanceof Double){
        return (E) Double.valueOf(mc1.doubleValue() + mc2.doubleValue());
    }
    return null;
}
public static <E extends Number> E sub(E mc1, E mc2) {
    if(mc1 instanceof Integer || mc2 instanceof Integer){
        return (E) Integer.valueOf(mc1.intValue() - mc2.intValue());
    }else if(mc1 instanceof Double || mc2 instanceof Double){
        return (E) Double.valueOf(mc1.doubleValue() - mc2.doubleValue());
    }
    return null;
}
}
