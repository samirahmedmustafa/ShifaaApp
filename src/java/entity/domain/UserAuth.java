/**
 * This file was generated by the Jeddict
 */
package entity.domain;

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
public class UserAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String username;

    @Basic
    private String password;

    @Basic
    private String email;

    @ManyToOne
    private Hospital hospital;

    @ManyToMany
    private List<GroupAuth> groupAuths;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Hospital getHospital() {
        return this.hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public List<GroupAuth> getGroupAuths() {
        if (groupAuths == null) {
            groupAuths = new ArrayList<>();
        }
        return this.groupAuths;
    }

    public void setGroupAuths(List<GroupAuth> groupAuths) {
        this.groupAuths = groupAuths;
    }

    public void addGroupAuth(GroupAuth groupAuth) {
        getGroupAuths().add(groupAuth);
        groupAuth.getUserAuths().add(this);
    }

    public void removeGroupAuth(GroupAuth groupAuth) {
        getGroupAuths().remove(groupAuth);
        groupAuth.getUserAuths().remove(this);
    }

}