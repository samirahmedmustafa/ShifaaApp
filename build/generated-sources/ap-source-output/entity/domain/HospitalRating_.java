package entity.domain;

import entity.domain.Guest;
import entity.domain.Hospital;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-12T17:54:41")
@StaticMetamodel(HospitalRating.class)
public class HospitalRating_ { 

    public static volatile SingularAttribute<HospitalRating, String> rating;
    public static volatile SingularAttribute<HospitalRating, String> ratingComment;
    public static volatile SingularAttribute<HospitalRating, Guest> guest;
    public static volatile SingularAttribute<HospitalRating, Long> id;
    public static volatile SingularAttribute<HospitalRating, Hospital> hospital;

}