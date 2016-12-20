/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.files;

import autosaveworld.zlibs.com.dropbox.core.DbxApiException;
import autosaveworld.zlibs.com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * GetCopyReferenceError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserFilesRequests#copyReferenceGet(String)}. </p>
 */
public class GetCopyReferenceErrorException extends DbxApiException {
    // exception for routes:
    //     2/files/copy_reference/get

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserFilesRequests#copyReferenceGet(String)}.
     */
    public final GetCopyReferenceError errorValue;

    public GetCopyReferenceErrorException(String routeName, String requestId, LocalizedText userMessage, GetCopyReferenceError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
