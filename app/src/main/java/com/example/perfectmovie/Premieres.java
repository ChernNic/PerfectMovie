package com.example.perfectmovie;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Premieres {
    @SerializedName("total")
    private int total;

    @SerializedName("items")
    private ArrayList<Premier> premiers;

    public Premieres(int total, ArrayList<Premier> premiers) {
        this.total = total;
        this.premiers = premiers;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Premier> getItems() {
        return premiers;
    }

    public void setItems(ArrayList<Premier> premiers) {
        this.premiers = premiers;
    }

    public class Premier {
        @SerializedName("kinopoiskId")
        private int kinopoiskId;

        @SerializedName("nameRu")
        private  String nameRu;

        @SerializedName("nameEn")
        private String nameEn;

        @SerializedName("year")
        private int year;

        @SerializedName("posterUrl")
        private String posterUrl;

        @SerializedName("posterUrlPreview")
        private String posterUrlPreview;

        @SerializedName("countries")
        private List<Country> countries;

        @SerializedName("genres")
        private List<Genre> genres;

        @SerializedName("duration")
        private int duration;

        @SerializedName("premiereRu")
        private String premiereRu;

        public Premier(int kinopoiskId, String nameRu, String nameEn, int year, String posterUrl, String posterUrlPreview, List<Country> countries, List<Genre> genres, int duration, String premiereRu) {
            this.kinopoiskId = kinopoiskId;
            this.nameRu = nameRu;
            this.nameEn = nameEn;
            this.year = year;
            this.posterUrl = posterUrl;
            this.posterUrlPreview = posterUrlPreview;
            this.countries = countries;
            this.genres = genres;
            this.duration = duration;
            this.premiereRu = premiereRu;
        }

        public String getNameRu() {
            return nameRu;
        }

        public void setNameRu(String nameRu) {
            this.nameRu = nameRu;
        }

        public int getKinopoiskId() {
            return kinopoiskId;
        }

        public void setKinopoiskId(int kinopoiskId) {
            this.kinopoiskId = kinopoiskId;
        }

        public String getNameEn() {
            return nameEn;
        }

        public void setNameEn(String nameEn) {
            this.nameEn = nameEn;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getPosterUrl() {
            return posterUrl;
        }

        public void setPosterUrl(String posterUrl) {
            this.posterUrl = posterUrl;
        }

        public String getPosterUrlPreview() {
            return posterUrlPreview;
        }

        public void setPosterUrlPreview(String posterUrlPreview) {
            this.posterUrlPreview = posterUrlPreview;
        }

        public List<Country> getCountries() {
            return countries;
        }

        public void setCountries(List<Country> countries) {
            this.countries = countries;
        }

        public List<Genre> getGenres() {
            return genres;
        }

        public void setGenres(List<Genre> genres) {
            this.genres = genres;
        }

        public int getDuration() {
            return duration;
        }

        public String getPremiereRu() {
            return premiereRu;
        }

        public void setPremiereRu(String premiereRu) {
            this.premiereRu = premiereRu;
        }
    }

    public class Country {
        @SerializedName("country")
        private String country;

        public Country(String country) {
            this.country = country;
        }

    }

    public class Genre {
        @SerializedName("genre")
        public String genre;

        public Genre(String genre) {
            this.genre = genre;
        }

    }
}
