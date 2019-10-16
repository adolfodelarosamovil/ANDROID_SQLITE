package edu.cftic.sql_app.dto;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Created by vale on 1/06/16.
 */
public class Persona implements Parcelable {

    private int id;
    private String nombre;

    @NonNull
    @Override
    public String toString() {
        String objeto_str = null;
        objeto_str = this.getNombre() + " " + "ID " + this.getId();

        return objeto_str;
    }

    public static final Parcelable.Creator<Persona> CREATOR = new Parcelable.Creator<Persona>(){

        @Override
        public Persona createFromParcel(Parcel parcel) {
            return new Persona(parcel);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    public Persona (Parcel parcel)
    {
        this.id = parcel.readInt();
        this.nombre = parcel.readString();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(nombre);

    }

    public Persona () {}

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Persona (String nombre)
    {
        this.nombre = nombre;
    }



    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
