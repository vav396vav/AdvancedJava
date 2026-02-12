package module9_lesson3_lambda_expressions.validator;

@FunctionalInterface
public interface DataValidator <T> {
    boolean isValid(T data);
}
