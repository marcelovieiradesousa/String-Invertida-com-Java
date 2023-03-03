public class App {
    public static void main(String[] args) throws Exception {
        String original = "Marcelo Vieira de Sousa";
        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        System.out.println(invertida);
    }   
}
