import java.util.Scanner;

public class Game {
    public static void game (String[] words){
        String word = words[((int) (Math.random() * words.length))];;
        System.out.println(word);
        String maskWord = "-".repeat(word.length());
        Scanner input = new Scanner(System.in);
        StringBuilder repWord = new StringBuilder(maskWord);
        System.out.println("�������� ����� �� "+ word.length() +" ����.");
        System.out.println("����� - \"" + maskWord+"\".");
        while (maskWord.contains("-")) {
            System.out.print("������� �����, ����� ����� ��� ����� �������: ");
            String inLetter = input.nextLine().toLowerCase();
            if (inLetter.equals(""))   System.out.println("�� �� ����� �����.");
            else if (inLetter.length()> word.length() ) System.out.println("�� ����� ���� ������ ��� � �����");
            else if (word.equals(inLetter))  break;
            else if (word.contains(inLetter) || inLetter.length()>1) {
                for (int i = 0; i < inLetter.length(); i++) {
                    for (int j = 0; j < word.length(); j++) {
                        if (inLetter.charAt(i) == word.charAt(j)) {
                            repWord.setCharAt(j, inLetter.charAt(i));
                            System.out.println("���� ����� - \"" + inLetter.charAt(i) + "\"");
                        }
                    }
                }
                if (maskWord.equals(repWord.toString()))  System.out.println("��� ����� ����.");
            }
            else System.out.println("��� ����� �����");
            maskWord = repWord.toString();
            System.out.println("����� - \"" + maskWord+"\".");
        }
        System.out.println("�����������!!! �� ������� �����.");
    }
}
