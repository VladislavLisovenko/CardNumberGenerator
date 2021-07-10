package com.epam.javalearning.gitpractice.mir;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;

public class MirDebetCardNumberGenerator extends AbstractCardNumberGenerator {

    private static final String PREFIX = "2203";

    public MirDebetCardNumberGenerator() {
    }

    @Override
    public String getNextCardNumber() {

        String cardNumber = PREFIX + getRandomNumber();
        return cardNumber + getCardNumberSuffix(cardNumber);

    }

}
