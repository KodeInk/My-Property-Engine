package myproperty.helper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.istack.internal.Nullable;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Created by Manny on 5/1/2017.
 */
public class utilities {

    public static final String DATE_FORMAT = "dd/MMM/yyyy";
    public static final Locale DEFAULT_LOCALE = Locale.ENGLISH;

    private static final Logger LOG = Logger.getLogger(utilities.class.getName());
    private static final Calendar CALENDAR = Calendar.getInstance(DEFAULT_LOCALE);
    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final Random RANDOM = new Random();




    public static String getRandomNum(int numLength) {
        String SALTCHARS = "123456789";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < numLength) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static String getSaltString(int stringLenght) {
        String SALTCHARS = "abcdefghijklmnpqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < stringLenght) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public static void initState() {
//        boolean distinct = true;
//
//        distinctionCheck: {
//            for (String stringPropertyName : System.getProperties().stringPropertyNames()) {
//                for (String key : System.getenv().keySet()) {
//                    if (stringPropertyName.equals(key)) {
//                        System.out.println(stringPropertyName + " and " + key + " are equal");
//                        distinct = false;
//                        break distinctionCheck;
//                    }
//                }
//            }
//        }
//
//        if (distinct) {
//            System.getenv().keySet().stream().forEach((key) -> {
//                System.setProperty(key, System.getenv(key));
//            });
//        }
//
        System.getenv().keySet().stream().forEach((key) -> {
            System.setProperty(key, System.getenv(key));
            LOG.log(Level.FINE, "{0} : {1}", new Object[]{key, System.getenv(key)});
        });
    }

    public static String getNewAwamoID() {
        LOG.fine("get new awamoId");
        //return WebserviceConnection.ID_GENERATOR.get(String.class, "/", "token", "ABCD");
        return new BigInteger(Long.toString(System.currentTimeMillis() - 1000000000000L)).toString(36).toUpperCase();
    }




    public static byte[] readAllFromInputstream(InputStream is) {
        return readAllFromInputstream(is, -1);
    }

    public static byte[] readAllFromInputstream(InputStream is, long size) {
        byte[] bytes;

        if (size >= 0) {
            bytes = new byte[(int) size];

            try {
                is.read(bytes);
            } catch (IOException ex) {
                LOG.log(Level.SEVERE, utilities.getStackTrace(ex));
            }
        } else {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();

            try {
                int nRead;
                byte[] data = new byte[16384];

                while ((nRead = is.read(data, 0, data.length)) != -1) {
                    buffer.write(data, 0, nRead);
                }

                buffer.flush();
            } catch (IOException ex) {
                LOG.log(Level.SEVERE, utilities.getStackTrace(ex));
            }

            bytes = buffer.toByteArray();
        }

        return bytes;
    }

