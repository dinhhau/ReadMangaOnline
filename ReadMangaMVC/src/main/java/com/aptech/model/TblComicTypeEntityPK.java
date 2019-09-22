package com.aptech.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TblComicTypeEntityPK implements Serializable {
    private int typeId;
    private int comicId;

    @Column(name = "TypeID", nullable = false)
    @Id
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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

        TblComicTypeEntityPK that = (TblComicTypeEntityPK) o;

        if (typeId != that.typeId) return false;
        if (comicId != that.comicId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeId;
        result = 31 * result + comicId;
        return result;
    }
}
