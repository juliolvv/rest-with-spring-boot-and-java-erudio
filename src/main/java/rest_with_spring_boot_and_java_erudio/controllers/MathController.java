package rest_with_spring_boot_and_java_erudio.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest_with_spring_boot_and_java_erudio.exception.UnsupportedMathOperationException;
import rest_with_spring_boot_and_java_erudio.math.SimpleMath;
import rest_with_spring_boot_and_java_erudio.request.converters.NumberConverter;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/subtraction/3/5

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/multiplication/3/5

    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/division/3/5

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/mean/3/5

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/squareroot/3/5

    @RequestMapping("/squareroot/{number}")
    public Double mean(
            @PathVariable("number") String number
    ) throws Exception {
        if(!NumberConverter.isNumeric(number))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        // Double result = Math.sqrt(convertToDouble(number));
        // return result;
        return math.squareRoot(NumberConverter.convertToDouble(number));
    }
}