    public static String readAsString(InputStream input) throws IOException {
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(input))) {
            return buffer.lines().collect(Collectors.joining("\n"));
        }
    }

    public static String getPropertyAsString(Properties properties) {
        StringWriter writer = new StringWriter();
        properties.list(new PrintWriter(writer));
        return writer.getBuffer().toString();
    }

    public static String getParameterForLogging(Map parameter) {
        try {
            if (parameter == null || parameter.isEmpty()) {
                return "none";
            } else {
                return OBJECT_MAPPER.writeValueAsString(parameter);
            }
        } catch (JsonProcessingException ex) {
            return "--- parameter conversion error ---";
        }
    }

    public static void logParameters(String message, Map parameter, String logId) {
        String parameterLog = getParameterForLogging(parameter);
        if (parameterLog.charAt(0) == '-') {
            LOG.log(Level.SEVERE, "{0} :: log parameters failed", logId);
        } else {
            LOG.log(Level.INFO, "{0} :: {1}: {2}", new Object[]{logId, message, parameterLog});
        }

    }




    public static BufferedImage resizeImages(BufferedImage img, int newW, int newH) {
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, img.getType());
        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return dimg;
    }

    public static BufferedImage resizeImages(BufferedImage img, int newW) {
        int width = img.getWidth();
        float fWidth = (float) width;
        int height = img.getHeight();
        float fHeight = (float) height;
        float fNewW = (float) newW;
        float factor = fNewW / fWidth;
        float fNewH = fHeight * factor;
        int newH = Math.round(fNewH);

        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, img.getType());
        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return dimg;
    }

    public static byte[] resizeImage(byte[] flieData, int width, int height) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(flieData);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {

            BufferedImage img = ImageIO.read(in);
            if (height == 0) {
                height = (width * img.getHeight()) / img.getWidth();
            }
            if (width == 0) {
                width = (height * img.getWidth()) / img.getHeight();
            }

            BufferedImage imageBuff = resizeImages(img, height, width);

            ImageIO.write(imageBuff, "jpg", buffer);

            return buffer.toByteArray();

        } catch (Exception em) {

        } finally {
            buffer.flush();
            buffer.close();

        }

        return flieData;
    }

    public static void addIfNotNull(Map map, Object key, Object value) {
        if (value != null) {
            map.put(key, value);
        }
    }

    public static Long atNoon(Long date) {
        if (date == null) {
            return null;
        }

        CALENDAR.setTimeInMillis(date);
        CALENDAR.set(Calendar.HOUR_OF_DAY, 12);
        CALENDAR.set(Calendar.MINUTE, 0);
        CALENDAR.set(Calendar.SECOND, 0);
        CALENDAR.set(Calendar.MILLISECOND, 0);
        return CALENDAR.getTimeInMillis();
    }

    public static String getFormattedDate(Long date) {
        if (date == null) {
            return null;
        }

        return getFormattedDate(new Date(date));
    }

    public static String getFormattedDate(Date date) {
        return new SimpleDateFormat(DATE_FORMAT, utilities.DEFAULT_LOCALE).format(date);
    }

    public static String getStackTrace(final Throwable throwable) {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter, true);
        throwable.printStackTrace(printWriter);

        return stringWriter.getBuffer().toString();
    }

    public static void logHttpServletRequest(HttpServletRequest httpServletRequest, String logId) {
        Enumeration<String> names = httpServletRequest.getHeaderNames();
        while (names.hasMoreElements()) {
            String nextElement = names.nextElement();
            LOG.log(Level.INFO, "{0} :: header: {1} :: {2}", new Object[]{logId, nextElement, httpServletRequest.getHeader(nextElement)});
        }

        LOG.log(Level.INFO, "{0} :: Method    : {1}", new Object[]{logId, httpServletRequest.getMethod()});
        LOG.log(Level.INFO, "{0} :: Protocol  : {1}", new Object[]{logId, httpServletRequest.getProtocol()});
        LOG.log(Level.INFO, "{0} :: RemoteAddr: {1}", new Object[]{logId, httpServletRequest.getRemoteAddr()});
        LOG.log(Level.INFO, "{0} :: RemoteHost: {1}", new Object[]{logId, httpServletRequest.getRemoteHost()});
        LOG.log(Level.INFO, "{0} :: RequestURL: {1}", new Object[]{logId, httpServletRequest.getRequestURL()});
    }

    public static boolean isNullOrEmpty(@Nullable String string) {
        return string == null || string.isEmpty();
    }

    public static boolean isNullOrEmpty(@Nullable List list) {
        return list == null || list.isEmpty();
    }





    public static String getUsername(String authentication) {
        if (authentication == null) {
            return null;
        }
        return new String(Base64.getDecoder().decode(authentication.replace("Basic ", ""))).split(":")[0];
    }

    public static String getPassword(String authentication) {
        if (authentication == null) {
            return null;
        }
        String[] parts = new String(Base64.getDecoder().decode(authentication.replace("Basic ", ""))).split(":");
        if (parts.length < 2) {
            return null;
        }
        return parts[1];
    }




    public static String getLogId() {
        return String.valueOf(Math.abs(RANDOM.nextLong()));
    }

    public static boolean isNumeric(String str) {
        return str.chars().allMatch(Character::isDigit);
    }

    public static final Long longAmountFromText(String text) {
        String s = text.replace(",", "");
        if (!s.contains(".")) {
            s = s + ".0";
        }
        String[] parts = s.split("\\.");
        String decimalString = parts[1];

        switch (decimalString.length()) {
            case 0:
                decimalString = "00";
                break;
            case 1:
                decimalString += "0";
                break;
            case 2:
                // noop, nicely formatted
                break;
            default:
                decimalString = decimalString.substring(0, 2);
                break;
        }

        Long decimals = Long.parseLong(decimalString);
        Long intPart = Long.parseLong(parts[0]) * 100;

        return intPart >= 0 ? intPart + decimals : intPart - decimals;
    }

    //Added by Stephen Kazibwe Sr
    public static String humanReadableByteCount(long bytes, boolean si) {
        int unit = si ? 1000 : 1024;
        if (bytes < unit) return bytes + " B";
        int exp = (int) (Math.log(bytes) / Math.log(unit));
        String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp-1) + (si ? "" : "i");
        return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
    }

    public static String stringReplace(String word, String stringToBeReplaced, String stringToReplace) {

        return word.replace(stringToBeReplaced, stringToReplace);

    }



}
