package entity.domain;

import entity.domain.Clinic;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T14:33:37")
@StaticMetamodel(ClinicService.class)
public class ClinicService_ { 

    public static volatile SingularAttribute<ClinicService, String> image;
    public static volatile ListAttribute<ClinicService, Clinic> clinics;
    public static volatile SingularAttribute<ClinicService, Double> price;
    public static volatile SingularAttribute<ClinicService, String> name;
    public static volatile SingularAttribute<ClinicService, Long> id;

}