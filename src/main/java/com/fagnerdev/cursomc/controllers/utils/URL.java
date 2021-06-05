package com.fagnerdev.cursomc.controllers.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class URL {

    public static List<Integer> decodeInteger(String s) {
       /* String[] vet = s.split(",");
        List<Integer> list = new ArrayList<>();
        for (String value : vet) {
            list.add(Integer.parseInt(value));
        }
        return list;*/
        return Arrays.asList(s.split(",")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());

    }
}
