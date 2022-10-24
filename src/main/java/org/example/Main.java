package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<byte[]> files = new ArrayList<>();

        IDownloader fileSystemDownloader = new FileSystemDownloader();
        files.add(fileSystemDownloader.download("resume.txt"));

        IDownloader googleAdapter = new GoogleAdapter(new GoogleDriveImpl());
        files.add(googleAdapter.download("resume.txt"));


    }
}