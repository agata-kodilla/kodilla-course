package com.kodilla.stream.lambda;

public class StreamMain {
    public static void main(String[] args) {
            System.out.println("Welcome to module 7 - Stream");

            SaySomething saySomething = new SaySomething();
            saySomething.say();

//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);

//        Processor processor = new Processor();
//        Executor codeToExecute = () -> System.out.println("This is an example text.");
//        processor.execute(codeToExecute);

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
    }
}