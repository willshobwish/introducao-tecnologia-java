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
public class FilmActorPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "actor_id")
    private short actorId;
    @Basic(optional = false)
    @Column(name = "film_id")
    private short filmId;

    public FilmActorPK() {
    }

    public FilmActorPK(short actorId, short filmId) {
        this.actorId = actorId;
        this.filmId = filmId;
    }

    public short getActorId() {
        return actorId;
    }

    public void setActorId(short actorId) {
        this.actorId = actorId;
    }

    public short getFilmId() {
        return filmId;
    }

    public void setFilmId(short filmId) {
        this.filmId = filmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) actorId;
        hash += (int) filmId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilmActorPK)) {
            return false;
        }
        FilmActorPK other = (FilmActorPK) object;
        if (this.actorId != other.actorId) {
            return false;
        }
        if (this.filmId != other.filmId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.banco.de.dados.parte2.FilmActorPK[ actorId=" + actorId + ", filmId=" + filmId + " ]";
    }

}
