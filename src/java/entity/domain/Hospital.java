/**
 * This file was generated by the Jeddict
 */
package entity.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author sawad
 */
@Entity
public class Hospital implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String name;

    @Basic
    private String image;

    @Basic
    private String phoneNo;

    @Basic
    private String location;

    @Basic
    private String email;

    @Basic
    private String locationMap;

    @Basic
    private String workingDaysHours;

    @ManyToOne
    private Area area;

    @ManyToMany
    private List<Clinic> clinics;

    @ManyToMany(mappedBy = "hospitals")
    private List<Insurance> insurances;

    public Hospital() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocationMap() {
        return this.locationMap;
    }

    public void setLocationMap(String locationMap) {
        this.locationMap = locationMap;
    }

    public String getWorkingDaysHours() {
        return this.workingDaysHours;
    }

    public void setWorkingDaysHours(String workingDaysHours) {
        this.workingDaysHours = workingDaysHours;
    }

    public Area getArea() {
        return this.area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Clinic> getClinics() {
        if (clinics == null) {
            clinics = new ArrayList<>();
        }
        return this.clinics;
    }

    public void setClinics(List<Clinic> clinics) {
        this.clinics = clinics;
    }

    public void addClinic(Clinic clinic) {
        getClinics().add(clinic);
        clinic.getHospitals().add(this);
    }

    public void removeClinic(Clinic clinic) {
        getClinics().remove(clinic);
        clinic.getHospitals().remove(this);
    }

    public List<Insurance> getInsurances() {
        if (insurances == null) {
            insurances = new ArrayList<>();
        }
        return this.insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

    public void addInsurance(Insurance insurance) {
        getInsurances().add(insurance);
    }

    public void removeInsurance(Insurance insurance) {
        getInsurances().remove(insurance);
    }

    @Override
    public String toString() {
        return "Hospital{" + "name=" + name + ", area=" + area + '}';
    }

}