package org.example;

import java.util.stream.Stream;

public class GoogleAdapter implements IDownloader{

    private GoogleDriveImpl googleDriveImpl;

    public GoogleAdapter(GoogleDriveImpl googleDriveImpl){
        this.googleDriveImpl = googleDriveImpl;
    }

    @Override
    public byte[] download(String fileName) {

        Stream driverFile = googleDriveImpl.download("213213","resume.pdf");
        //strem2byte[] işlemi yapılacak.
        return new byte[0];
    }
}
