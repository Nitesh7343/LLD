package FacadeDP;

public class TicketService {
    public void generateTicket(int movieID, String seatNo) {
        System.out.printf("Ticket generated for %d, seat no: %s %n",movieID,seatNo);
    }
}
