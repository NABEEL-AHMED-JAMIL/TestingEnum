package com.company;

/**
 * Created by Nabeel on 11/22/2017.
 */
public enum OrderType {

    TAKEAWAY("TAKEAWAY"),
    DINEIN("DINEIN"),
    DELIVERY("DELIVERY"),
    CATERING("CATERING");

    private String value;

    private OrderType(String value) {
        this.value = value;
    }

    public String getValue() { return value; }

    public static OrderType create(String value) {
        OrderType[] units = OrderType.values();
        for (OrderType unit: units){
            if(unit.getValue().equals(value)){
                return unit;
            }
        }
        return TAKEAWAY;
    }
}

@Access(AccessType.FIELD)
@Entity
public class Professor {
	
	public static String LOCAL_AREA_CODE = "999";
	@Id
	private Integer id;
	@Transient
	private String phoneNum;
	
	public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPhoneNumber() {
    return phoneNum;
  }

  public void setPhoneNumber(String num) {
    this.phoneNum = num;
  }
  
   @Access(AccessType.PROPERTY)
  @Column(name = "PHONE")
  protected String getPhoneNumberForDb() {
    if (null != phoneNum && phoneNum.length() == 10)
      return phoneNum;
    else
      return LOCAL_AREA_CODE + phoneNum;
  }

  protected void setPhoneNumberForDb(String num) {
    if (num.startsWith(LOCAL_AREA_CODE))
      phoneNum = num.substring(3);
    else
      phoneNum = num;
  }
	
}
