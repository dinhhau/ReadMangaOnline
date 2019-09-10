package com.aptech.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblComicAuthorEntityPK implements Serializable {
    private String authorId;
    private String comicId;

    @Column(name = "AuthorID")
    @Id
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    @Column(name = "ComicID")
    @Id
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

        TblComicAuthorEntityPK that = (TblComicAuthorEntityPK) o;

        if (authorId != null ? !authorId.equals(that.authorId) : that.authorId != null) return false;
        if (comicId != null ? !comicId.equals(that.comicId) : that.comicId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorId != null ? authorId.hashCode() : 0;
        result = 31 * result + (comicId != null ? comicId.hashCode() : 0);
        return result;
    }
}
