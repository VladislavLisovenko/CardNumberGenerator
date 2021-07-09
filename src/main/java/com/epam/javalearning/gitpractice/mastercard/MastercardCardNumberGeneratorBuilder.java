package com.epam.javalearning.gitpractice.mastercard;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;
import com.epam.javalearning.gitpractice.WrongCardTypeException;

public final class MastercardCardNumberGeneratorBuilder {

    private static final String MASTERCARD_MASTERCARD_CARDTYPE = "classic";
    private static final String MASTERCARD_ELECTRONIC_CARDTYPE = "electronic";
    private static final String MASTERCARD_MAESTRO_CARDTYPE = "maestro";

    private MastercardCardNumberGeneratorBuilder() {

    }

    public static AbstractCardNumberGenerator getCardNumberGenerator(
            String cardType) throws
            WrongCardTypeException {

        AbstractCardNumberGenerator cardNumberGenerator;

        if (MASTERCARD_MASTERCARD_CARDTYPE.equals(cardType)) {
            cardNumberGenerator = new MastercardMastercardNumberGenerator();
        } else if (MASTERCARD_ELECTRONIC_CARDTYPE.equals(cardType)) {
            cardNumberGenerator = new MastercardElectronicNumberGenerator();
        } else if (MASTERCARD_MAESTRO_CARDTYPE.equals(cardType)) {
            cardNumberGenerator = new MastercardMaestroNumberGenerator();
        } else {
            throw new WrongCardTypeException();
        }

        return cardNumberGenerator;

    }

}
