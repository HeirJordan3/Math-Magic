package com.codedifferently.MathMagic;

public class Magic {
    public static void main(String[] args) {
        // We will refer to myNumber as the original number from now on - it might be helpful to document this.
        int myNumber = 7;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour -  myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);
    }
}
