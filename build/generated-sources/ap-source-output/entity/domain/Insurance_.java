package entity.domain;

import entity.domain.Hospital;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T14:33:37")
@StaticMetamodel(Insurance.class)
public class Insurance_ { 

    public static volatile SingularAttribute<Insurance, String> image;
    public static volatile ListAttribute<Insurance, Hospital> hospitals;
    public static volatile SingularAttribute<Insurance, String> name;
    public static volatile SingularAttribute<Insurance, Long> id;

}