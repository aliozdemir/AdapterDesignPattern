package org.example;

import java.util.stream.Stream;

public class GoogleAdapter implements IDownloader{

    private GoogleDriveImpl googleDriveImpl;

    public GoogleAdapter(GoogleDriveImpl googleDriveImpl){
        this.googleDriveImpl = googleDriveImpl;
    }

    @Override
    public byte[] download(String fileName) {

        //Client google drive download sürecini bilmeyecek
        String token = googleDriveImpl.signIn("ali","12345");
        Stream driverFile = googleDriveImpl.download(token,"resume.pdf");
        //strem2byte[] işlemi yapılacak.
        return new byte[0];
    }
}
