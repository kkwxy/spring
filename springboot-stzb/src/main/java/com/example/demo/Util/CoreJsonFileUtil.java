package com.example.demo.Util;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.PlaceDao;
import org.springframework.core.io.ClassPathResource;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class CoreJsonFileUtil {

    public PlaceDao readFileContext() {
        getClass().getClassLoader().getResource("").getFile();
        ByteArrayOutputStream baos = null;
        InputStream config = null;
        String content = null;
        try {
            baos = new ByteArrayOutputStream();
            ClassPathResource f = new ClassPathResource("/core.json");
            if (!f.exists()) {
                return null;
            }
            config = f.getInputStream();
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = config.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            content = baos.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (config != null) {
                    config.close();
                }
                if (baos != null) {
                    baos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return JSONObject.parseObject(content, PlaceDao.class);
    }
}
