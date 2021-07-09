package com.epam.javalearning.gitpractice;

import com.epam.javalearning.gitpractice.mastercard.MastercardCardNumberGeneratorBuilder;
import com.epam.javalearning.gitpractice.mir.MirCardNumberGeneratorBuilder;
import com.epam.javalearning.gitpractice.visa.VisaCardNumberGeneratorBuilder;

public final class CardNumberGeneratorExecutor {

    private static final String VISA_PAYMENT_SYSTEM = "visa";
    private static final String MASTERCARD_PAYMENT_SYSTEM = "mastercard";
    private static final String MIR_PAYMENT_SYSTEM = "mir";

    private CardNumberGeneratorExecutor() {
    }

    public static void main(String[] args) {

        AbstractCardNumberGenerator cardNumberGenerator;
        String paymentSystem = args[0].toLowerCase();
        String cardType = args[1].toLowerCase();

        if (VISA_PAYMENT_SYSTEM.equals(paymentSystem)) {

            try {
                cardNumberGenerator = VisaCardNumberGeneratorBuilder
                        .getCardNumberGenerator(cardType);
                System.out.println(cardNumberGenerator.getNextCardNumber());
            } catch (WrongCardTypeException exception) {
                System.out.println(exception.getMessage());
            }

        } else if (MASTERCARD_PAYMENT_SYSTEM.equals(paymentSystem)) {

            try {
                cardNumberGenerator = MastercardCardNumberGeneratorBuilder
                        .getCardNumberGenerator(cardType);
                System.out.println(cardNumberGenerator.getNextCardNumber());
            } catch (WrongCardTypeException exception) {
                System.out.println(exception.getMessage());
            }

        } else if (MIR_PAYMENT_SYSTEM.equals(paymentSystem)) {

            try {
                cardNumberGenerator = MirCardNumberGeneratorBuilder
                        .getCardNumberGenerator(cardType);
                System.out.println(cardNumberGenerator.getNextCardNumber());
            } catch (WrongCardTypeException exception) {
                System.out.println(exception.getMessage());
            }

        } else {
            System.out.println("Wrong Payment System entered");
        }

    }

}
