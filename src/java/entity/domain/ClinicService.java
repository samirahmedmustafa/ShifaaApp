package entity.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author sawad
 */
@Entity
public class ClinicService implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String name;

    @Basic
    private String image;

    @OneToMany(mappedBy = "clinicService")
    private List<ClinicServicePrice> clinicServicePrices;

    public ClinicService() {
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

    public List<ClinicServicePrice> getClinicServicePrices() {
        if (clinicServicePrices == null) {
            clinicServicePrices = new ArrayList<>();
        }
        return this.clinicServicePrices;
    }

    public void setClinicServicePrices(List<ClinicServicePrice> clinicServicePrices) {
        this.clinicServicePrices = clinicServicePrices;
    }

    public void addClinicServicePrice(ClinicServicePrice clinicServicePrice) {
        getClinicServicePrices().add(clinicServicePrice);
        clinicServicePrice.setClinicService(this);
    }

    public void removeClinicServicePrice(ClinicServicePrice clinicServicePrice) {
        getClinicServicePrices().remove(clinicServicePrice);
        clinicServicePrice.setClinicService(null);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.image);
        hash = 97 * hash + Objects.hashCode(this.clinicServicePrices);
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
        final ClinicService other = (ClinicService) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.clinicServicePrices, other.clinicServicePrices)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name;
    }

}
