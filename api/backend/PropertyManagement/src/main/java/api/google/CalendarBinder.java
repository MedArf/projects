package api.google;

import com.google.auth.oauth2.AccessToken;

public class CalendarBinder {

    public static void main(String[] args) {
            GAuthenticator authenticator = new GAuthenticator();
        AccessToken token=authenticator.getAccessToken();

    }
}

