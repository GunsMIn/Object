package com.example.object.chapter1.step1;

//판매원
//판매원은 자신이 일하는 매표소를 알고 있어야한다.
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
