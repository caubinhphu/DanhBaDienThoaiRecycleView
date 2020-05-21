package vn.edu.ntu.nguyenanhhai.models;

public class DanhBaItemModel {
  String name, dateOfBirth, phone;

  public DanhBaItemModel(String name, String dateOfBirth, String phone) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
