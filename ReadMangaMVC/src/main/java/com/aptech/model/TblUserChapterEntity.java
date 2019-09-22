package com.aptech.model;

import javax.persistence.*;

@Entity
@Table(name = "tblUser_Chapter", schema = "dbo", catalog = "MangaOnline")
@IdClass(TblUserChapterEntityPK.class)
public class TblUserChapterEntity {
    private int userId;
    private int chapterId;
    private Integer count;

    @Id
    @Column(name = "UserID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "ChapterID", nullable = false)
    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    @Basic
    @Column(name = "Count", nullable = true)
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

        if (userId != that.userId) return false;
        if (chapterId != that.chapterId) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + chapterId;
        result = 31 * result + (count != null ? count.hashCode() : 0);
        return result;
    }
}
