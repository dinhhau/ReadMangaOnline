package com.aptech.model;

import javax.persistence.*;

@Entity
@Table(name = "tblRate", schema = "dbo", catalog = "MangaOnline")
@IdClass(TblRateEntityPK.class)
public class TblRateEntity {
    private int userId;
    private int comicId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblRateEntity that = (TblRateEntity) o;

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
