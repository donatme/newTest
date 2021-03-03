public class Artifact {
    int partNumber;
    String culture;
    int year;

    public Artifact(int partNumber, String culture, int year) {
        this.partNumber = partNumber;
        this.culture = culture;
        this.year = year;
    }

    public Artifact(int partNumber, String culture) {
        this.partNumber = partNumber;
        this.culture = culture;
    }

    public Artifact(int partNumber) {
        this.partNumber = partNumber;
    }

    public static void main(String[] args) {
       Artifact artifact1 = new Artifact(1234546);
       Artifact artifact2 = new Artifact(1234546, "Culture");
       Artifact artifact3 = new Artifact(1234546, "Culture", 1955);
    }
}
