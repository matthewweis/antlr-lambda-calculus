package org.example;

public class NodeVisitor extends LambdaBaseVisitor<Expr> {

    // ====== //
    // simple //
    // ====== //

    @Override
    public App visitApp(LambdaParser.AppContext ctx) {
        return new App(visit(ctx.left), visit(ctx.right));
    }

    @Override
    public Var visitVariable(LambdaParser.VariableContext ctx) {
        return new Var(extractName(ctx));
    }

    @Override
    public Fn visitFn(LambdaParser.FnContext ctx) {
        return new Fn(extractName(ctx), visitScope(ctx.scope()));
    }

    // ========= //
    // composite //
    // ========= //

    @Override
    public App visitApplication(LambdaParser.ApplicationContext ctx) {
        return visitApp(ctx.app());
    }

    @Override
    public Fn visitFunction(LambdaParser.FunctionContext ctx) {
        return visitFn(ctx.fn());
    }

    @Override
    public Expr visitScope(LambdaParser.ScopeContext ctx) {
        return visit(ctx.expr());
    }

    // ======= //
    // utility //
    // ======= //

    private String extractName(LambdaParser.FnContext ctx) {
        return ctx.name.getText();
    }

    private String extractName(LambdaParser.VariableContext ctx) {
        return ctx.name.getText();
    }

}
