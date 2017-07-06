/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._controller.entities;

import java.util.Objects;

/**
 *
 * @author Manny
 */
public class _property_size {
    private Integer id;
    private Integer property_id;
    private String size;
    private String unitMeasure;

    public _property_size() {
    }

    public _property_size(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProperty_id() {
        return property_id;
    }

    public void setProperty_id(Integer property_id) {
        this.property_id = property_id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(String unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.property_id);
        hash = 59 * hash + Objects.hashCode(this.size);
        hash = 59 * hash + Objects.hashCode(this.unitMeasure);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final _property_size other = (_property_size) obj;
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        if (!Objects.equals(this.unitMeasure, other.unitMeasure)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.property_id, other.property_id);
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{"
                + "id=" + id
                + ", property_id=" + property_id
                + ", size=" + size
                + ", unitMeasure=" + unitMeasure
                + "}";
    }

}
