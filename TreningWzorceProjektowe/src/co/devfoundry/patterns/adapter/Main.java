package co.devfoundry.patterns.adapter;

public class Main {
    public static void main(String[] args)
    {
       ContinentalDevice radio = new ContinentalDevice() {

           public void powerOn() {
            System.out.println("Gra muzyka");
           }
       };

       ContinentalSocket continentalSocket = new ContinentalSocket();

       continentalSocket.plugIn(radio);

       UKDevice ukRadio = new UKDevice() {

           public void powerOn()
           {
               System.out.println("Muzyka gra po angielsku");
           }
       };

       UKSocket ukSocket = new UKSocket();
       ukSocket.plugIn(ukRadio);

       UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);
       continentalSocket.plugIn(adapter);
    }
}
