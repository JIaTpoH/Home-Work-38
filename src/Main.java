import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
try {

  int n = Integer.parseInt(reader.readLine());

  List<Pet> pets = new ArrayList<>();
  for (int i = 0; i < n; i++) {
    String input = reader.readLine();
    pets.add(Pet.fromString(input));
  }

  for (Pet pet : pets) {
    System.out.println(pet);
  }

  reader.close();
} catch (NumberFormatException e)  {
  System.out.println("Wrong number format: " + e.getMessage());
}
  }
}
