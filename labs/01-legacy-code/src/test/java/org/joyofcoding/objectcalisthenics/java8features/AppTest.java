package org.joyofcoding.objectcalisthenics.java8features;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created by aziz on 16-4-17 :)
 */
public class AppTest {
    public static void main(String[] args) {

        List<City> cities = Arrays.asList(
                new City("Amersfoort"),
                new City("Amsterdam"),
                new City("Utrecht")
        );
        cities.forEach(city -> System.out.println(city.getName()));
    }
}



