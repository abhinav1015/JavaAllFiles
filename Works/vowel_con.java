public class vowel_con {
    public static void main(String[] args){
        char character2 = 'A';
        char character1 = Character.toLowerCase(character2);
        switch (character1) {
            case 'a':
                System.out.println(character1 + " is vowel");
                break;
                case 'e':
                System.out.println(character1 + " is vowel");
                break;
                case 'i':
                System.out.println(character1 + " is vowel");
                break;
                case 'o':
                System.out.println(character1 + " is vowel");
                break;
                case 'u':
                System.out.println(character1 + " is vowel");
                break;
            default:
                System.out.println(character1 + " is consonant");
                break;
        }
    }
}
