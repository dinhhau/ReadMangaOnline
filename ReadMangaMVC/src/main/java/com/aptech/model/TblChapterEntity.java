package com.aptech.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tblChapter", schema = "dbo", catalog = "MangaOnline")
public class TblChapterEntity {
    private String chapterId;
    private Date createDate;
    private String linkImg;

    @Id
    @Column(name = "ChapterID")
    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    @Basic
    @Column(name = "CreateDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "LinkIMG")
    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblChapterEntity that = (TblChapterEntity) o;

        if (chapterId != null ? !chapterId.equals(that.chapterId) : that.chapterId != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (linkImg != null ? !linkImg.equals(that.linkImg) : that.linkImg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = chapterId != null ? chapterId.hashCode() : 0;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (linkImg != null ? linkImg.hashCode() : 0);
        return result;
    }
}
