package com.aptech.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tblComment", schema = "dbo", catalog = "MangaOnline")
@IdClass(TblCommentEntityPK.class)
public class TblCommentEntity {
    private String userId;
    private String comicId;
    private Timestamp time;
    private String comment;

    @Id
    @Column(name = "UserID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "ComicID")
    public String getComicId() {
        return comicId;
    }

    public void setComicId(String comicId) {
        this.comicId = comicId;
    }

    @Basic
    @Column(name = "Time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "Comment")
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

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (comicId != null ? !comicId.equals(that.comicId) : that.comicId != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (comicId != null ? comicId.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
