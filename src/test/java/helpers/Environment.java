package helpers;

public class Environment {

    private static String baseUrl = null;

    public static String createEnvironment() {
        String environment = System.getProperty("environment", "local");
        switch (environment) {
            case "local" : baseUrl = "https://";
            break;
            case "dev"   : baseUrl = "http://dev";
            break;
            case "qa"    : baseUrl = "http://qa";
            break;
        }
        return baseUrl;
    }

}