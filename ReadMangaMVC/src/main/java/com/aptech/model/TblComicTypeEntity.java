package com.aptech.model;

import javax.persistence.*;

@Entity
@Table(name = "tblComic_Type", schema = "dbo", catalog = "MangaOnline")
@IdClass(TblComicTypeEntityPK.class)
public class TblComicTypeEntity {
    private String typeId;
    private String comicId;
    private String code;

    @Id
    @Column(name = "TypeID")
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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

        TblComicTypeEntity that = (TblComicTypeEntity) o;

        if (typeId != null ? !typeId.equals(that.typeId) : that.typeId != null) return false;
        if (comicId != null ? !comicId.equals(that.comicId) : that.comicId != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeId != null ? typeId.hashCode() : 0;
        result = 31 * result + (comicId != null ? comicId.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
