package com.epam.javalearning.gitpractice.visa;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;

public class VisaElectronCardNumberGenerator
        extends AbstractCardNumberGenerator {

    private static final String PREFIX = "4274";

    public VisaElectronCardNumberGenerator() {
    }

    @Override
    public String getNextCardNumber() {

        String cardNumber = PREFIX + getRandomNumber();
        return cardNumber + getCardNumberSuffix(cardNumber);

    }

}
