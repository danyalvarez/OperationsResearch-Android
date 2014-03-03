package com.danyalvarez.operationsresearch.classes;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by daniel on 22/02/14.
 */
public class ResultItem implements Parcelable {

    private String titleSection;

    private int idIcon;
    private String description;
    private String result;

    public ResultItem() {
        this.titleSection = "";
        this.idIcon = 0;
        this.description = "";
        this.result = "";
    }

    public ResultItem(String titleSection, int idIcon, String description, String result) {
        this.titleSection = titleSection;
        this.idIcon = idIcon;
        this.description = description;
        this.result = result;
    }

    public ResultItem(int idIcon, String description, String result) {
        this.titleSection = "";
        this.idIcon = idIcon;
        this.description = description;
        this.result = result;
    }

    public String getTitleSection() {
        return titleSection;
    }

    public void setTitleSection(String titleSection) {
        this.titleSection = titleSection;
    }

    public int getIdIcon() {
        return idIcon;
    }

    public void setIdIcon(int idIcon) {
        this.idIcon = idIcon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(titleSection);
        dest.writeInt(idIcon);
        dest.writeString(description);
        dest.writeString(result);
    }


    public static final Parcelable.Creator<ResultItem> CREATOR = new Parcelable.Creator<ResultItem>() {

        public ResultItem createFromParcel(Parcel in) {
            ResultItem resultItem = new ResultItem();
            resultItem.titleSection = in.readString();
            resultItem.idIcon = in.readInt();
            resultItem.description = in.readString();
            resultItem.result = in.readString();
            return resultItem;
        }

        @Override
        public ResultItem[] newArray(int size) {
            return new ResultItem[size];
        }
    };
}
