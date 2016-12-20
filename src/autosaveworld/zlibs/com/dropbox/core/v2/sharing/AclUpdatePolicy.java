/* DO NOT EDIT */
/* This file was generated from sharing_folders.stone */

package autosaveworld.zlibs.com.dropbox.core.v2.sharing;

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
 * Policy governing who can change a shared folder's access control list (ACL).
 * In other words, who can add, remove, or change the privileges of members.
 */
public enum AclUpdatePolicy {
    // union sharing.AclUpdatePolicy (sharing_folders.stone)
    /**
     * Only the owner can update the ACL.
     */
    OWNER,
    /**
     * Any editor can update the ACL. This may be further restricted to editors
     * on the same team.
     */
    EDITORS,
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
    static class Serializer extends UnionSerializer<AclUpdatePolicy> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(AclUpdatePolicy value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case OWNER: {
                    g.writeString("owner");
                    break;
                }
                case EDITORS: {
                    g.writeString("editors");
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public AclUpdatePolicy deserialize(JsonParser p) throws IOException, JsonParseException {
            AclUpdatePolicy value;
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
            else if ("owner".equals(tag)) {
                value = AclUpdatePolicy.OWNER;
            }
            else if ("editors".equals(tag)) {
                value = AclUpdatePolicy.EDITORS;
            }
            else {
                value = AclUpdatePolicy.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
