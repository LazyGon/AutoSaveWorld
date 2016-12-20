/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.files;

import autosaveworld.zlibs.com.dropbox.core.DbxException;

/**
 * The request builder returned by {@link DbxUserFilesRequests#searchBuilder}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class SearchBuilder {
    private final DbxUserFilesRequests _client;
    private final SearchArg.Builder _builder;

    /**
     * Creates a new instance of this builder.
     *
     * @param _client  Dropbox namespace-specific client used to issue files
     *     requests.
     * @param _builder  Request argument builder.
     *
     * @return instsance of this builder
     */
    SearchBuilder(DbxUserFilesRequests _client, SearchArg.Builder _builder) {
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
     * <p> If left unset or set to {@code null}, defaults to {@code 0L}. </p>
     *
     * @param start  The starting index within the search results (used for
     *     paging). Defaults to {@code 0L} when set to {@code null}.
     *
     * @return this builder
     */
    public SearchBuilder withStart(Long start) {
        this._builder.withStart(start);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code 100L}. </p>
     *
     * @param maxResults  The maximum number of search results to return. Must
     *     be greater than or equal to 1 and be less than or equal to 1000.
     *     Defaults to {@code 100L} when set to {@code null}.
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public SearchBuilder withMaxResults(Long maxResults) {
        this._builder.withMaxResults(maxResults);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code
     * SearchMode.FILENAME}. </p>
     *
     * @param mode  The search mode (filename, filename_and_content, or
     *     deleted_filename). Note that searching file content is only available
     *     for Dropbox Business accounts. Must not be {@code null}. Defaults to
     *     {@code SearchMode.FILENAME} when set to {@code null}.
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public SearchBuilder withMode(SearchMode mode) {
        this._builder.withMode(mode);
        return this;
    }

    /**
     * Issues the request.
     */
    public SearchResult start() throws SearchErrorException, DbxException {
        SearchArg arg_ = this._builder.build();
        return _client.search(arg_);
    }
}
