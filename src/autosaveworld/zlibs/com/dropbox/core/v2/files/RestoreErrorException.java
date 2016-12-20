/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.files;

import autosaveworld.zlibs.com.dropbox.core.DbxApiException;
import autosaveworld.zlibs.com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link RestoreError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserFilesRequests#restore(String,String)}. </p>
 */
public class RestoreErrorException extends DbxApiException {
    // exception for routes:
    //     2/files/restore

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserFilesRequests#restore(String,String)}.
     */
    public final RestoreError errorValue;

    public RestoreErrorException(String routeName, String requestId, LocalizedText userMessage, RestoreError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
