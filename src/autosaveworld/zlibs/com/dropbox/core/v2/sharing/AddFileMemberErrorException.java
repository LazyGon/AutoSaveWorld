/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.sharing;

import autosaveworld.zlibs.com.dropbox.core.DbxApiException;
import autosaveworld.zlibs.com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link AddFileMemberError}
 * error.
 *
 * <p> This exception is raised by {@link
 * DbxUserSharingRequests#addFileMember(String,java.util.List)}. </p>
 */
public class AddFileMemberErrorException extends DbxApiException {
    // exception for routes:
    //     2/sharing/add_file_member

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserSharingRequests#addFileMember(String,java.util.List)}.
     */
    public final AddFileMemberError errorValue;

    public AddFileMemberErrorException(String routeName, String requestId, LocalizedText userMessage, AddFileMemberError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
