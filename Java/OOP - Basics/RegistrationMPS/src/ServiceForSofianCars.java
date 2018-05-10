public class ServiceForSofianCars extends CustomerService {

    public ServiceForSofianCars(){
        super();
    }



    @Override
    public int receivingRequests(RegistrationRequest request) {
        if ((request.getRegNumber().charAt(0) == 'C') &&
                ((request.getRegNumber().charAt(0) == 'C') && (request.getRegNumber().charAt(1) == 'A'))){
           // requests.remove(request);
            return 0;
        }
        else {
            requests.add(request);
        }
        request.entranceNumber = this.currentEntranceNumber;
        this.currentEntranceNumber++;

        return request.entranceNumber;
    }


}
