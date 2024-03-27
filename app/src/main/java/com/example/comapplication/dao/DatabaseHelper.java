package com.example.comapplication.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper extends SQLiteOpenHelper {
    // Nom de la base de données
    private static final String DATABASE_NAME = "comApp.db";
    // Version de la base de données
    private static final int DATABASE_VERSION = 1;
    // Commandes SQL pour créer les tables User et Role
    private static final String CREATE_TABLE_USER =
            "CREATE TABLE User ( "+
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nom TEXT NOT NULL," +
                "prenom TEXT NOT NULL," +
                  "email TEXT UNIQUE NOT NULL," +
                "password TEXT NOT NULL," +
                "roleId INTEGER," +
                "FOREIGN KEY(roleId) REFERENCES Role(id))";
    private static final String CREATE_TABLE_ROLE =
            "CREATE TABLE Role (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "roleName TEXT NOT NULL)";
    // Constructeur

    private static final String CREATE_TABLE_PARTICIPATION =
            "CREATE TABLE Participation ( "+
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "equipe_id INTEGER," +
                    "competition_id INTEGER," +
                    "user_id INTEGER," +
                    "score INTEGER," +
                    "FOREIGN KEY(equipe_id) REFERENCES Equipes(equipe_id))"+
                    "FOREIGN KEY(competition_id) REFERENCES Competitions(competition_id))"+
                    "FOREIGN KEY(user_id) REFERENCES User(user_id))";
    private static final String CREATE_TABLE_COMPETITION =
            "CREATE TABLE Competition ( "+
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "nom_competition TEXT NOT NULL," +
                    "date_debut DATE NOT NULL," +
                    "date_fin DATE NOT NULL)";
                    "nombredecompetition NUMBER NOT NULL)";

    private static final String CREATE_TABLE_EQUIPE =
            "CREATE TABLE Equipe ( "+
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "nom_equipe TEXT NOT NULL)" +
                    "club_id INTEGER" +
                    "FOREIGN KEY (club_id) REFERENCES Clubs(club_id)";


    private static final String CREATE_TABLE_CLUB =
            "CREATE TABLE Club ( "+
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "nom_club TEXT NOT NULL)" ;
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
// Création des tables User et Role
        db.execSQL(CREATE_TABLE_ROLE);
        db.execSQL(CREATE_TABLE_USER);
        db.execSQL(CREATE_TABLE_PARTICIPATION);
        db.execSQL(CREATE_TABLE_COMPETITION);
        db.execSQL(CREATE_TABLE_EQUIPE);
        db.execSQL(CREATE_TABLE_CLUB);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int
            newVersion) {
// Ici vous pouvez gérer les mises à jour de votre schéma de base de données pour les nouvelles versions
    }
}
