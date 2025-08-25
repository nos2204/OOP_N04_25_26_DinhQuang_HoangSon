public class test{
    public static void main(String[] args) throws Exception {
        beer mybeer = new beer();
        mybeer.nhanbeer = "My beer";
        mybeer.gannhanbeer("Hanoi");

        System.err.println("Beer: " + mybeer.laynhanbeer());
    }
}