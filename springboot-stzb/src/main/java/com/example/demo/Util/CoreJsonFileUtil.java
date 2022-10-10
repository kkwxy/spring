package com.example.demo.Util;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.PlaceDao;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.text.Normalizer;

public class CoreJsonFileUtil {

    private static final String USER_CORE_URL = "D:\\core.json";

    public static PlaceDao readFileContext() {
        String coreJson = readUserCore();
        if (StringUtils.isNotEmpty(coreJson)) {
            return JSONObject.parseObject(coreJson, PlaceDao.class);
        }
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

    public static String readUserCore() {
        StringBuffer sb = new StringBuffer();
        try {
            File file = new File(USER_CORE_URL);
            if (!file.exists()) {
                return "";
            }
            FileInputStream stream = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(stream, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String string = null;
            while ((string = br.readLine()) != null) {
                sb.append(string);
            }
            stream.close();
            reader.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void writeUserCore(String json) {
        try {
            FileWriter fw = new FileWriter(USER_CORE_URL);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(json);
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
