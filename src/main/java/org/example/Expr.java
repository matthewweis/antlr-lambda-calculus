package org.example;

public sealed interface Expr permits App, Fn, Var {

}