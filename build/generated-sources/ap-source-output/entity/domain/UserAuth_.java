package entity.domain;

import entity.domain.GroupAuth;
import entity.domain.Hospital;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-03T00:09:59")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-21T16:08:07")
>>>>>>> f240c93a6a45d7eb88cd0113d6b11de1c79b60ea
@StaticMetamodel(UserAuth.class)
public class UserAuth_ { 

    public static volatile SingularAttribute<UserAuth, String> password;
    public static volatile ListAttribute<UserAuth, GroupAuth> groupAuths;
    public static volatile SingularAttribute<UserAuth, String> name;
    public static volatile SingularAttribute<UserAuth, Long> id;
    public static volatile SingularAttribute<UserAuth, Hospital> hospital;
    public static volatile SingularAttribute<UserAuth, String> email;

}