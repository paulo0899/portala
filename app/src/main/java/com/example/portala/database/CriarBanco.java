package com.example.portala.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.portala.classes.Instituicao;
import com.example.portala.classes.Responsavel;

import java.util.ArrayList;

public class CriarBanco extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "banco.db";
    public static final int DATABASE_VERSION = 1;

    public static final String RESPOSAVEL_TABELA_NOME = "responsavel";
    public static final String RESPONSAVEL_ID = "idResponsavel";
    public static final String RESPONSAVEL_NOME = "nomeResponsavel";
    public static final String RESPONSAVEL_SENHA = "senhaResponsavel";
    public static final String RESPONSAVEL_EMAIL = "emailResponsavel";
    public static final String RESPONSAVEL_FOTO = "fotoResponsavel";
    public static final ArrayList() RESPONSAVEL_ALUNO = "alunoResponsavel";
    public static final Instituicao() RESPONSAVEL_INSTITUICAO = "instituicaoResponsavel";

    public CriarBanco(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION)
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE" + RESPONSAVEL_ID + "("
                + RESPONSAVEL_ID + "String PRIMARY KEY,"
                + RESPONSAVEL_NOME + "text,"
                + RESPONSAVEL_SENHA + "text,"
                + RESPONSAVEL_EMAIL + "text,"
                + RESPONSAVEL_FOTO + "text,"
                + RESPONSAVEL_ALUNO + "text,"
                + RESPONSAVEL_INSTITUICAO + "text"
                + ")";

        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + RESPONSAVEL_ID);
        onCreate(db);
    }

    public ArrayList<Responsavel> select(){

    }
}
