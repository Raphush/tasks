public class StringiTersCevir {
    public static void main(String[] args) {
        String original = "GarageAcademy";

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            stringBuilder.append(original.charAt(i));
        }


        String tersi = stringBuilder.toString();


        System.out.println("Original string: " + original);
        System.out.println("Stringin tersi: " + tersi);
    }
}
