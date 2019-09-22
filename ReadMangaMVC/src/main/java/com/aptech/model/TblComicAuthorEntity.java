package com.aptech.model;

import javax.persistence.*;

@Entity
@Table(name = "tblComic_Author", schema = "dbo", catalog = "MangaOnline")
@IdClass(TblComicAuthorEntityPK.class)
public class TblComicAuthorEntity {
    private int authorId;
    private int comicId;
    private String code;

    @Id
    @Column(name = "AuthorID", nullable = false)
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
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
    @Column(name = "Code", nullable = true, length = 1)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblComicAuthorEntity that = (TblComicAuthorEntity) o;

        if (authorId != that.authorId) return false;
        if (comicId != that.comicId) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorId;
        result = 31 * result + comicId;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
