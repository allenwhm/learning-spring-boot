package com.allenwhm.uploadingFiles;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by : allenwhm
 * DateTime : 2019-03-15 12:59
 **/
public class Downloader {
    public static void main(String[] args) throws MalformedURLException {
        // download the image from website
        String urlTemplate = "https://book.yunzhan365.com/ieih/emuq/files/mobile/%s.jpg";
        for (int i = 1; i < 100; i++) {
            String url = String.format(urlTemplate, i);
            System.out.println("downloading : " + url);
            URL website = new URL(url);
            try (InputStream in = website.openStream()) {
                Files.copy(in, Paths.get(i + ".jpg"), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
