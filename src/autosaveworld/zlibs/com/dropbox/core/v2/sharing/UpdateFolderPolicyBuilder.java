/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.sharing;

import autosaveworld.zlibs.com.dropbox.core.DbxException;

/**
 * The request builder returned by {@link
 * DbxUserSharingRequests#updateFolderPolicyBuilder}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class UpdateFolderPolicyBuilder {
    private final DbxUserSharingRequests _client;
    private final UpdateFolderPolicyArg.Builder _builder;

    /**
     * Creates a new instance of this builder.
     *
     * @param _client  Dropbox namespace-specific client used to issue sharing
     *     requests.
     * @param _builder  Request argument builder.
     *
     * @return instsance of this builder
     */
    UpdateFolderPolicyBuilder(DbxUserSharingRequests _client, UpdateFolderPolicyArg.Builder _builder) {
        if (_client == null) {
            throw new NullPointerException("_client");
        }
        this._client = _client;
        if (_builder == null) {
            throw new NullPointerException("_builder");
        }
        this._builder = _builder;
    }

    /**
     * Set value for optional field.
     *
     * @param memberPolicy  Who can be a member of this shared folder. Only
     *     applicable if the current user is on a team.
     *
     * @return this builder
     */
    public UpdateFolderPolicyBuilder withMemberPolicy(MemberPolicy memberPolicy) {
        this._builder.withMemberPolicy(memberPolicy);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param aclUpdatePolicy  Who can add and remove members of this shared
     *     folder.
     *
     * @return this builder
     */
    public UpdateFolderPolicyBuilder withAclUpdatePolicy(AclUpdatePolicy aclUpdatePolicy) {
        this._builder.withAclUpdatePolicy(aclUpdatePolicy);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * @param sharedLinkPolicy  The policy to apply to shared links created for
     *     content inside this shared folder. The current user must be on a team
     *     to set this policy to {@link SharedLinkPolicy#MEMBERS}.
     *
     * @return this builder
     */
    public UpdateFolderPolicyBuilder withSharedLinkPolicy(SharedLinkPolicy sharedLinkPolicy) {
        this._builder.withSharedLinkPolicy(sharedLinkPolicy);
        return this;
    }

    /**
     * Issues the request.
     */
    public SharedFolderMetadata start() throws UpdateFolderPolicyErrorException, DbxException {
        UpdateFolderPolicyArg arg_ = this._builder.build();
        return _client.updateFolderPolicy(arg_);
    }
}
