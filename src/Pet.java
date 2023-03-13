import java.time.LocalDate;

public class Pet {

  public enum Kind {
    DOG, CAT, OTHER
  }

  private Kind kind;
  private String name;
  private LocalDate birthDate;
  private double weight;

  public Pet(Kind kind, String name, LocalDate birthDate, double weight) {
    this.kind = kind;
    this.name = name;
    this.birthDate = birthDate;
    this.weight = weight;
  }

  public Kind getKind() {
    return kind;
  }

  public void setKind(Kind kind) {
    this.kind = kind;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public static Pet fromString(String input) {
    String[] parts = input.split(",");
    Kind kind = Kind.valueOf(parts[0].toUpperCase());
    String name = parts[1];
    double weight = 0;
    LocalDate birthDate = null;
    if (kind == Kind.CAT) {
      weight = Double.parseDouble(parts[2]);
    } else if (kind == Kind.OTHER) {
      weight = Double.parseDouble(parts[2]);
      birthDate = LocalDate.parse(parts[3]);
    } else {
      // DOG
      birthDate = LocalDate.parse(parts[2]);
    }
    return new Pet(kind, name, birthDate, weight);
  }

  @Override
  public String toString() {
    String str = "Pet: kind=" + kind + ", name='" + name + "'";
    if (kind == Kind.CAT) {
      str += ", weight=" + weight;
    } else if (kind == Kind.OTHER) {
      str += ", weight=" + weight + ", birthDate=" + birthDate;
    } else {
      // DOG
      str += ", birthDate=" + birthDate;
    }
    return str;
  }
}
