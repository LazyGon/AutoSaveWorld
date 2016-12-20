/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.sharing;

import autosaveworld.zlibs.com.dropbox.core.DbxApiException;
import autosaveworld.zlibs.com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * ModifySharedLinkSettingsError} error.
 *
 * <p> This exception is raised by {@link
 * DbxUserSharingRequests#modifySharedLinkSettings(String,SharedLinkSettings,boolean)}.
 * </p>
 */
public class ModifySharedLinkSettingsErrorException extends DbxApiException {
    // exception for routes:
    //     2/sharing/modify_shared_link_settings

    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserSharingRequests#modifySharedLinkSettings(String,SharedLinkSettings,boolean)}.
     */
    public final ModifySharedLinkSettingsError errorValue;

    public ModifySharedLinkSettingsErrorException(String routeName, String requestId, LocalizedText userMessage, ModifySharedLinkSettingsError errorValue) {
        super(requestId, userMessage, buildMessage(routeName, userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
