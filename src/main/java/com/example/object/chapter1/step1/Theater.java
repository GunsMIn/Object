package com.example.object.chapter1.step1;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }


    /**
     * 아래의 코드는 Theater가 관람객의 가방과 판매원의 매표소에 직접 젒근하는 문제가 있다. 결합도가 높다.
     * 해결책으로는 우선 , Audience와 TicketSeller를 자율적인 존재로 만들어야한다.
     * */
    //1.관람객의 가방 안에 초대장이 들어있는지 확인한다.
    //2.초대장이 들어 있다면 , 판매원에게서 받은 티켓을 관람객의 가방 안에 넣어준다.
    //3.초대장이 없다면 , 가방에서 티켓의 금액 만큼을 차감한 후 매표소에 금액을 증가시키나.
    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
