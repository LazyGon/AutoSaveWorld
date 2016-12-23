/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.files;

import autosaveworld.zlibs.com.dropbox.core.DbxUploader;
import autosaveworld.zlibs.com.dropbox.core.DbxWrappedException;
import autosaveworld.zlibs.com.dropbox.core.http.HttpRequestor;

/**
 * The {@link DbxUploader} returned by {@link
 * DbxUserFilesRequests#uploadSessionAppendV2(UploadSessionCursor,boolean)}.
 *
 * <p> Use this class to upload data to the server and complete the request.
 * </p>
 *
 * <p> This class should be properly closed after use to prevent resource leaks
 * and allow network connection reuse. Always call {@link #close} when complete
 * (see {@link DbxUploader} for examples). </p>
 */
public class UploadSessionAppendV2Uploader extends DbxUploader<Void, UploadSessionLookupError, UploadSessionLookupErrorException> {

    /**
     * Creates a new instance of this uploader.
     *
     * @param httpUploader  Initiated HTTP upload request
     *
     * @throws NullPointerException  if {@code httpUploader} is {@code null}
     */
    public UploadSessionAppendV2Uploader(HttpRequestor.Uploader httpUploader) {
        super(httpUploader, autosaveworld.zlibs.com.dropbox.core.stone.StoneSerializers.void_(), UploadSessionLookupError.Serializer.INSTANCE);
    }

    protected UploadSessionLookupErrorException newException(DbxWrappedException error) {
        return new UploadSessionLookupErrorException("2/files/upload_session/append_v2", error.getRequestId(), error.getUserMessage(), (UploadSessionLookupError) error.getErrorValue());
    }
}
