package co.devfoundry.patterns.chainofresponsibility.officer;

import co.devfoundry.patterns.chainofresponsibility.message.Message;

public class General extends Officer {

    private static final int CODE = 20;
    private static final String NAME = "Generał Nowakowski";

    @Override
    public void processMessage(Message message) {
        if (message.getRank().equals(OfficerRank.GENERAL) && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        } else {
            System.out.println("Zły adresat wiadomości lub zły kod szyfrujący!");
        }
    }
}