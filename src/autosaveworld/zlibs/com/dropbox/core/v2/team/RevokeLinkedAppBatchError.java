/* DO NOT EDIT */
/* This file was generated from team_linked_apps.stone */

package autosaveworld.zlibs.com.dropbox.core.v2.team;

import java.io.IOException;
import java.util.Arrays;

import autosaveworld.zlibs.com.dropbox.core.stone.StoneSerializers;
import autosaveworld.zlibs.com.dropbox.core.stone.UnionSerializer;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerationException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerator;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParseException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParser;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonToken;

/**
 * Error returned by {@link
 * DbxTeamTeamRequests#linkedAppsRevokeLinkedAppBatch(java.util.List)}.
 */
public enum RevokeLinkedAppBatchError {
    // union team.RevokeLinkedAppBatchError (team_linked_apps.stone)
    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    OTHER; // *catch_all

    /**
     * For internal use only.
     */
    static class Serializer extends UnionSerializer<RevokeLinkedAppBatchError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(RevokeLinkedAppBatchError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public RevokeLinkedAppBatchError deserialize(JsonParser p) throws IOException, JsonParseException {
            RevokeLinkedAppBatchError value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else {
                value = RevokeLinkedAppBatchError.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
