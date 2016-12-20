/* DO NOT EDIT */
/* This file was generated from files.stone */

package autosaveworld.zlibs.com.dropbox.core.v2.files;

import java.io.IOException;
import java.util.Arrays;

import autosaveworld.zlibs.com.dropbox.core.stone.StoneSerializers;
import autosaveworld.zlibs.com.dropbox.core.stone.UnionSerializer;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerationException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerator;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParseException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParser;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonToken;

public enum ThumbnailFormat {
    // union files.ThumbnailFormat (files.stone)
    JPEG,
    PNG;

    /**
     * For internal use only.
     */
    static class Serializer extends UnionSerializer<ThumbnailFormat> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(ThumbnailFormat value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case JPEG: {
                    g.writeString("jpeg");
                    break;
                }
                case PNG: {
                    g.writeString("png");
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unrecognized tag: " + value);
                }
            }
        }

        @Override
        public ThumbnailFormat deserialize(JsonParser p) throws IOException, JsonParseException {
            ThumbnailFormat value;
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
            else if ("jpeg".equals(tag)) {
                value = ThumbnailFormat.JPEG;
            }
            else if ("png".equals(tag)) {
                value = ThumbnailFormat.PNG;
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
