/* DO NOT EDIT */
/* This file was generated from sharing_folders.stone */

package autosaveworld.zlibs.com.dropbox.core.v2.sharing;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import autosaveworld.zlibs.com.dropbox.core.stone.StoneSerializers;
import autosaveworld.zlibs.com.dropbox.core.stone.StructSerializer;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerationException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonGenerator;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParseException;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonParser;
import autosaveworld.zlibs.com.fasterxml.jackson.core.JsonToken;

class ListFoldersArgs {
    // struct sharing.ListFoldersArgs (sharing_folders.stone)

    protected final long limit;
    protected final List<FolderAction> actions;

    /**
     * Use {@link newBuilder} to create instances of this class without
     * specifying values for all optional fields.
     *
     * @param limit  The maximum number of results to return per request. Must
     *     be greater than or equal to 1 and be less than or equal to 1000.
     * @param actions  This is a list indicating whether each returned folder
     *     data entry will include a boolean field {@link
     *     FolderPermission#getAllow} that describes whether the current user
     *     can perform the `FolderAction` on the folder. Must not contain a
     *     {@code null} item.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public ListFoldersArgs(long limit, List<FolderAction> actions) {
        if (limit < 1L) {
            throw new IllegalArgumentException("Number 'limit' is smaller than 1L");
        }
        if (limit > 1000L) {
            throw new IllegalArgumentException("Number 'limit' is larger than 1000L");
        }
        this.limit = limit;
        if (actions != null) {
            for (FolderAction x : actions) {
                if (x == null) {
                    throw new IllegalArgumentException("An item in list 'actions' is null");
                }
            }
        }
        this.actions = actions;
    }

    /**
     * None
     *
     * <p> The default values for unset fields will be used. </p>
     */
    public ListFoldersArgs() {
        this(1000L, null);
    }

    /**
     * The maximum number of results to return per request.
     *
     * @return value for this field, or {@code null} if not present. Defaults to
     *     1000L.
     */
    public long getLimit() {
        return limit;
    }

    /**
     * This is a list indicating whether each returned folder data entry will
     * include a boolean field {@link FolderPermission#getAllow} that describes
     * whether the current user can perform the `FolderAction` on the folder.
     *
     * @return value for this field, or {@code null} if not present.
     */
    public List<FolderAction> getActions() {
        return actions;
    }

    /**
     * Returns a new builder for creating an instance of this class.
     *
     * @return builder for this class.
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Builder for {@link ListFoldersArgs}.
     */
    public static class Builder {

        protected long limit;
        protected List<FolderAction> actions;

        protected Builder() {
            this.limit = 1000L;
            this.actions = null;
        }

        /**
         * Set value for optional field.
         *
         * <p> If left unset or set to {@code null}, defaults to {@code 1000L}.
         * </p>
         *
         * @param limit  The maximum number of results to return per request.
         *     Must be greater than or equal to 1 and be less than or equal to
         *     1000. Defaults to {@code 1000L} when set to {@code null}.
         *
         * @return this builder
         *
         * @throws IllegalArgumentException  If any argument does not meet its
         *     preconditions.
         */
        public Builder withLimit(Long limit) {
            if (limit < 1L) {
                throw new IllegalArgumentException("Number 'limit' is smaller than 1L");
            }
            if (limit > 1000L) {
                throw new IllegalArgumentException("Number 'limit' is larger than 1000L");
            }
            if (limit != null) {
                this.limit = limit;
            }
            else {
                this.limit = 1000L;
            }
            return this;
        }

        /**
         * Set value for optional field.
         *
         * @param actions  This is a list indicating whether each returned
         *     folder data entry will include a boolean field {@link
         *     FolderPermission#getAllow} that describes whether the current
         *     user can perform the `FolderAction` on the folder. Must not
         *     contain a {@code null} item.
         *
         * @return this builder
         *
         * @throws IllegalArgumentException  If any argument does not meet its
         *     preconditions.
         */
        public Builder withActions(List<FolderAction> actions) {
            if (actions != null) {
                for (FolderAction x : actions) {
                    if (x == null) {
                        throw new IllegalArgumentException("An item in list 'actions' is null");
                    }
                }
            }
            this.actions = actions;
            return this;
        }

        /**
         * Builds an instance of {@link ListFoldersArgs} configured with this
         * builder's values
         *
         * @return new instance of {@link ListFoldersArgs}
         */
        public ListFoldersArgs build() {
            return new ListFoldersArgs(limit, actions);
        }
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            limit,
            actions
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            ListFoldersArgs other = (ListFoldersArgs) obj;
            return (this.limit == other.limit)
                && ((this.actions == other.actions) || (this.actions != null && this.actions.equals(other.actions)))
                ;
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
    static class Serializer extends StructSerializer<ListFoldersArgs> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(ListFoldersArgs value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("limit");
            StoneSerializers.uInt32().serialize(value.limit, g);
            if (value.actions != null) {
                g.writeFieldName("actions");
                StoneSerializers.nullable(StoneSerializers.list(FolderAction.Serializer.INSTANCE)).serialize(value.actions, g);
            }
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public ListFoldersArgs deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            ListFoldersArgs value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                Long f_limit = 1000L;
                List<FolderAction> f_actions = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("limit".equals(field)) {
                        f_limit = StoneSerializers.uInt32().deserialize(p);
                    }
                    else if ("actions".equals(field)) {
                        f_actions = StoneSerializers.nullable(StoneSerializers.list(FolderAction.Serializer.INSTANCE)).deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                value = new ListFoldersArgs(f_limit, f_actions);
            }
            else {
                throw new JsonParseException(p, "No subtype found that matches tag: \"" + tag + "\"");
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
