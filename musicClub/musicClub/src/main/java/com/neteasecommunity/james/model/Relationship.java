package com.neteasecommunity.james.model;

import java.io.Serializable;

public class Relationship implements Serializable {
    private static final long serialVersionUID = 2556296242575679705L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column relationship.id
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column relationship.uid1
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    private Integer uid1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column relationship.uid2
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    private Integer uid2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column relationship.type
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    private Integer type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column relationship.id
     *
     * @return the value of relationship.id
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column relationship.id
     *
     * @param id the value for relationship.id
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column relationship.uid1
     *
     * @return the value of relationship.uid1
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    public Integer getUid1() {
        return uid1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column relationship.uid1
     *
     * @param uid1 the value for relationship.uid1
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    public void setUid1(Integer uid1) {
        this.uid1 = uid1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column relationship.uid2
     *
     * @return the value of relationship.uid2
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    public Integer getUid2() {
        return uid2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column relationship.uid2
     *
     * @param uid2 the value for relationship.uid2
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    public void setUid2(Integer uid2) {
        this.uid2 = uid2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column relationship.type
     *
     * @return the value of relationship.type
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column relationship.type
     *
     * @param type the value for relationship.type
     *
     * @mbg.generated Sun Mar 08 21:50:07 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }
}