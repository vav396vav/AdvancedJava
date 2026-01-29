package module9_functionalprogramming1.lesson3_lambda_expressions.validator;

@FunctionalInterface
public interface DataValidator <T> {
    boolean isValid(T data);
}
