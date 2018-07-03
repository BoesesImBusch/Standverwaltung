package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name="StateByEmploymentLaw")
public class StateByEmploymentLaw
{
    //-------------------------------------------------------------------------
    //  Vars
    //-------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;


    //-------------------------------------------------------------------------
    //  Constructor(s)
    //-------------------------------------------------------------------------
    public StateByEmploymentLaw() {

    }

    public StateByEmploymentLaw(String description) {
        this.description = description;
    }

    public StateByEmploymentLaw(int id, String description) {
        this.id = id;
        this.description = description;
    }


    //-------------------------------------------------------------------------
    //  Get / Set
    //-------------------------------------------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    //-------------------------------------------------------------------------
    //  toString()
    //-------------------------------------------------------------------------
    @Override
    public String toString() {
        return "entities.ProfessionalStanding{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
