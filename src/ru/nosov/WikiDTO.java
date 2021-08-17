
package ru.nosov;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class WikiDTO {

    @SerializedName("batchcomplete")
    private String mBatchcomplete;
    @SerializedName("continue")
    private Continue mContinue;
    @SerializedName("query")
    private Query mQuery;

    public String getBatchcomplete() {
        return mBatchcomplete;
    }

    public void setBatchcomplete(String batchcomplete) {
        mBatchcomplete = batchcomplete;
    }

    public Continue getContinue() {
        return mContinue;
    }

    public void setContinue(Continue contin) {
        mContinue = contin;
    }

    public Query getQuery() {
        return mQuery;
    }

    public void setQuery(Query query) {
        mQuery = query;
    }

}
