/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Willian
 */
@Entity
@Table(name = "Titles")
public class Titles implements Serializable {

    @Id
    @JoinColumn(name = "ISBN", nullable = false)
    private String ISBN;

    @Column(name = "Title", length = 100)
    private String Title;

    @Column(name = "EditionNumber", length = 100)
    private int EditionNumber;

    @Column(name = "Copyright", length = 100)
    private int Copyright;
}
