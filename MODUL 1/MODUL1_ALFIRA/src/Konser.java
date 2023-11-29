public class Konser {
    private String bandName;
    private date date;
    private String location;
    private int ticketPrice;

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void setDate(date date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getBandName() {
        return bandName;
    }

    public date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public int TicketPrice() {
        return ticketPrice;
    }
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    
}