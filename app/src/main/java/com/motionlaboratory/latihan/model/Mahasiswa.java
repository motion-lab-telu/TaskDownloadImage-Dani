package com.motionlaboratory.latihan.model;

import java.security.PrivateKey;

/**
 * Created by MOTION-3 on 27/10/2016.
 */

public class Mahasiswa {
    private String nim, nama, alamat, foto, quote;

    public Mahasiswa(String nim, String nama, String alamat, String foto, String quote) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.foto = foto;
        this.quote = quote;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getFoto() {
        return foto;
    }

    public String getQuote() {
        return quote;
    }
}
