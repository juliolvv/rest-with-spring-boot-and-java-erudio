package rest_with_spring_boot_and_java_erudio.math;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import rest_with_spring_boot_and_java_erudio.exception.UnsupportedMathOperationException;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    // http://localhost:8080/math/multiplication/3/5
    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    // http://localhost:8080/math/division/3/5
    public Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    // http://localhost:8080/math/mean/3/5
    public Double mean(Double numberOne, Double numberTwo) {
        return (numberOne - numberTwo) / 2;
    }

    // http://localhost:8080/math/squareroot/3/5
    public Double squareRoot(Double number) {
        return Math.sqrt( number);
    }
}
