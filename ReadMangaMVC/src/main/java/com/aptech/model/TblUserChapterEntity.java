package com.aptech.model;

import javax.persistence.*;

@Entity
@Table(name = "tblUser_Chapter", schema = "dbo", catalog = "MangaOnline")
@IdClass(TblUserChapterEntityPK.class)
public class TblUserChapterEntity {
    private String userId;
    private String chapterId;
    private Integer count;

    @Id
    @Column(name = "UserID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "ChapterID")
    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    @Basic
    @Column(name = "Count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblUserChapterEntity that = (TblUserChapterEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (chapterId != null ? !chapterId.equals(that.chapterId) : that.chapterId != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (chapterId != null ? chapterId.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        return result;
    }
}
