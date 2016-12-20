/* DO NOT EDIT */
/* This file was generated from team_linked_apps.stone */

package autosaveworld.zlibs.com.dropbox.core.v2.team;

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

/**
 * Information returned by {@link
 * DbxTeamTeamRequests#linkedAppsListTeamLinkedApps(String)}.
 */
public class ListTeamAppsResult {
    // struct team.ListTeamAppsResult (team_linked_apps.stone)

    protected final List<MemberLinkedApps> apps;
    protected final boolean hasMore;
    protected final String cursor;

    /**
     * Information returned by {@link
     * DbxTeamTeamRequests#linkedAppsListTeamLinkedApps(String)}.
     *
     * @param apps  The linked applications of each member of the team. Must not
     *     contain a {@code null} item and not be {@code null}.
     * @param hasMore  If true, then there are more apps available. Pass the
     *     cursor to {@link
     *     DbxTeamTeamRequests#linkedAppsListTeamLinkedApps(String)} to retrieve
     *     the rest.
     * @param cursor  Pass the cursor into {@link
     *     DbxTeamTeamRequests#linkedAppsListTeamLinkedApps(String)} to receive
     *     the next sub list of team's applications.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public ListTeamAppsResult(List<MemberLinkedApps> apps, boolean hasMore, String cursor) {
        if (apps == null) {
            throw new IllegalArgumentException("Required value for 'apps' is null");
        }
        for (MemberLinkedApps x : apps) {
            if (x == null) {
                throw new IllegalArgumentException("An item in list 'apps' is null");
            }
        }
        this.apps = apps;
        this.hasMore = hasMore;
        this.cursor = cursor;
    }

    /**
     * Information returned by {@link
     * DbxTeamTeamRequests#linkedAppsListTeamLinkedApps(String)}.
     *
     * <p> The default values for unset fields will be used. </p>
     *
     * @param apps  The linked applications of each member of the team. Must not
     *     contain a {@code null} item and not be {@code null}.
     * @param hasMore  If true, then there are more apps available. Pass the
     *     cursor to {@link
     *     DbxTeamTeamRequests#linkedAppsListTeamLinkedApps(String)} to retrieve
     *     the rest.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public ListTeamAppsResult(List<MemberLinkedApps> apps, boolean hasMore) {
        this(apps, hasMore, null);
    }

    /**
     * The linked applications of each member of the team
     *
     * @return value for this field, never {@code null}.
     */
    public List<MemberLinkedApps> getApps() {
        return apps;
    }

    /**
     * If true, then there are more apps available. Pass the cursor to {@link
     * DbxTeamTeamRequests#linkedAppsListTeamLinkedApps(String)} to retrieve the
     * rest.
     *
     * @return value for this field.
     */
    public boolean getHasMore() {
        return hasMore;
    }

    /**
     * Pass the cursor into {@link
     * DbxTeamTeamRequests#linkedAppsListTeamLinkedApps(String)} to receive the
     * next sub list of team's applications.
     *
     * @return value for this field, or {@code null} if not present.
     */
    public String getCursor() {
        return cursor;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            apps,
            hasMore,
            cursor
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
            ListTeamAppsResult other = (ListTeamAppsResult) obj;
            return ((this.apps == other.apps) || (this.apps.equals(other.apps)))
                && (this.hasMore == other.hasMore)
                && ((this.cursor == other.cursor) || (this.cursor != null && this.cursor.equals(other.cursor)))
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
    static class Serializer extends StructSerializer<ListTeamAppsResult> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(ListTeamAppsResult value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("apps");
            StoneSerializers.list(MemberLinkedApps.Serializer.INSTANCE).serialize(value.apps, g);
            g.writeFieldName("has_more");
            StoneSerializers.boolean_().serialize(value.hasMore, g);
            if (value.cursor != null) {
                g.writeFieldName("cursor");
                StoneSerializers.nullable(StoneSerializers.string()).serialize(value.cursor, g);
            }
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public ListTeamAppsResult deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            ListTeamAppsResult value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                List<MemberLinkedApps> f_apps = null;
                Boolean f_hasMore = null;
                String f_cursor = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("apps".equals(field)) {
                        f_apps = StoneSerializers.list(MemberLinkedApps.Serializer.INSTANCE).deserialize(p);
                    }
                    else if ("has_more".equals(field)) {
                        f_hasMore = StoneSerializers.boolean_().deserialize(p);
                    }
                    else if ("cursor".equals(field)) {
                        f_cursor = StoneSerializers.nullable(StoneSerializers.string()).deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_apps == null) {
                    throw new JsonParseException(p, "Required field \"apps\" missing.");
                }
                if (f_hasMore == null) {
                    throw new JsonParseException(p, "Required field \"has_more\" missing.");
                }
                value = new ListTeamAppsResult(f_apps, f_hasMore, f_cursor);
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
