package org.example;

import java.util.stream.Stream;

public class GoogleDriveImpl implements GoogleDriveDownloader{
    @Override
    public String signIn(String username, String password) {
        System.out.println("Google drive login işlemi yapıldı");
        return null;
    }

    @Override
    public Stream download(String token, String fileName) {
        System.out.println("Google drive download işlemi yapıldı");
        return null;
    }
}
