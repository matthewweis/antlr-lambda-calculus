package org.example;

import java.util.Arrays;

public class ApplicationLauncher {

    public static void main(String[] args) {
        Arrays.stream(args)
                .map(NodeFactory::parse)
                .forEachOrdered(System.out::println);
    }

}
