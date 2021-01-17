
public class TravelAbroad_Facade {

    public void createTraveAboroad(){
		Flight.orderFilght();
		Hotel.bookHotel();
		Insurance.makeTravelInsurance();
		Flight flight = new Flight();
		flight.plane();
    }
	public  static void main(String[] argv) {
        TravelAbroad_Facade task = new TravelAbroad_Facade();
        task.createTraveAboroad();
	}
}
