package vn.edu.ntu.nguyenanhhai.danhbadienthoai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

import vn.edu.ntu.nguyenanhhai.controllers.DanhBaController;
import vn.edu.ntu.nguyenanhhai.controllers.IDanhBaController;
import vn.edu.ntu.nguyenanhhai.models.DanhBaItemModel;

public class MainActivity extends AppCompatActivity {
  RecyclerView rvDanhBa;
  DanhBaAdapter adapter;
  DanhBaController danhBaController;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    addViews();
  }

  private void addViews() {
    rvDanhBa = findViewById(R.id.rvDanhBa);
    danhBaController = new DanhBaController();
    rvDanhBa.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    adapter = new DanhBaAdapter(danhBaController.getAllDanhBa());
    rvDanhBa.setAdapter(adapter);
//    IDanhBaController iDanhBaCon = (IDanhBaController) getApplication();
//    ArrayList<DanhBaItemModel> x = iDanhBaCon.getAllDanhBa();
  }

  private class DanhBaHolder extends RecyclerView.ViewHolder {
    TextView txtName, txtDateOfBirth, txtPhone;
    ImageView imvCall, imvMessage, imvEdit;
    DanhBaItemModel dbItem;

    public DanhBaHolder(@NonNull View itemView) {
      super(itemView);
      txtName = this.itemView.findViewById(R.id.txtName);
      txtDateOfBirth = this.itemView.findViewById(R.id.txtDateOfBirth);
      txtPhone = this.itemView.findViewById(R.id.txtPhone);
      imvCall = this.itemView.findViewById(R.id.imvCall);
      imvMessage = this.itemView.findViewById(R.id.imvMsg);
      imvEdit = this.itemView.findViewById(R.id.imvEdit);

      addEvents();
    }

    public void bind(DanhBaItemModel db) {
      this.dbItem = db;
      txtName.setText(db.getName());
      txtDateOfBirth.setText(db.getDateOfBirth());
      txtPhone.setText(db.getPhone());
    }

    private void addEvents() {
      imvCall.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          Toast.makeText(MainActivity.this, "Call " + dbItem.getPhone(), Toast.LENGTH_SHORT).show();
        }
      });

      imvMessage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          Toast.makeText(MainActivity.this, "Message " + dbItem.getPhone(), Toast.LENGTH_SHORT).show();
        }
      });

      imvEdit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          Toast.makeText(MainActivity.this, "Edit " + dbItem.getPhone(), Toast.LENGTH_SHORT).show();
        }
      });
    }
  }

  private class DanhBaAdapter extends RecyclerView.Adapter<DanhBaHolder> {
    ArrayList<DanhBaItemModel> danhBas;

    public DanhBaAdapter(ArrayList<DanhBaItemModel> danhBas) {
      this.danhBas = danhBas;
    }

    @NonNull
    @Override
    public DanhBaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutInflater inflater = getLayoutInflater();
      View view = inflater.inflate(R.layout.danhba_item, parent, false);
      return new DanhBaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DanhBaHolder holder, int position) {
      holder.bind(danhBas.get(position));
    }

    @Override
    public int getItemCount() {
      return danhBas.size();
    }
  }
}
