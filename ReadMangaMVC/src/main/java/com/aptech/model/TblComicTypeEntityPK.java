package com.aptech.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblComicTypeEntityPK implements Serializable {
    private String typeId;
    private String comicId;

    @Column(name = "TypeID")
    @Id
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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

        TblComicTypeEntityPK that = (TblComicTypeEntityPK) o;

        if (typeId != null ? !typeId.equals(that.typeId) : that.typeId != null) return false;
        if (comicId != null ? !comicId.equals(that.comicId) : that.comicId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeId != null ? typeId.hashCode() : 0;
        result = 31 * result + (comicId != null ? comicId.hashCode() : 0);
        return result;
    }
}
