package com.epam.javalearning.gitpractice.visa;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;

public class VisaGoldCardNumberGenerator extends AbstractCardNumberGenerator {

    private static final String PREFIX = "4275";

    public VisaGoldCardNumberGenerator() {
    }

    @Override
    public String getNextCardNumber() {

        String cardNumber = PREFIX + getRandomNumber();
        return cardNumber + getCardNumberSuffix(cardNumber);

    }

}
