package com.epam.javalearning.gitpractice.visa;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;
import com.epam.javalearning.gitpractice.WrongCardTypeException;

public final class VisaCardNumberGeneratorBuilder {

    private static final String VISA_CLASSIC_CARDTYPE = "classic";
    private static final String VISA_ELECTRON_CARDTYPE = "electron";
    private static final String VISA_GOLD_CARDTYPE = "gold";

    private VisaCardNumberGeneratorBuilder() {

    }

    public static AbstractCardNumberGenerator getCardNumberGenerator(
            String cardType) throws
            WrongCardTypeException {

        AbstractCardNumberGenerator cardNumberGenerator;

        if (VISA_CLASSIC_CARDTYPE.equals(cardType)) {
            cardNumberGenerator = new VisaClassicCardNumberGenerator();
        } else if (VISA_ELECTRON_CARDTYPE.equals(cardType)) {
            cardNumberGenerator = new VisaElectronCardNumberGenerator();
        } else if (VISA_GOLD_CARDTYPE.equals(cardType)) {
            cardNumberGenerator = new VisaGoldCardNumberGenerator();
        } else {
            throw new WrongCardTypeException();
        }

        return cardNumberGenerator;

    }
}
