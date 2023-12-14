package com.example.perfectmovie;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    @SerializedName("total")
    public int total;

    @SerializedName("totalPages")
    public int totalPages;

    @SerializedName("items")
    public ArrayList<Item> items;

    public Collection(int total, int totalPages, ArrayList<Item> items) {
        this.total = total;
        this.totalPages = totalPages;
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public class Item {
        @SerializedName("kinopoiskId")
        private int kinopoiskId;

        @SerializedName("nameRu")
        private String nameRu;

        @SerializedName("nameEn")
        private String nameEn;

        @SerializedName("nameOriginal")
        private String nameOriginal;

        @SerializedName("countries")
        private List<Country> countries;

        @SerializedName("genres")
        private List<Genre> genres;

        @SerializedName("ratingKinopoisk")
        private double ratingKinopoisk;

        @SerializedName("ratingImbd")
        private double ratingImbd;

        @SerializedName("year")
        private String year;

        @SerializedName("type")
        private String type;

        @SerializedName("posterUrl")
        private String posterUrl;

        @SerializedName("posterUrlPreview")
        private String posterUrlPreview;

        public Item(int kinopoiskId, String nameRu, String nameEn, String nameOriginal, List<Country> countries, List<Genre> genres, double ratingKinopoisk, double ratingImbd, String year, String type, String posterUrl, String posterUrlPreview) {
            this.kinopoiskId = kinopoiskId;
            this.nameRu = nameRu;
            this.nameEn = nameEn;
            this.nameOriginal = nameOriginal;
            this.countries = countries;
            this.genres = genres;
            this.ratingKinopoisk = ratingKinopoisk;
            this.ratingImbd = ratingImbd;
            this.year = year;
            this.type = type;
            this.posterUrl = posterUrl;
            this.posterUrlPreview = posterUrlPreview;
        }

        public int getKinopoiskId() {
            return kinopoiskId;
        }

        public void setKinopoiskId(int kinopoiskId) {
            this.kinopoiskId = kinopoiskId;
        }

        public String getNameRu() {
            return nameRu;
        }

        public void setNameRu(String nameRu) {
            this.nameRu = nameRu;
        }

        public String getNameEn() {
            return nameEn;
        }

        public void setNameEn(String nameEn) {
            this.nameEn = nameEn;
        }

        public String getNameOriginal() {
            return nameOriginal;
        }

        public void setNameOriginal(String nameOriginal) {
            this.nameOriginal = nameOriginal;
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

        public double getRatingKinopoisk() {
            return ratingKinopoisk;
        }

        public void setRatingKinopoisk(double ratingKinopoisk) {
            this.ratingKinopoisk = ratingKinopoisk;
        }

        public double getRatingImbd() {
            return ratingImbd;
        }

        public void setRatingImbd(double ratingImbd) {
            this.ratingImbd = ratingImbd;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
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
    }
}
