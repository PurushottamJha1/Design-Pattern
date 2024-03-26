public class WebsiteStatusChecker {
    private static WebsiteStatusChecker instance;
    private boolean isWebsiteDown;

    private WebsiteStatusChecker() {
        this.isWebsiteDown = true;
    }

    public static synchronized WebsiteStatusChecker getInstance() {
        if (instance == null) {
            instance = new WebsiteStatusChecker();
        }
        return instance;
    }

    public boolean isWebsiteDown() {
        return isWebsiteDown;
    }

    public void setWebsiteDown(boolean isWebsiteDown) {
        this.isWebsiteDown = isWebsiteDown;
    }

    public String getMessageForUsers() {
        if (isWebsiteDown) {
            return "Website down";
        } else {
            return "Website is up and running";
        }
    }
}
