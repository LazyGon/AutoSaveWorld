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

/**
 * This class is an open tagged union.  Tagged unions instances are always
 * associated to a specific tag.  This means only one of the {@code isAbc()}
 * methods will return {@code true}. You can use {@link #tag()} to determine the
 * tag associated with this instance.
 *
 * <p> Open unions may be extended in the future with additional tags. If a new
 * tag is introduced that this SDK does not recognized, the {@link #OTHER} value
 * will be used. </p>
 */
public final class DeleteError {
    // union files.DeleteError (files.stone)

    /**
     * Discriminating tag type for {@link DeleteError}.
     */
    public enum Tag {
        PATH_LOOKUP, // LookupError
        PATH_WRITE, // WriteError
        /**
         * Catch-all used for unknown tag values returned by the Dropbox
         * servers.
         *
         * <p> Receiving a catch-all value typically indicates this SDK version
         * is not up to date. Consider updating your SDK version to handle the
         * new tags. </p>
         */
        OTHER; // *catch_all
    }

    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    public static final DeleteError OTHER = new DeleteError(Tag.OTHER, null, null);

    private final Tag _tag;
    private final LookupError pathLookupValue;
    private final WriteError pathWriteValue;

    /**
     *
     * @param pathLookupValue  Must not be {@code null}.
     * @param pathWriteValue  Must not be {@code null}.
     * @param _tag  Discriminating tag for this instance.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    private DeleteError(Tag _tag, LookupError pathLookupValue, WriteError pathWriteValue) {
        this._tag = _tag;
        this.pathLookupValue = pathLookupValue;
        this.pathWriteValue = pathWriteValue;
    }

    /**
     * Returns the tag for this instance.
     *
     * <p> This class is a tagged union.  Tagged unions instances are always
     * associated to a specific tag.  This means only one of the {@code isXyz()}
     * methods will return {@code true}. Callers are recommended to use the tag
     * value in a {@code switch} statement to properly handle the different
     * values for this {@code DeleteError}. </p>
     *
     * <p> If a tag returned by the server is unrecognized by this SDK, the
     * {@link Tag#OTHER} value will be used. </p>
     *
     * @return the tag for this instance.
     */
    public Tag tag() {
        return _tag;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#PATH_LOOKUP}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#PATH_LOOKUP}, {@code false} otherwise.
     */
    public boolean isPathLookup() {
        return this._tag == Tag.PATH_LOOKUP;
    }

    /**
     * Returns an instance of {@code DeleteError} that has its tag set to {@link
     * Tag#PATH_LOOKUP}.
     *
     * <p> None </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code DeleteError} with its tag set to {@link
     *     Tag#PATH_LOOKUP}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static DeleteError pathLookup(LookupError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new DeleteError(Tag.PATH_LOOKUP, value, null);
    }

    /**
     * This instance must be tagged as {@link Tag#PATH_LOOKUP}.
     *
     * @return The {@link LookupError} value associated with this instance if
     *     {@link #isPathLookup} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isPathLookup} is {@code false}.
     */
    public LookupError getPathLookupValue() {
        if (this._tag != Tag.PATH_LOOKUP) {
            throw new IllegalStateException("Invalid tag: required Tag.PATH_LOOKUP, but was Tag." + this._tag.name());
        }
        return pathLookupValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#PATH_WRITE},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#PATH_WRITE}, {@code false} otherwise.
     */
    public boolean isPathWrite() {
        return this._tag == Tag.PATH_WRITE;
    }

    /**
     * Returns an instance of {@code DeleteError} that has its tag set to {@link
     * Tag#PATH_WRITE}.
     *
     * <p> None </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code DeleteError} with its tag set to {@link
     *     Tag#PATH_WRITE}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static DeleteError pathWrite(WriteError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new DeleteError(Tag.PATH_WRITE, null, value);
    }

    /**
     * This instance must be tagged as {@link Tag#PATH_WRITE}.
     *
     * @return The {@link WriteError} value associated with this instance if
     *     {@link #isPathWrite} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isPathWrite} is {@code false}.
     */
    public WriteError getPathWriteValue() {
        if (this._tag != Tag.PATH_WRITE) {
            throw new IllegalStateException("Invalid tag: required Tag.PATH_WRITE, but was Tag." + this._tag.name());
        }
        return pathWriteValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#OTHER},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#OTHER},
     *     {@code false} otherwise.
     */
    public boolean isOther() {
        return this._tag == Tag.OTHER;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            _tag,
            pathLookupValue,
            pathWriteValue
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else if (obj instanceof DeleteError) {
            DeleteError other = (DeleteError) obj;
            if (this._tag != other._tag) {
                return false;
            }
            switch (_tag) {
                case PATH_LOOKUP:
                    return (this.pathLookupValue == other.pathLookupValue) || (this.pathLookupValue.equals(other.pathLookupValue));
                case PATH_WRITE:
                    return (this.pathWriteValue == other.pathWriteValue) || (this.pathWriteValue.equals(other.pathWriteValue));
                case OTHER:
                    return true;
                default:
                    return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static class Serializer extends UnionSerializer<DeleteError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(DeleteError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value.tag()) {
                case PATH_LOOKUP: {
                    g.writeStartObject();
                    writeTag("path_lookup", g);
                    g.writeFieldName("path_lookup");
                    LookupError.Serializer.INSTANCE.serialize(value.pathLookupValue, g);
                    g.writeEndObject();
                    break;
                }
                case PATH_WRITE: {
                    g.writeStartObject();
                    writeTag("path_write", g);
                    g.writeFieldName("path_write");
                    WriteError.Serializer.INSTANCE.serialize(value.pathWriteValue, g);
                    g.writeEndObject();
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public DeleteError deserialize(JsonParser p) throws IOException, JsonParseException {
            DeleteError value;
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
            else if ("path_lookup".equals(tag)) {
                LookupError fieldValue = null;
                expectField("path_lookup", p);
                fieldValue = LookupError.Serializer.INSTANCE.deserialize(p);
                value = DeleteError.pathLookup(fieldValue);
            }
            else if ("path_write".equals(tag)) {
                WriteError fieldValue = null;
                expectField("path_write", p);
                fieldValue = WriteError.Serializer.INSTANCE.deserialize(p);
                value = DeleteError.pathWrite(fieldValue);
            }
            else {
                value = DeleteError.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
