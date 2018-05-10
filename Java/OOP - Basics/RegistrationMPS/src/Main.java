public class Main {

    public static void main(String[] args) {


        RegistrationRequest request = new RegistrationRequest("Lyubka","Levo", "Cs 1997 AC", 7);

        RegistrationRequest request1 = new RegistrationRequest("Levo","Zdravko", "CA 1997 AC", 0);


        RegistrationRequest request2 = new RegistrationRequest("Vasil","Icak", "C 2832 Ly", 3);
        //CustomerService anotherRequest = new CustomerService();

        ServiceForSofianCars cars = new ServiceForSofianCars();

        cars.receivingRequests(request);
        cars.receivingRequests(request1);
        cars.receivingRequests(request2);


       // System.out.println(cars.receivingRequests(request1));
        //System.out.println(cars.receivingRequests(request));


        System.out.println(request.toString());
        System.out.println(request1.toString());
        System.out.println(request2.toString());

        System.out.println(cars.requests.size());


        //anotherRequest.receivingRequests(request);
       // anotherRequest.receivingRequests(request);

        //System.out.println(cars.requests.size());


       //System.out.println(anotherRequest.toString());



    }
}
