package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialCardView idMenuPets, idMenuAlimentos, idMenuDoacoes, idMenuServicos, idMenuLocalizacao, idMenuParcerias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idMenuPets = findViewById(R.id.idMenuPets);
        idMenuAlimentos = findViewById(R.id.idMenuAlimentos);
        idMenuDoacoes = findViewById(R.id.idMenuDoacoes);
        idMenuServicos = findViewById(R.id.idMenuServicos);
        idMenuLocalizacao = findViewById(R.id.idMenuLocalizacao);
        idMenuParcerias = findViewById(R.id.idMenuParcerias);

        idMenuPets.setOnClickListener(this);
        idMenuAlimentos.setOnClickListener(this);
        idMenuDoacoes.setOnClickListener(this);
        idMenuServicos.setOnClickListener(this);
        idMenuLocalizacao.setOnClickListener(this);
        idMenuParcerias.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.idMenuPets:
                startActivity(new Intent(getApplicationContext(),
                        PetsActivity.class));
                break;
            case R.id.idMenuAlimentos:
                startActivity(new Intent(getApplicationContext(),
                        PetsActivity.class));
                break;
            case R.id.idMenuDoacoes:
                startActivity(new Intent(getApplicationContext(),
                        PetsActivity.class));
                break;
            case R.id.idMenuServicos:
                startActivity(new Intent(getApplicationContext(),
                        PetsActivity.class));
                break;
            case R.id.idMenuLocalizacao:
                startActivity(new Intent(getApplicationContext(),
                        PetsActivity.class));
                break;
            case R.id.idMenuParcerias:
                startActivity(new Intent(getApplicationContext(),
                        PetsActivity.class));
                break;
        }
    }
}