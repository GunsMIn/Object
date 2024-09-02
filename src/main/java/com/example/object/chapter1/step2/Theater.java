package com.example.object.chapter1.step2;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

   //step1에서 리펙토링 됨.
    //Theater는 단지 ticketSeller가 sellTo 만 안다.
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
