package com.crtpbt.cryptobot.service;

import model.CurrencyModel;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

@Component
public class CurrencyService {

    public String getCurrencyRates() {
        URL url = null;
        try {
            url = new URL("https://api.mexc.com/api/v3/ticker/price");
            String json = IOUtils.toString(url, Charset.forName("UTF-8"));
            JSONObject object = new JSONObject(json);
            System.out.println(object);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        CurrencyModel model = new CurrencyModel();

//        model.setSymbol(object.getString("symbol"));

        return null;
    }

}
