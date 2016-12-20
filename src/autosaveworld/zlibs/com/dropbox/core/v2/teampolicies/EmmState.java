/* DO NOT EDIT */
/* This file was generated from team_policies.stone */

package autosaveworld.zlibs.com.dropbox.core.v2.teampolicies;

import java.io.IOException;
import java.util.Arrays;

import autosaveworld.zlibs.com.dropbox.core.stone.StoneSerializers;
import autosaveworld.zlibs.com.dropbox.core.stone.UnionSerializer;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerationException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerator;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParseException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParser;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonToken;

public enum EmmState {
    // union team_policies.EmmState (team_policies.stone)
    /**
     * Emm token is disabled
     */
    DISABLED,
    /**
     * Emm token is optional
     */
    OPTIONAL,
    /**
     * Emm token is required
     */
    REQUIRED,
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
    static class Serializer extends UnionSerializer<EmmState> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(EmmState value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case DISABLED: {
                    g.writeString("disabled");
                    break;
                }
                case OPTIONAL: {
                    g.writeString("optional");
                    break;
                }
                case REQUIRED: {
                    g.writeString("required");
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public EmmState deserialize(JsonParser p) throws IOException, JsonParseException {
            EmmState value;
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
            else if ("disabled".equals(tag)) {
                value = EmmState.DISABLED;
            }
            else if ("optional".equals(tag)) {
                value = EmmState.OPTIONAL;
            }
            else if ("required".equals(tag)) {
                value = EmmState.REQUIRED;
            }
            else {
                value = EmmState.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
