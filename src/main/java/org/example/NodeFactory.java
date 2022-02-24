package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public enum NodeFactory {
    ;

    public static Expr parse(String input) {
        final CharStream stream = CharStreams.fromString(input);
        final LambdaLexer lexer = new LambdaLexer(stream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final LambdaParser parser = new LambdaParser(tokens);
        return new NodeVisitor().visit(parser.expr());
    }

    public static App app(Expr left, Expr right) {
        return new App(left, right);
    }

    public static Fn fn(String name, Expr expr) {
        return new Fn(name, expr);
    }

    public static Var var(String name) {
        return new Var(name);
    }

}
