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
}
