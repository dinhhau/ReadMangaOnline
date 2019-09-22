package com.aptech.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tblComment", schema = "dbo", catalog = "MangaOnline")
@IdClass(TblCommentEntityPK.class)
public class TblCommentEntity {
    private int userId;
    private int comicId;
    private Timestamp time;
    private String comment;

    @Id
    @Column(name = "UserID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "ComicID", nullable = false)
    public int getComicId() {
        return comicId;
    }

    public void setComicId(int comicId) {
        this.comicId = comicId;
    }

    @Basic
    @Column(name = "Time", nullable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "Comment", nullable = true, length = 1)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblCommentEntity that = (TblCommentEntity) o;

        if (userId != that.userId) return false;
        if (comicId != that.comicId) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + comicId;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
