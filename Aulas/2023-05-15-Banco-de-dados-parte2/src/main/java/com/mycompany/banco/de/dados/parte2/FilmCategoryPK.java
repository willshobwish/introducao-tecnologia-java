/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco.de.dados.parte2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author willm
 */
@Embeddable
public class FilmCategoryPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "film_id")
    private short filmId;
    @Basic(optional = false)
    @Column(name = "category_id")
    private short categoryId;

    public FilmCategoryPK() {
    }

    public FilmCategoryPK(short filmId, short categoryId) {
        this.filmId = filmId;
        this.categoryId = categoryId;
    }

    public short getFilmId() {
        return filmId;
    }

    public void setFilmId(short filmId) {
        this.filmId = filmId;
    }

    public short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(short categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) filmId;
        hash += (int) categoryId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilmCategoryPK)) {
            return false;
        }
        FilmCategoryPK other = (FilmCategoryPK) object;
        if (this.filmId != other.filmId) {
            return false;
        }
        if (this.categoryId != other.categoryId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.banco.de.dados.parte2.FilmCategoryPK[ filmId=" + filmId + ", categoryId=" + categoryId + " ]";
    }

}
