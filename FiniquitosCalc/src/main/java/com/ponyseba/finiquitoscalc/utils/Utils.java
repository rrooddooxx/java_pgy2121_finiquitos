/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.utils;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author sebastiankravetz
 */
public class Utils {
    
    public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
    return map.entrySet()
              .stream()
              .filter(entry -> Objects.equals(entry.getValue(), value))
              .map(Map.Entry::getKey)
              .collect(Collectors.toSet());
    }  
    
}
