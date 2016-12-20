/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.files;

import autosaveworld.zlibs.com.dropbox.core.DbxApiException;
import autosaveworld.zlibs.com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link DeleteError} error.
 *
 * <p> This exception is raised by {@link DbxUserFilesRequests#delete(String)}
 * and {@link DbxUserFilesRequests#permanentlyDelete(String)}. </p>
 */
public class DeleteErrorException extends DbxApiException {
    // exception for routes:
    //     2/files/delete
    //     2/files/permanently_delete

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link DbxUserFilesRequests#delete(String)} and
     * {@link DbxUserFilesRequests#permanentlyDelete(String)}.
     */
    public final DeleteError errorValue;

    public DeleteErrorException(String routeName, String requestId, LocalizedText userMessage, DeleteError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
