package com.bluetroy.crawler91.crawler.utils;

import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: heyixin
 * Date: 2018-12-04
 * Time: 06:21
 */
public class SegmentDownloaderTest {

    @Test
    public void download() throws Exception {
        Path path = Paths.get("/Users/heyixin/Downloads");
        String fileName = "美女.jpg";
        String url = "http://ww3.sinaimg.cn/large/0073tLPGgy1fxtcv6n2ivj30u01400wl.jpg";
        SegmentDownloader.download(url,fileName,path);
    }
}