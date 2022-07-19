package com.stringreverse.backend.stringreversebackend.model;

public class Payload {
  private String dansstring;

  public Payload() {}

  public String getDansstring() {
    return dansstring;
  }

  public void setDansstring(String dansstring) {
    this.dansstring = dansstring;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Payload{");
    sb.append("dansstring='").append(dansstring).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
