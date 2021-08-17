
package ru.nosov;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Continue {

    @SerializedName("continue")
    private String mContinue;
    @SerializedName("sroffset")
    private Long mSroffset;

    public String getContinue() {
        return mContinue;
    }

    public void setContinue(String continue) {
        mContinue = continue;
    }

    public Long getSroffset() {
        return mSroffset;
    }

    public void setSroffset(Long sroffset) {
        mSroffset = sroffset;
    }

}
