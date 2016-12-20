/* DO NOT EDIT */
/* This file was generated from team_groups.stone */

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
 * Role of a user in group.
 */
public enum GroupAccessType {
    // union team.GroupAccessType (team_groups.stone)
    /**
     * User is a member of the group, but has no special permissions.
     */
    MEMBER,
    /**
     * User can rename the group, and add/remove members.
     */
    OWNER;

    /**
     * For internal use only.
     */
    static class Serializer extends UnionSerializer<GroupAccessType> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(GroupAccessType value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case MEMBER: {
                    g.writeString("member");
                    break;
                }
                case OWNER: {
                    g.writeString("owner");
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unrecognized tag: " + value);
                }
            }
        }

        @Override
        public GroupAccessType deserialize(JsonParser p) throws IOException, JsonParseException {
            GroupAccessType value;
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
            else if ("member".equals(tag)) {
                value = GroupAccessType.MEMBER;
            }
            else if ("owner".equals(tag)) {
                value = GroupAccessType.OWNER;
            }
            else {
                throw new JsonParseException(p, "Unknown tag: " + tag);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
