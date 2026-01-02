package co.devfoundry.patterns.chainofresponsibility;

import co.devfoundry.patterns.chainofresponsibility.message.Message;
import co.devfoundry.patterns.chainofresponsibility.officer.*;

public class Main {
    public static void main(String [] args) {
        //Message message = new Message ("Atakować!", 15, OfficerRank.CAPTAIN);
        //Message message = new Message ("Atakować!", 20, OfficerRank.GENERAL);
        Message message = new Message ("Atakować!", 143, OfficerRank.GENERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);
    }
}
