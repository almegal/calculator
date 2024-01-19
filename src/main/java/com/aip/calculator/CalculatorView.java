package com.aip.calculator;

public class CalculatorView {
    public String welcome(){
        return "<div style=\"color: blue;text-align:center;top:200px;position: relative\">" +
                "<b> Добропожаловать в калькулятор </b>" +
                "</div>";
    }
    public String plus(int a, int b, int c) {
        return "<div style=\"color: blue;text-align:center;top:200px;position: relative\">" +
                "<b> Результат " + a + " + " + b + " = " + c + "</b>" +
                "</div>";
    }

    public String minus(int a, int b, int c){
        return "<div style=\"color: blue;text-align:center;top:200px;position: relative\">" +
                "<b> Результат " + a + " - " + b + " = " + c + "</b>" +
                "</div>";
    }

    public String multiply(int a, int b, int c) {
        return "<div style=\"color: blue;text-align:center;top:200px;position: relative\">" +
                "<b> Результат " + a + " * " + b + " = " + c + "</b>" +
                "</div>";
    }

    public String divide(int a, int b, int c) {
        return "<div style=\"color: blue;text-align:center;top:200px;position: relative\">" +
                "<b> Результат " + a + " : " + b + " = " + c + "</b>" +
                "</div>";
    }
    public String error(){
        return "<div style=\"color: blue;text-align:center;top:200px;position: relative\">" +
                "<b>  На ноль делить нельзя " + "</b>" +
                "</div>";
    }
}
