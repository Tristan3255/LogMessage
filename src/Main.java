public class Main {

    public static void main(String[] args) {
        LogMessage Log = new LogMessage("SERVER2:read error on disk DSK1");
        LogMessage Log1 = new LogMessage("CLIENT3:DISK");
        System.out.println(Log.containsWord("disk"));
        System.out.println(Log1.containsWord("disk"));



    }
}
