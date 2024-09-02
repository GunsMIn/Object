package com.example.object.chapter1.step2;

//판매원
//판매원은 자신이 일하는 매표소를 알고 있어야한다.
public class TicketSeller {

    //외부에서는 ticetOffice에 직접 접근 할 수 없다.
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }


    /**
     * 아래의 코드는 Theater가 관람객의 가방과 판매원의 매표소에 직접 젒근하는 문제가 있다. 결합도가 높다.
     * 해결책으로는 우선 , Audience와 TicketSeller를 자율적인 존재로 만들어야한다.
     * */
    //1.관람객의 가방 안에 초대장이 들어있는지 확인한다.
    //2.초대장이 들어 있다면 , 판매원에게서 받은 티켓을 관람객의 가방 안에 넣어준다.
    //3.초대장이 없다면 , 가방에서 티켓의 금액 만큼을 차감한 후 매표소에 금액을 증가시키나.
    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
