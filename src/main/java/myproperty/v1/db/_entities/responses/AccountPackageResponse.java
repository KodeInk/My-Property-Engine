/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.db._entities.responses;

/**
 *
 * @author mover 6/18/2017
 */
public class AccountPackageResponse {
    private Integer id;
    private String package_name;

    public AccountPackageResponse() {
    }

    public AccountPackageResponse(Integer id, String package_name) {
        this.id = id;
        this.package_name = package_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{"
                + "id=" + id
                + ", package_name=" + package_name
                + "}";
    }

}
