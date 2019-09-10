package com.aptech.model;

import javax.persistence.*;

@Entity
@Table(name = "tblComic_Author", schema = "dbo", catalog = "MangaOnline")
@IdClass(TblComicAuthorEntityPK.class)
public class TblComicAuthorEntity {
    private String authorId;
    private String comicId;
    private String code;

    @Id
    @Column(name = "AuthorID")
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
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
    @Column(name = "Code")
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

        if (authorId != null ? !authorId.equals(that.authorId) : that.authorId != null) return false;
        if (comicId != null ? !comicId.equals(that.comicId) : that.comicId != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorId != null ? authorId.hashCode() : 0;
        result = 31 * result + (comicId != null ? comicId.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
