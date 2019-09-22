package com.aptech.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblUserChapterEntityPK implements Serializable {
    private int userId;
    private int chapterId;

    @Column(name = "UserID", nullable = false)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "ChapterID", nullable = false)
    @Id
    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblUserChapterEntityPK that = (TblUserChapterEntityPK) o;

        if (userId != that.userId) return false;
        if (chapterId != that.chapterId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + chapterId;
        return result;
    }
}
