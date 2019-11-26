package com.example.portala.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
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
    //public static final ArrayList() RESPONSAVEL_ALUNO = "alunoResponsavel";
    //public static final Instituicao() RESPONSAVEL_INSTITUICAO = "instituicaoResponsavel";

    public CriarBanco(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE " + RESPOSAVEL_TABELA_NOME + "("
                + RESPONSAVEL_ID + "String PRIMARY KEY,"
                + RESPONSAVEL_NOME + "text,"
                + RESPONSAVEL_SENHA + "text,"
                + RESPONSAVEL_EMAIL + "text,"
                + RESPONSAVEL_FOTO + "text"
                //+ RESPONSAVEL_ALUNO + "text,"
                //+ RESPONSAVEL_INSTITUICAO + "text"
                + ")";

        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + RESPONSAVEL_ID);
        onCreate(db);
    }
    //crud %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public <Cursor> ArrayList<Responsavel> select() {
        ArrayList<Responsavel> retorno = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + RESPOSAVEL_TABELA_NOME, null);
        if (res.moveToFirst()) {
            do {
                Aluno a = new Aluno();
                a.matricula = res.getInt(res.getColumnIndex(AlunoDados.ALUNO_COLUNA_MATRICULA));
                a.nome = res.getString(res.getColumnIndex(AlunoDados.ALUNO_COLUNA_NOME));
                a.cpf = res.getString(res.getColumnIndex(AlunoDados.ALUNO_COLUNA_CPF));
                a.relevancia = res.getFloat(res.getColumnIndex(AlunoDados.ALUNO_COLUNA_RELEVANCIA));

                retorno.add(a);
            } while (res.moveToNext());
        }
        return retorno;
    }

    public Aluno getAluno(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery(String.format("SELECT * FROM %s WHERE %s = ? ", ALUNO_TABELA_NOME, ALUNO_COLUNA_MATRICULA), new String[]{Integer.toString(id)});
        Aluno retorno = new Aluno();
        if (res.moveToFirst()) {
            do {

                retorno.matricula = res.getInt(res.getColumnIndex(AlunoDados.ALUNO_COLUNA_MATRICULA));
                retorno.nome = res.getString(res.getColumnIndex(AlunoDados.ALUNO_COLUNA_NOME));
                retorno.cpf = res.getString(res.getColumnIndex(AlunoDados.ALUNO_COLUNA_CPF));
                retorno.relevancia = res.getFloat(res.getColumnIndex(AlunoDados.ALUNO_COLUNA_RELEVANCIA));


            } while (res.moveToNext());
        }
        return retorno;
    }

    public boolean insert(Aluno a) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(ALUNO_COLUNA_NOME, a.nome);
        contentValues.put(ALUNO_COLUNA_CPF, a.cpf);
        contentValues.put(ALUNO_COLUNA_RELEVANCIA, a.relevancia);

        db.insert(ALUNO_TABELA_NOME, null, contentValues);
        return true;
    }

    public boolean update(Aluno a) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ALUNO_COLUNA_NOME, a.nome);
        contentValues.put(ALUNO_COLUNA_CPF, a.cpf);
        contentValues.put(ALUNO_COLUNA_RELEVANCIA, a.relevancia);
        db.update(ALUNO_TABELA_NOME, contentValues, ALUNO_COLUNA_MATRICULA + " = ? ", new String[]{Integer.toString(a.matricula)});
        return true;
    }

    public Integer delete(Aluno a) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(ALUNO_TABELA_NOME,
                ALUNO_COLUNA_MATRICULA + " = ? ",
                new String[]{Integer.toString(a.matricula)});
    }

    public Integer deleteAllPerson() {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(ALUNO_TABELA_NOME,
                ALUNO_COLUNA_MATRICULA + " > ? ",
                new String[]{Integer.toString(0)});
    }


}