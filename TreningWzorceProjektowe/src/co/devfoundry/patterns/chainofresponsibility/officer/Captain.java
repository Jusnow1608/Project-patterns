package co.devfoundry.patterns.chainofresponsibility.officer;

import co.devfoundry.patterns.chainofresponsibility.message.Message;

public class Captain extends Officer {

    private static final int CODE = 15;
    private static final String NAME = "Kapitan Mirowski";

    @Override
    public void processMessage(Message message) {
        if (message.getRank().equals(OfficerRank.CAPTAIN) && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}

