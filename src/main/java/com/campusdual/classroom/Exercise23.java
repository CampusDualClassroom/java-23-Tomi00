package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> myMap = new HashMap<>();

        myMap.put("person", new Person("John","Smith"));
        myMap.put("teacher", new Teacher("María", "Montessori", "Educación"));
        myMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        myMap.put("doctor", new Doctor("Gregory", "House","Nefrología e infectología"));

        return myMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {

        return map.put(key,value);
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.print(entry.getValue().getDetails());
        }

    }

    public static void main(String[] args) {
        Map<String, Person> myMap = createHashMap();

        System.out.print("Valores del mapa:" + " ");
        printMapValues(myMap);
        System.out.println();

        Person newPolice = new PoliceOfficer("Charles", "Boyle", "B-99");
        Person addedValue = addMapValue(myMap,"Police Officer", newPolice);

        System.out.println("Valor añadido: " + addedValue);


        System.out.print("Valores del mapa después de añadir:");
        printMapValues(myMap);



    }
}
