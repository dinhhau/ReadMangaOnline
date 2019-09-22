package com.aptech.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tblAuthor", schema = "dbo", catalog = "MangaOnline")
public class TblAuthorEntity {
    private int authorId;
    private String name;
    private String gender;
    private Date birthday;

    @Id
    @Column(name = "AuthorID", nullable = false)
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Gender", nullable = true, length = 10)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "Birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblAuthorEntity that = (TblAuthorEntity) o;

        if (authorId != that.authorId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }
}
