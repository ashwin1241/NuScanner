package com.example.nuscan;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Card_sub_item implements Serializable {

private String title;
private String image;
private long parent_id;
private String imgname;
@PrimaryKey(autoGenerate = false)
@NonNull
private String pdfname;

    public Card_sub_item(String title, String image, long parent_id, String imgname,@NonNull String pdfname) {
        this.title = title;
        this.image = image;
        this.parent_id = parent_id;
        this.imgname = imgname;
        this.pdfname = pdfname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    public String getPdfname() {
        return pdfname;
    }

    public void setPdfname(@NonNull String pdfname) {
        this.pdfname = pdfname;
    }

    public long getParent_id() {
        return parent_id;
    }

    public void setParent_id(long parent_id) {
        this.parent_id = parent_id;
    }
}
