package com.example.object.chapter1.step1;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    //초대장 없이 현금
    public Bag(long amount) {
        this(null, amount);
    }

    //초대장 있는 손님
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    //초대장 여부 확인 메서드
    public boolean hasInvitation() {
        return invitation != null;
    }

    //티켓 여부 확인 메서드
    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    //현금 증가 메서드
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    //현금 감소메서드
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
