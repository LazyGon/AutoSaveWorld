/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.team;

import autosaveworld.zlibs.com.dropbox.core.DbxException;

/**
 * The request builder returned by {@link
 * DbxTeamTeamRequests#devicesListMemberDevicesBuilder}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class DevicesListMemberDevicesBuilder {
    private final DbxTeamTeamRequests _client;
    private final ListMemberDevicesArg.Builder _builder;

    /**
     * Creates a new instance of this builder.
     *
     * @param _client  Dropbox namespace-specific client used to issue team
     *     requests.
     * @param _builder  Request argument builder.
     *
     * @return instsance of this builder
     */
    DevicesListMemberDevicesBuilder(DbxTeamTeamRequests _client, ListMemberDevicesArg.Builder _builder) {
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
     * <p> If left unset or set to {@code null}, defaults to {@code true}. </p>
     *
     * @param includeWebSessions  Whether to list web sessions of the team's
     *     member. Defaults to {@code true} when set to {@code null}.
     *
     * @return this builder
     */
    public DevicesListMemberDevicesBuilder withIncludeWebSessions(Boolean includeWebSessions) {
        this._builder.withIncludeWebSessions(includeWebSessions);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code true}. </p>
     *
     * @param includeDesktopClients  Whether to list linked desktop devices of
     *     the team's member. Defaults to {@code true} when set to {@code null}.
     *
     * @return this builder
     */
    public DevicesListMemberDevicesBuilder withIncludeDesktopClients(Boolean includeDesktopClients) {
        this._builder.withIncludeDesktopClients(includeDesktopClients);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code true}. </p>
     *
     * @param includeMobileClients  Whether to list linked mobile devices of the
     *     team's member. Defaults to {@code true} when set to {@code null}.
     *
     * @return this builder
     */
    public DevicesListMemberDevicesBuilder withIncludeMobileClients(Boolean includeMobileClients) {
        this._builder.withIncludeMobileClients(includeMobileClients);
        return this;
    }

    /**
     * Issues the request.
     */
    public ListMemberDevicesResult start() throws ListMemberDevicesErrorException, DbxException {
        ListMemberDevicesArg arg_ = this._builder.build();
        return _client.devicesListMemberDevices(arg_);
    }
}
