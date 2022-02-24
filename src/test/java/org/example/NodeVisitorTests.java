package org.example;

import org.junit.jupiter.api.Test;

import static org.example.NodeFactory.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeVisitorTests {

    /**
     * https://github.com/antlr/grammars-v4/blob/master/lambda/examples/example1.txt
     */
    @Test
    void example1() {
        assertEquals(fn("a", app(var("a"), var("b"))), NodeFactory.parse("λa.(a b)"));
    }

    /**
     * https://github.com/antlr/grammars-v4/blob/master/lambda/examples/example2.txt
     */
    @Test
    void example2() {
        assertEquals(fn("a", var("ab")), NodeFactory.parse("λa.ab"));
    }

    /**
     * https://github.com/antlr/grammars-v4/blob/master/lambda/examples/example3.txt
     */
    @Test
    void example3() {
        assertEquals(fn("a", app(var("a"), var("b"))), NodeFactory.parse("λa.(a b)"));
    }

    /**
     * https://github.com/antlr/grammars-v4/blob/master/lambda/examples/example4.txt
     */
    @Test
    void example4() {
        assertEquals(app(fn("a", var("a")), var("g")), NodeFactory.parse("(λa.a g)bc"));
    }

    /**
     * https://github.com/antlr/grammars-v4/blob/master/lambda/examples/example5.txt
     */
    @Test
    void example5() {
        assertEquals(app(app(fn("a", var("a")), var("b")), var("c")), NodeFactory.parse("((λa.a b) c)"));
    }
}
