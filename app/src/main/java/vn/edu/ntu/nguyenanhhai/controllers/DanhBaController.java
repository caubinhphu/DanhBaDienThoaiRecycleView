package vn.edu.ntu.nguyenanhhai.controllers;

import android.app.Application;

import java.util.ArrayList;

import vn.edu.ntu.nguyenanhhai.models.DanhBaItemModel;

public class DanhBaController extends Application implements IDanhBaController {
  ArrayList<DanhBaItemModel> danhBas;

  public DanhBaController() {
    danhBas = new ArrayList<>();

    danhBas.add(new DanhBaItemModel("Lê Như", "2/5/1999", "012345678"));
    danhBas.add(new DanhBaItemModel("Lê Như", "5/6/1999", "012301558"));
    danhBas.add(new DanhBaItemModel("Lê Như", "16/7/1999", "032112145"));
    danhBas.add(new DanhBaItemModel("Lê Như", "24/5/1999", "055411125"));
    danhBas.add(new DanhBaItemModel("Lê Như", "4/16/1999", "056523123"));
    danhBas.add(new DanhBaItemModel("Lê Như", "1/1/1999", "095421212"));
    danhBas.add(new DanhBaItemModel("Lê Như", "12/12/1999", "054745212"));
    danhBas.add(new DanhBaItemModel("Lê Như", "12/5/1999", "089841232"));
    danhBas.add(new DanhBaItemModel("Lê Như", "2/5/1999", "012345678"));
    danhBas.add(new DanhBaItemModel("Lê Như", "5/6/1999", "012301558"));
    danhBas.add(new DanhBaItemModel("Lê Như", "16/7/1999", "032112145"));
    danhBas.add(new DanhBaItemModel("Lê Như", "24/5/1999", "055411125"));
    danhBas.add(new DanhBaItemModel("Lê Như", "4/16/1999", "056523123"));
    danhBas.add(new DanhBaItemModel("Lê Như", "1/1/1999", "095421212"));
    danhBas.add(new DanhBaItemModel("Lê Như", "12/12/1999", "054745212"));
    danhBas.add(new DanhBaItemModel("Lê Như", "12/5/1999", "089841232"));
    danhBas.add(new DanhBaItemModel("Lê Như", "2/5/1999", "012345678"));
    danhBas.add(new DanhBaItemModel("Lê Như", "5/6/1999", "012301558"));
    danhBas.add(new DanhBaItemModel("Lê Như", "16/7/1999", "032112145"));
    danhBas.add(new DanhBaItemModel("Lê Như", "24/5/1999", "055411125"));
    danhBas.add(new DanhBaItemModel("Lê Như", "4/16/1999", "056523123"));
    danhBas.add(new DanhBaItemModel("Lê Như", "1/1/1999", "095421212"));
    danhBas.add(new DanhBaItemModel("Lê Như", "12/12/1999", "054745212"));
    danhBas.add(new DanhBaItemModel("Lê Như", "12/5/1999", "089841232"));
    danhBas.add(new DanhBaItemModel("Lê Như", "2/5/1999", "012345678"));
    danhBas.add(new DanhBaItemModel("Lê Như", "5/6/1999", "012301558"));
    danhBas.add(new DanhBaItemModel("Lê Như", "16/7/1999", "032112145"));
    danhBas.add(new DanhBaItemModel("Lê Như", "24/5/1999", "055411125"));
    danhBas.add(new DanhBaItemModel("Lê Như", "4/16/1999", "056523123"));
    danhBas.add(new DanhBaItemModel("Lê Như", "1/1/1999", "095421212"));
    danhBas.add(new DanhBaItemModel("Lê Như", "12/12/1999", "054745212"));
    danhBas.add(new DanhBaItemModel("Lê Như", "12/5/1999", "089841232"));
    danhBas.add(new DanhBaItemModel("Lê Như", "2/5/1999", "012345678"));
    danhBas.add(new DanhBaItemModel("Lê Như", "5/6/1999", "012301558"));
    danhBas.add(new DanhBaItemModel("Lê Như", "16/7/1999", "032112145"));
    danhBas.add(new DanhBaItemModel("Lê Như", "24/5/1999", "055411125"));
    danhBas.add(new DanhBaItemModel("Lê Như", "4/16/1999", "056523123"));
    danhBas.add(new DanhBaItemModel("Lê Như", "1/1/1999", "095421212"));
    danhBas.add(new DanhBaItemModel("Lê Như", "12/12/1999", "054745212"));
    danhBas.add(new DanhBaItemModel("Lê Như", "12/5/1999", "089841232"));
  }

  @Override
  public ArrayList<DanhBaItemModel> getAllDanhBa() {
    return danhBas;
  }
}
