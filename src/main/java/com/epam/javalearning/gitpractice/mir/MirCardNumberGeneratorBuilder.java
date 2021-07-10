package com.epam.javalearning.gitpractice.mir;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;
import com.epam.javalearning.gitpractice.WrongCardTypeException;

public final class MirCardNumberGeneratorBuilder {

    private static final String MIR_CLASSIC_CARDTYPE = "classic";
    private static final String MIR_PREMIUM_CARDTYPE = "premium";
    private static final String MIR_DEBET_CARDTYPE = "debet";

    private MirCardNumberGeneratorBuilder() {

    }

    public static AbstractCardNumberGenerator getCardNumberGenerator(
            String cardType) throws
            WrongCardTypeException {

        AbstractCardNumberGenerator cardNumberGenerator;

        if (MIR_CLASSIC_CARDTYPE.equals(cardType)) {
            cardNumberGenerator = new MirClassicCardNumberGenerator();
        } else if (MIR_PREMIUM_CARDTYPE.equals(cardType)) {
            cardNumberGenerator = new MirPremiumCardNumberGenerator();
        } else if (MIR_DEBET_CARDTYPE.equals(cardType)) {
            cardNumberGenerator = new MirDebetCardNumberGenerator();
        } else {
            throw new WrongCardTypeException();
        }

        return cardNumberGenerator;

    }

}
