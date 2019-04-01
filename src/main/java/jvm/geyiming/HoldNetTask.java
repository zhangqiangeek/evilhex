package jvm.geyiming;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * BTrace使用
 *
 * @Author: evilhex
 * @Date: 2019-03-28 17:46
 */
public class HoldNetTask implements Runnable {
    @Override
    public void run() {
        while (true){
            visitWeb("http://www.le.com");
        }
    }

    public void visitWeb(String strUrl) {
        URL url = null;
        URLConnection urlConnection = null;
        InputStream is = null;
        try {
            url = new URL(strUrl);
            urlConnection = url.openConnection();
            is = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
            StringBuffer bs = new StringBuffer();
            String l = null;
            while ((l = bufferedReader.readLine()) != null) {
                bs.append(l).append("\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            is.hashCode();
        }


    }
}
