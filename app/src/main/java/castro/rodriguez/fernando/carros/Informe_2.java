package castro.rodriguez.fernando.carros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import castro.rodriguez.fernando.carros.Carro;
import castro.rodriguez.fernando.carros.Datos;

public class Informe_2 extends AppCompatActivity {

    private ArrayList<Carro> carroArrayList;
    private TextView kiaText, chevroletText, renaultText;
    int kia = 0, chevrolet = 0, renault = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe_2);

        carroArrayList = Datos.getCarros();

        for (int i = 0; i < carroArrayList.size(); i++) {
            if(carroArrayList.get(i).getMarca().equals("Kia")){
                kia++;
            }else if (carroArrayList.get(i).getMarca().equals("Chevrolet")){
                chevrolet++;
            }else {
                renault++;
            }
        }

        kiaText = (TextView)findViewById(R.id.txtCarrosKia);
        chevroletText = (TextView)findViewById(R.id.txtCarrosChevrolet);
        renaultText = (TextView)findViewById(R.id.txtCarrosRenault);

        kiaText.setText(String.valueOf(kia));
        chevroletText.setText(String.valueOf(chevrolet));
        renaultText.setText(String.valueOf(renault));
    }

}
