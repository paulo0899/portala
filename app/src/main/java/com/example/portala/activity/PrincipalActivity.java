package com.example.portala.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.portala.R;
import com.example.portala.fragment.AlunoFragment;
import com.example.portala.fragment.ContatoFragment;
import com.example.portala.fragment.EventoFragment;
import com.example.portala.fragment.InicioFragment;
import com.example.portala.fragment.PerfilFragment;

public class PrincipalActivity extends AppCompatActivity {

    private ImageView imageViewPerfil;
    private ImageView imageViewEvento;
    private ImageView imageViewInicio;
    private ImageView imageViewAluno;
    private ImageView imageViewContato;
    private InicioFragment inicioFragment;
    private PerfilFragment perfilFragment;
    private EventoFragment eventoFragment;
    private AlunoFragment alunoFragment;
    private ContatoFragment contatoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        iniciarComponentes();

        inicioFragment = new InicioFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudoPrincipal, inicioFragment);
        transaction.commit();

        imageViewPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perfilFragment = new PerfilFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudoPrincipal, perfilFragment);
                transaction.commit();
            }
        });

        imageViewEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eventoFragment = new EventoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudoPrincipal, eventoFragment);
                transaction.commit();
            }
        });

        imageViewInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inicioFragment = new InicioFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudoPrincipal, inicioFragment);
                transaction.commit();
            }
        });

        imageViewAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alunoFragment = new AlunoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudoPrincipal, alunoFragment);
                transaction.commit();
            }
        });

        imageViewContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatoFragment = new ContatoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudoPrincipal, contatoFragment);
                transaction.commit();
            }
        });


    }

    public void iniciarComponentes(){
        imageViewPerfil = findViewById(R.id.imageViewPerfil);
        imageViewEvento = findViewById(R.id.imageViewEvento);
        imageViewInicio = findViewById(R.id.imageViewInicio);
        imageViewAluno = findViewById(R.id.imageViewAluno);
        imageViewContato = findViewById(R.id.imageViewContato);
    }

}
