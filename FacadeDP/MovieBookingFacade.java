package FacadeDP;

public class MovieBookingFacade {
    SeatReservationService seatReservationService;
    PaymentService paymentService;
    TicketService ticket;
    LoyaltyPointService lpService;
    NotificationService notify;

    public MovieBookingFacade() {
        this.seatReservationService = new SeatReservationService();
        this.paymentService = new PaymentService();
        this.ticket = new TicketService();
        this.lpService = new LoyaltyPointService();
        this.notify = new NotificationService();
    }

    public void book(String email,int accID,int movieID,String seatNo,double cost,int lp,String notification) {
        seatReservationService.reserveSeat(movieID, seatNo);
        paymentService.pay(accID,cost);
        ticket.generateTicket(movieID, seatNo);
        lpService.addPoints(accID, lp);
        notify.sendNotif(email, notification);
    }
}
