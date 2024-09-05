package api.google;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.testing.auth.oauth2.MockGoogleCredential;
import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.GoogleCredentials;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.IOException;

@Configuration
@Setter
@Getter
public class GAuthenticator {
    GoogleCredentials credentials;
    AccessToken accessToken;
    GAuthenticator(){
       try {
           credentials = GoogleCredentials.fromStream(new FileInputStream("/home/mehdi/.config/gcloud/application_default_credentials.json"));
           credentials.refreshIfExpired();
           accessToken = credentials.getAccessToken();
          // OR
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

}
