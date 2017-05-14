/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Manny
 */
@Entity
@Table(name = "types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Types.findAll", query = "SELECT t FROM Types t")
    , @NamedQuery(name = "Types.findById", query = "SELECT t FROM Types t WHERE t.id = :id")
    , @NamedQuery(name = "Types.findByType", query = "SELECT t FROM Types t WHERE t.type = :type")
    , @NamedQuery(name = "Types.findByDescription", query = "SELECT t FROM Types t WHERE t.description = :description")
    , @NamedQuery(name = "Types.findByStatus", query = "SELECT t FROM Types t WHERE t.status = :status")
    , @NamedQuery(name = "Types.findByDateAdded", query = "SELECT t FROM Types t WHERE t.dateAdded = :dateAdded")})
public class Types implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @Size(max = 45)
    @Column(name = "description")
    private String description;
    @Size(max = 8)
    @Column(name = "status")
    private String status;
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    @ManyToOne
    private Person authorId;
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ManyToOne
    private Categories categoryId;

    public Types() {
    }

    public Types(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Person getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Person authorId) {
        this.authorId = authorId;
    }

    public Categories getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Categories categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Types)) {
            return false;
        }
        Types other = (Types) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproperty._entities.Types[ id=" + id + " ]";
    }

}
