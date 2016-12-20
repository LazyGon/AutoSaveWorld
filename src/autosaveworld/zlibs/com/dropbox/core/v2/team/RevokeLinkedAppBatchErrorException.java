/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.team;

import autosaveworld.zlibs.com.dropbox.core.DbxApiException;
import autosaveworld.zlibs.com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * RevokeLinkedAppBatchError} error.
 *
 * <p> This exception is raised by {@link
 * DbxTeamTeamRequests#linkedAppsRevokeLinkedAppBatch(java.util.List)}. </p>
 */
public class RevokeLinkedAppBatchErrorException extends DbxApiException {
    // exception for routes:
    //     2/team/linked_apps/revoke_linked_app_batch

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxTeamTeamRequests#linkedAppsRevokeLinkedAppBatch(java.util.List)}.
     */
    public final RevokeLinkedAppBatchError errorValue;

    public RevokeLinkedAppBatchErrorException(String routeName, String requestId, LocalizedText userMessage, RevokeLinkedAppBatchError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
