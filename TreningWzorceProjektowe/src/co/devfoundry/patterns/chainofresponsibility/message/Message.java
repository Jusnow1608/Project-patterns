package co.devfoundry.patterns.chainofresponsibility.message;

import co.devfoundry.patterns.chainofresponsibility.officer.OfficerRank;

public class Message {
    private String content;
    private int code;
    private OfficerRank rank;

    public Message(String content,  int code, OfficerRank rank) {
        this.content = content;
        this.code = code;
        this.rank = rank;
    }

    public String getContent() {
        return content;
    }

    public OfficerRank getRank() {
        return rank;
    }

    public int getCode() {
        return code;
    }
}
