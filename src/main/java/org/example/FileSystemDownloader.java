package org.example;

public class FileSystemDownloader implements IDownloader{
    @Override
    public byte[] download(String fileName) {
        System.out.println(fileName + "dosyası indirildi.");
        return new byte[0];
    }
}
