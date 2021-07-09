package com.epam.javalearning.gitpractice.mir;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;

public class MirClassicCardNumberGenerator extends AbstractCardNumberGenerator {

    private static final String PREFIX = "2201";

    public MirClassicCardNumberGenerator() {
    }

    @Override
    public String getNextCardNumber() {

        String cardNumber = PREFIX + getRandomNumber();
        return cardNumber + getCardNumberSuffix(cardNumber);

    }

}
