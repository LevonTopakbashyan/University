import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ServiceForChangingRegNumber {

    List<RegistrationRequest> requests = new ArrayList<RegistrationRequest>();
    private int officeNumber;
    public int currentEntranceNumber = 1;
    //RegistrationRequest request = new RegistrationRequest("Levo","Lyubka","PK1997AC",0);


    Scanner reader = new Scanner(System.in);

    public CustomerService(){
        System.out.println("Enter office number");
        this.officeNumber = Integer.parseInt(reader.nextLine());
    }

    public int receivingRequests(RegistrationRequest request){
            request.entranceNumber = this.currentEntranceNumber;
            requests.add(request);
            this.currentEntranceNumber++;

            return request.entranceNumber;
    }



    @Override
    public String toString() {
        return String.format("Levo e Lyubka");
    }
}
