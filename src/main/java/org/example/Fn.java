package org.example;

import java.util.Objects;

public record Fn(String name, Expr expr) implements Expr {
    public Fn {
        Objects.requireNonNull(name, "name must not be null");
        Objects.requireNonNull(expr, "expr must not be null");
    }
}
