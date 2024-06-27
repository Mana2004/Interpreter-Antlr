import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Visitor extends GrammarNSCBaseVisitor<Double> {

    // HashMap to store variable values
    private Map<String, Double> variables = new HashMap<>();

    // Visit the program and start visiting statements
    @Override
    public Double visitProgram(GrammarNSCParser.ProgramContext ctx) {
        return visit(ctx.statements());
    }

    // Visit a single statement
    @Override
    public Double visitState(GrammarNSCParser.StateContext ctx) {
        return visit(ctx.statement());
    }

    // Visit multiple statements
    @Override
    public Double visitStates_state(GrammarNSCParser.States_stateContext ctx) {
        visit(ctx.statements()); // Visit the first set of statements
        return visit(ctx.statement()); // Visit the last statement
    }

    // Handle assignment statements (e.g., x = 5;)
    @Override
    public Double visitEqual(GrammarNSCParser.EqualContext ctx) {
        String id = ctx.identifier().getText(); // Get variable name
        Double value = visit(ctx.binop()); // Evaluate the expression
        variables.put(id, value); // Store the value in the map
        return value;
    }

    // Handle blocks of statements (begin ... end)
    @Override
    public Double visitBegin_end(GrammarNSCParser.Begin_endContext ctx) {
        return visit(ctx.statements());
    }

    // Handle if-then statements
    @Override
    public Double visitIf_then(GrammarNSCParser.If_thenContext ctx) {
        Double result = visit(ctx.binop()); // Evaluate the condition
        if (result != 0) {
            return visit(ctx.statement()); // If condition is true, execute the statement
        }
        return 0.0;
    }

    // Handle if-then-else statements
    @Override
    public Double visitIf_then_else(GrammarNSCParser.If_then_elseContext ctx) {
        Double result = visit(ctx.binop()); // Evaluate the condition
        if (result != 0) {
            return visit(ctx.statement(0)); // If true, execute the first statement
        } else {
            return visit(ctx.statement(1)); // If false, execute the second statement
        }
    }

    // Handle while-do loops
    @Override
    public Double visitWhile_do(GrammarNSCParser.While_doContext ctx) {
        while (visit(ctx.binop()) != 0) { // While the condition is true
            visit(ctx.statement()); // Execute the statement
        }
        return 0.0;
    }

    // Handle for loops (for x of start to end do statement)
    @Override
    public Double visitFor_do(GrammarNSCParser.For_doContext ctx) {
        String id = ctx.identifier().getText(); // Get loop variable
        double start = Double.parseDouble(ctx.number(0).getText()); // Get start value
        double end = Double.parseDouble(ctx.number(1).getText()); // Get end value
        for (Double i = start; i <= end; i++) { // Loop from start to end
            variables.put(id, i); // Update loop variable
            visit(ctx.statement()); // Execute the loop body
        }
        return 0.0;
    }

    // Handle loop statements (loop x: end do statement)
    @Override
    public Double visitLoop_do(GrammarNSCParser.Loop_doContext ctx) {
        String id = ctx.identifier().getText(); // Get loop variable
        int end = Integer.parseInt(ctx.number().getText()); // Get loop end value
        for (double i = 1; i <= end; i++) { // Loop from 1 to end
            variables.put(id, i); // Update loop variable
            visit(ctx.statement()); // Execute the loop body
        }
        return 0.0;
    }

    // Handle print statements (print x;)
    @Override
    public Double visitPrint(GrammarNSCParser.PrintContext ctx) {
        String id = ctx.identifier().getText(); // Get variable name
        Double value = variables.get(id); // Get variable value
        System.out.println(value); // Print the value
        return value;
    }

    // Handle print statements with literals (print "literal", x;)
    @Override
    public Double visitPrint_literal(GrammarNSCParser.Print_literalContext ctx) {
        String message = ctx.sl().getText(); // Get the literal message
        message = message.substring(1, message.length() - 1); // Remove quotes
        String id = ctx.identifier().getText(); // Get variable name
        Double value = variables.get(id); // Get variable value
        System.out.println(message + " " + value); // Print the message and value
        return value;
    }

    // Handle binary operations
    @Override
    public Double visitBinop(GrammarNSCParser.BinopContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.expr()); // If single child, visit the expression
        } else {
            double left = visit(ctx.binop()); // Evaluate left operand
            double right = visit(ctx.expr()); // Evaluate right operand

            switch (Objects.requireNonNull(ctx.getChild(1)).getText()) { // Check the operator
                case "<":
                    return left < right ? 1.0 : 0.0;
                case ">":
                    return left > right ? 1.0 : 0.0;
                case "<=":
                    return left <= right ? 1.0 : 0.0;
                case ">=":
                    return left >= right ? 1.0 : 0.0;
                case "==":
                    return left == right ? 1.0 : 0.0;
                case "!=":
                    return left != right ? 1.0 : 0.0;
                default:
                    throw new RuntimeException("Unknown operator: " + ctx.getChild(1).getText());
            }
        }
    }

    // Handle expressions with addition and subtraction
    @Override
    public Double visitExpr(GrammarNSCParser.ExprContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.term()); // If single child, visit the term
        } else {
            double left = visit(ctx.expr()); // Evaluate left operand
            double right = visit(ctx.term()); // Evaluate right operand

            if (ctx.getChild(1).getText().equals("+")) {
                return left + right; // Addition
            } else {
                return left - right; // Subtraction
            }
        }
    }

    // Handle terms with multiplication, division, and modulo
    @Override
    public Double visitTerm(GrammarNSCParser.TermContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.factor()); // If single child, visit the factor
        } else {
            double left = visit(ctx.term()); // Evaluate left operand
            double right = visit(ctx.factor()); // Evaluate right operand

            switch (ctx.getChild(1).getText()) { // Check the operator
                case "*":
                    return left * right; // Multiplication
                case "/":
                    if (right == 0.0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    return left / right; // Division
                case "%":
                    if (right == 0.0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    return left % right; // Modulo
                default:
                    throw new RuntimeException("Unknown operator: " + ctx.getChild(1).getText());
            }
        }
    }

    // Handle factors with exponentiation
    @Override
    public Double visitFactor(GrammarNSCParser.FactorContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.result()); // If single child, visit the result
        } else {
            double base = visit(ctx.result()); // Evaluate base
            double exponent = visit(ctx.factor()); // Evaluate exponent
            return Math.pow(base, exponent); // Exponentiation
        }
    }

    // Handle number literals
    @Override
    public Double visitNumber(GrammarNSCParser.NumberContext ctx) {
        return Double.parseDouble(ctx.getText());
    }

    // Handle variable identifiers
    @Override
    public Double visitIdentifier(GrammarNSCParser.IdentifierContext ctx) {
        String id = ctx.getText();
        if (!variables.containsKey(id)) {
            throw new RuntimeException("Variable '" + id + "' not defined");
        }
        return variables.get(id);
    }

    // Handle different result types (number, identifier, expression, not)
    @Override
    public Double visitResult(GrammarNSCParser.ResultContext ctx) {
        if (ctx.number() != null) {
            return visit(ctx.number()); // Visit number
        } else if (ctx.identifier() != null) {
            return visit(ctx.identifier()); // Visit identifier
        } else if (ctx.expr() != null) {
            return visit(ctx.expr()); // Visit expression
        } else {
            return 1.0 - visit(ctx.expr()); // Handle not operator
        }
    }
}