package com.aptech.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblComicAuthorEntityPK implements Serializable {
    private int authorId;
    private int comicId;

    @Column(name = "AuthorID", nullable = false)
    @Id
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
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

        TblComicAuthorEntityPK that = (TblComicAuthorEntityPK) o;

        if (authorId != that.authorId) return false;
        if (comicId != that.comicId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorId;
        result = 31 * result + comicId;
        return result;
    }
}
