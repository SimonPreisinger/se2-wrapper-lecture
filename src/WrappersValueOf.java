public class WrappersValueOf {
    public static void main(String... args) {
        {
            Integer i = new Integer(1);
            Integer j = new Integer(1);
            System.out.println(i == j); // nicht gleiche Referenz vergleicht Addressen
            System.out.println(i.equals(j)); // prüft Inhalt logisch gleich
        }
        {
            Integer i = 1; // Autoboxing ??
            Integer j = 1;
            System.out.println(i == j);
        }
        {
            Integer i = Integer.valueOf(1);

            // referenz auf früher erzeugtes Object
            // nur mit factory methode möglich nicht constructor
            // gleiche addresse
            Integer j = Integer.valueOf(1);

            System.out.println(i == j);
        }
        {
            int i = 1;
            int j = 1;
            System.out.println(i == j);
        }
        {
            Integer i = Integer.valueOf(200);
            Integer j = Integer.valueOf(200);
            System.out.println(i == j);
        }
    }
}
