// Generated with g9.

package com.projet.tshirt.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="tshirt")
public class Tshirt implements Serializable {


    @Id
    @Column(unique=true, nullable=false, precision=10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDateTime date;
    @Column(length=255)
    private String marque; 
    @Column(length=255)
    private String modele;
    @Column(nullable=false, precision=8, scale=8)
    private float prix;

    /** Default constructor. */
    public Tshirt() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for date.
     *
     * @return the current value of date
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Setter method for date.
     *
     * @param aDate the new value for date
     */
    public void setDate(LocalDateTime aDate) {
        date = aDate;
    }

    /**
     * Access method for marque.
     *
     * @return the current value of marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Setter method for marque.
     *
     * @param aMarque the new value for marque
     */
    public void setMarque(String aMarque) {
        marque = aMarque;
    }

    /**
     * Access method for modele.
     *
     * @return the current value of modele
     */
    public String getModele() {
        return modele;
    }

    /**
     * Setter method for modele.
     *
     * @param aModele the new value for modele
     */
    public void setModele(String aModele) {
        modele = aModele;
    }

    /**
     * Access method for prix.
     *
     * @return the current value of prix
     */
    public float getPrix() {
        return prix;
    }

    /**
     * Setter method for prix.
     *
     * @param aPrix the new value for prix
     */
    public void setPrix(float aPrix) {
        prix = aPrix;
    }

    /**
     * Compares the key for this instance with another Tshirt.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Tshirt and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Tshirt)) {
            return false;
        }
        Tshirt that = (Tshirt) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Tshirt.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Tshirt)) return false;
        return this.equalKeys(other) && ((Tshirt)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    @Override
	public String toString() {
		return "Tshirt [id=" + id + ", date=" + date + ", marque=" + marque + ", modele=" + modele + ", prix=" + prix
				+ "]";
	}

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

    
}
