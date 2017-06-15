/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mover
 */
public class AppJersey {

    private static final Logger LOG = Logger.getLogger(AppJersey.class.getName());
    private static final int PORT = 8080;
    private static final String HOST = "http://localhost:" + PORT + "/";

    private static final RestTemplate restTemplate = new RestTemplate();
    static {
        System.out.println("POST: " + PORT);
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static int getPORT() {
        return PORT;
    }

    public static String getHOST() {
        return HOST;
    }

    public static RestTemplate getRestTemplate() {
        return restTemplate;
    }


}
