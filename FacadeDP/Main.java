package FacadeDP;

public class Main {
    public static void main(String[] args) {

        // SeatReservationService s1 = new SeatReservationService();
        // PaymentService paymentService = new PaymentService();
        // TicketService ticket = new TicketService();
        // LoyaltyPointService lp = new LoyaltyPointService();
        // NotificationService notify = new NotificationService();


        // s1.reserveSeat(1234, "s2");
        // paymentService.pay(734387,300.0);
        // ticket.generateTicket(1234, "B2");
        // lp.addPoints(734387, 90);
        // notify.sendNotif("nitesh@gmail.com", "Movie ticket booked");

        //instead of doing these all tasks here manually .... can't we add a layer who manages these all tasks --- ohh that's facade

        MovieBookingFacade bookingFacade = new MovieBookingFacade();

        bookingFacade.book("nitest@gmail.com",734387,1234,"B2",300.0,90,"Ticket Booked");
    }
}
