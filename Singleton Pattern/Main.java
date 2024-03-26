public class Main {
    public static void main(String[] args) {
        WebsiteStatusChecker statusChecker = WebsiteStatusChecker.getInstance();
        System.out.println("Message for users: " + statusChecker.getMessageForUsers());
    }
}
