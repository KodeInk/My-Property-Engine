package myproperty.helper;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by Manny on 5/1/2017.
 */
public class utilities {
    public static String getStackTrace(final Throwable throwable) {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter, true);
        throwable.printStackTrace(printWriter);

        return stringWriter.getBuffer().toString();
    }
}
