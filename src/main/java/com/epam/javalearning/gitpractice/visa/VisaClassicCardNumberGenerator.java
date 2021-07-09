package com.epam.javalearning.gitpractice.visa;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;

public class VisaClassicCardNumberGenerator
        extends AbstractCardNumberGenerator {

    private static final String PREFIX = "4273";

    public VisaClassicCardNumberGenerator() {
    }

    @Override
    public String getNextCardNumber() {

        String cardNumber = PREFIX + getRandomNumber();
        return cardNumber + getCardNumberSuffix(cardNumber);

    }

}
