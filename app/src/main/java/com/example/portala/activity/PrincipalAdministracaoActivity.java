package com.example.portala.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.portala.R;
import com.example.portala.fragment.AlunoFragment;
import com.example.portala.fragment.AlunoInstituicaoFragment;
import com.example.portala.fragment.ContatoFragment;
import com.example.portala.fragment.ContatoInstituicaoFragment;
import com.example.portala.fragment.EventoFragment;
import com.example.portala.fragment.EventoInstituicaoFragment;
import com.example.portala.fragment.InicioFragment;
import com.example.portala.fragment.InicioInstituicaoFragment;
import com.example.portala.fragment.PerfilFragment;
import com.example.portala.fragment.PerfilInstituicaoFragment;

public class PrincipalAdministracaoActivity extends AppCompatActivity {

    private ImageView imageViewPerfil;
    private ImageView imageViewEvento;
    private ImageView imageViewInicio;
    private ImageView imageViewAluno;
    private ImageView imageViewContato;
    private InicioInstituicaoFragment inicioFragment;
    private PerfilInstituicaoFragment perfilFragment;
    private EventoInstituicaoFragment eventoFragment;
    private AlunoInstituicaoFragment alunoFragment;
    private ContatoInstituicaoFragment contatoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_administracao);

        iniciarComponentes();

        inicioFragment = new InicioInstituicaoFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameInstituicaoConteudoPrincipal, inicioFragment);
        transaction.commit();

        imageViewPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perfilFragment = new PerfilInstituicaoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameInstituicaoConteudoPrincipal, perfilFragment);
                transaction.commit();
            }
        });

        imageViewEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eventoFragment = new EventoInstituicaoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameInstituicaoConteudoPrincipal, eventoFragment);
                transaction.commit();
            }
        });

        imageViewInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inicioFragment = new InicioInstituicaoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameInstituicaoConteudoPrincipal, inicioFragment);
                transaction.commit();
            }
        });

        imageViewAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alunoFragment = new AlunoInstituicaoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameInstituicaoConteudoPrincipal, alunoFragment);
                transaction.commit();

            }
        });

        imageViewContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatoFragment = new ContatoInstituicaoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameInstituicaoConteudoPrincipal, contatoFragment);
                transaction.commit();
            }
        });

    }

    public void iniciarComponentes(){
        imageViewPerfil = findViewById(R.id.imageViewInstituicaoPerfil);
        imageViewEvento = findViewById(R.id.imageViewInstituicaoEvento);
        imageViewInicio = findViewById(R.id.imageViewInstituicaoInicio);
        imageViewAluno = findViewById(R.id.imageViewInstituicaoAluno);
        imageViewContato = findViewById(R.id.imageViewInstituicaoContato);
    }

}
