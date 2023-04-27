package pl.codecool.lambda_stream.method_reference.examples;

public class StringUtils {

    public static String toUpper(String s) {
        return s.toUpperCase();
    }

    public StringUtils toUpperObject(StringUtils s) {
        return s;
    }
}
