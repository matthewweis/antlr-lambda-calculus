package org.example;

import java.util.Objects;

public record Var(String name) implements Expr {
    public Var {
        Objects.requireNonNull(name, "name must not be null");
    }
}
