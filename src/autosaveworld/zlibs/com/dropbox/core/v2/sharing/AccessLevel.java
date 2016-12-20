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
 * Defines the access levels for collaborators.
 */
public enum AccessLevel {
    // union sharing.AccessLevel (sharing_folders.stone)
    /**
     * The collaborator is the owner of the shared folder. Owners can view and
     * edit the shared folder as well as set the folder's policies using {@link
     * DbxUserSharingRequests#updateFolderPolicy(String)}.
     */
    OWNER,
    /**
     * The collaborator can both view and edit the shared folder.
     */
    EDITOR,
    /**
     * The collaborator can only view the shared folder.
     */
    VIEWER,
    /**
     * The collaborator can only view the shared folder and does not have any
     * access to comments.
     */
    VIEWER_NO_COMMENT,
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
    static class Serializer extends UnionSerializer<AccessLevel> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(AccessLevel value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case OWNER: {
                    g.writeString("owner");
                    break;
                }
                case EDITOR: {
                    g.writeString("editor");
                    break;
                }
                case VIEWER: {
                    g.writeString("viewer");
                    break;
                }
                case VIEWER_NO_COMMENT: {
                    g.writeString("viewer_no_comment");
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public AccessLevel deserialize(JsonParser p) throws IOException, JsonParseException {
            AccessLevel value;
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
                value = AccessLevel.OWNER;
            }
            else if ("editor".equals(tag)) {
                value = AccessLevel.EDITOR;
            }
            else if ("viewer".equals(tag)) {
                value = AccessLevel.VIEWER;
            }
            else if ("viewer_no_comment".equals(tag)) {
                value = AccessLevel.VIEWER_NO_COMMENT;
            }
            else {
                value = AccessLevel.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
