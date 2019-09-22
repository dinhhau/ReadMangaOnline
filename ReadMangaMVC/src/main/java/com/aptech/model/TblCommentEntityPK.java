package com.aptech.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblCommentEntityPK implements Serializable {
    private int userId;
    private int comicId;

    @Column(name = "UserID", nullable = false)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "ComicID", nullable = false)
    @Id
    public int getComicId() {
        return comicId;
    }

    public void setComicId(int comicId) {
        this.comicId = comicId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblCommentEntityPK that = (TblCommentEntityPK) o;

        if (userId != that.userId) return false;
        if (comicId != that.comicId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + comicId;
        return result;
    }
}
