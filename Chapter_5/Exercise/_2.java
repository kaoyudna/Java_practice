public class _2 {
  
  public static void main(String[] args) {
    email("こんにちは", "aaaaaa@examole.com", "いい天気ですね");
    email("aaaaaa@examole.com", "いい天気ですね");
  }
  
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました\n" + "件名：" + title + "\n" + "本文:" + text);
  }
  
  public static void email(String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
}