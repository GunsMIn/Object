package com.example.object.chapter1.step2;

import lombok.Getter;

@Getter
public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    //step1에 비해 Audienve와 TicketSeller의 결합도가 낮아졌다.
    public Long buy(Ticket ticket) {
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

}
