package com.aptech.model;

import javax.persistence.*;

@Entity
@Table(name = "tblRate", schema = "dbo", catalog = "MangaOnline")
@IdClass(TblRateEntityPK.class)
public class TblRateEntity {
    private String userId;
    private String comicId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblRateEntity that = (TblRateEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (comicId != null ? !comicId.equals(that.comicId) : that.comicId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (comicId != null ? comicId.hashCode() : 0);
        return result;
    }
}
