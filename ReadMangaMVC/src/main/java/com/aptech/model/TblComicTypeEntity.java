package com.aptech.model;

import javax.persistence.*;

@Entity
@Table(name = "tblComic_Type", schema = "dbo", catalog = "MangaOnline")
@IdClass(TblComicTypeEntityPK.class)
public class TblComicTypeEntity {
    private int typeId;
    private int comicId;
    private String code;

    @Id
    @Column(name = "TypeID", nullable = false)
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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

        TblComicTypeEntity that = (TblComicTypeEntity) o;

        if (typeId != that.typeId) return false;
        if (comicId != that.comicId) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeId;
        result = 31 * result + comicId;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
