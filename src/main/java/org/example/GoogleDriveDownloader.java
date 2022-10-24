package org.example;

import java.util.stream.Stream;

public interface GoogleDriveDownloader {

    String signIn(String username, String password);

    Stream download(String token, String fileName);

}
