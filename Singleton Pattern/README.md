# Website Status Checker

This is a simple Java class called `WebsiteStatusChecker` that implements the Singleton pattern. It is used to check the status of a website and provide a consistent message to all users accessing the website.

## Usage

To use the `WebsiteStatusChecker` class, follow these steps:

1. **Get the Singleton Instance**: Use the `getInstance()` method to obtain the singleton instance of the `WebsiteStatusChecker`.

    ```java
    WebsiteStatusChecker statusChecker = WebsiteStatusChecker.getInstance();
    ```

2. **Check Website Status**: Use the `isWebsiteDown()` method to check if the website is down or not.

    ```java
    boolean isDown = statusChecker.isWebsiteDown();
    ```

3. **Set Website Status**: If needed, use the `setWebsiteDown(boolean isWebsiteDown)` method to update the website status.

    ```java
    statusChecker.setWebsiteDown(true);
    ```

4. **Get Message for Users**: Use the `getMessageForUsers()` method to get the message to be displayed to users.

    ```java
    String message = statusChecker.getMessageForUsers();
    ```

## How Singleton Works

The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance. In the `WebsiteStatusChecker` class:

- The constructor is made private to prevent instantiation from outside the class.
- The `getInstance()` method is used to get the singleton instance. It checks if an instance already exists and creates one if not.
- All users accessing the `WebsiteStatusChecker` class will share the same instance, ensuring consistent behavior across the application.

