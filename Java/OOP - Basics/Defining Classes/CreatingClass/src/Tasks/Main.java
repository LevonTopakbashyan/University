package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

       public static void main(String[] args) throws IOException {
      /*      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            Team team = new Team("Manchester United");

            for (int i = 0; i < n; i++) {
                String[] input = reader.readLine().split(" ");
                try {
                    Person persons = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
                    team.addPlayer(persons);

                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            System.out.println("First team have " + team.getFirstTeam().size());
            System.out.println("Reserve team have " + team.getReserveTeam().size());
*/

            Box box = new Box(2,3,4);

            System.out.println(box.toString());

        }
    }
