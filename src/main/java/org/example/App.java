package org.example;

import java.util.Objects;

public record App(Expr left, Expr right) implements Expr {
    public App {
        Objects.requireNonNull(left, "left must not be null");
        Objects.requireNonNull(right, "right must not be null");
    }
}
