package com.example.perfectmovie;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Film {

    private int kinopoiskId;
    private String kinopoiskHDId;
    private String imdbId;
    private String nameRu;
    private Object nameEn;
    private String nameOriginal;
    private String posterUrl;
    private String posterUrlPreview;
    private String coverUrl;
    private Object logoUrl;
    private int reviewsCount;
    private int ratingGoodReview;
    private int ratingGoodReviewVoteCount;
    private double ratingKinopoisk;
    private int ratingKinopoiskVoteCount;
    private double ratingImdb;
    private int ratingImdbVoteCount;
    private double ratingFilmCritics;
    private int ratingFilmCriticsVoteCount;
    private Object ratingAwait;
    private int ratingAwaitCount;
    private int ratingRfCritics;
    private int ratingRfCriticsVoteCount;
    private String webUrl;
    private int year;
    private String filmLength;
    private String slogan;
    private String description;
    private String shortDescription;
    private boolean isTicketsAvailable;
    private Object productionStatus;
    private String type;
    private String ratingMpaa;
    private String ratingAgeLimits;
    private ArrayList<Country> countries;
    private ArrayList<Genre> genres;
    private Object startYear;
    private Object endYear;
    private boolean serial;
    private boolean shortFilm;
    private boolean completed;
    private boolean hasImax;
    private boolean has3D;
    private String lastSync;

    public int getKinopoiskId() {
        return kinopoiskId;
    }

    public void setKinopoiskId(int kinopoiskId) {
        this.kinopoiskId = kinopoiskId;
    }

    public String getKinopoiskHDId() {
        return kinopoiskHDId;
    }

    public void setKinopoiskHDId(String kinopoiskHDId) {
        this.kinopoiskHDId = kinopoiskHDId;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getNameRu() {
        return nameRu;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public Object getNameEn() {
        return nameEn;
    }

    public void setNameEn(Object nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameOriginal() {
        return nameOriginal;
    }

    public void setNameOriginal(String nameOriginal) {
        this.nameOriginal = nameOriginal;
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

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Object getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(Object logoUrl) {
        this.logoUrl = logoUrl;
    }

    public int getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(int reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public int getRatingGoodReview() {
        return ratingGoodReview;
    }

    public void setRatingGoodReview(int ratingGoodReview) {
        this.ratingGoodReview = ratingGoodReview;
    }

    public int getRatingGoodReviewVoteCount() {
        return ratingGoodReviewVoteCount;
    }

    public void setRatingGoodReviewVoteCount(int ratingGoodReviewVoteCount) {
        this.ratingGoodReviewVoteCount = ratingGoodReviewVoteCount;
    }

    public double getRatingKinopoisk() {
        return ratingKinopoisk;
    }

    public void setRatingKinopoisk(double ratingKinopoisk) {
        this.ratingKinopoisk = ratingKinopoisk;
    }

    public int getRatingKinopoiskVoteCount() {
        return ratingKinopoiskVoteCount;
    }

    public void setRatingKinopoiskVoteCount(int ratingKinopoiskVoteCount) {
        this.ratingKinopoiskVoteCount = ratingKinopoiskVoteCount;
    }

    public double getRatingImdb() {
        return ratingImdb;
    }

    public void setRatingImdb(double ratingImdb) {
        this.ratingImdb = ratingImdb;
    }

    public int getRatingImdbVoteCount() {
        return ratingImdbVoteCount;
    }

    public void setRatingImdbVoteCount(int ratingImdbVoteCount) {
        this.ratingImdbVoteCount = ratingImdbVoteCount;
    }

    public double getRatingFilmCritics() {
        return ratingFilmCritics;
    }

    public void setRatingFilmCritics(double ratingFilmCritics) {
        this.ratingFilmCritics = ratingFilmCritics;
    }

    public int getRatingFilmCriticsVoteCount() {
        return ratingFilmCriticsVoteCount;
    }

    public void setRatingFilmCriticsVoteCount(int ratingFilmCriticsVoteCount) {
        this.ratingFilmCriticsVoteCount = ratingFilmCriticsVoteCount;
    }

    public Object getRatingAwait() {
        return ratingAwait;
    }

    public void setRatingAwait(Object ratingAwait) {
        this.ratingAwait = ratingAwait;
    }

    public int getRatingAwaitCount() {
        return ratingAwaitCount;
    }

    public void setRatingAwaitCount(int ratingAwaitCount) {
        this.ratingAwaitCount = ratingAwaitCount;
    }

    public int getRatingRfCritics() {
        return ratingRfCritics;
    }

    public void setRatingRfCritics(int ratingRfCritics) {
        this.ratingRfCritics = ratingRfCritics;
    }

    public int getRatingRfCriticsVoteCount() {
        return ratingRfCriticsVoteCount;
    }

    public void setRatingRfCriticsVoteCount(int ratingRfCriticsVoteCount) {
        this.ratingRfCriticsVoteCount = ratingRfCriticsVoteCount;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public boolean isTicketsAvailable() {
        return isTicketsAvailable;
    }

    public void setTicketsAvailable(boolean ticketsAvailable) {
        isTicketsAvailable = ticketsAvailable;
    }

    public Object getProductionStatus() {
        return productionStatus;
    }

    public void setProductionStatus(Object productionStatus) {
        this.productionStatus = productionStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRatingMpaa() {
        return ratingMpaa;
    }

    public void setRatingMpaa(String ratingMpaa) {
        this.ratingMpaa = ratingMpaa;
    }

    public String getRatingAgeLimits() {
        return ratingAgeLimits;
    }

    public void setRatingAgeLimits(String ratingAgeLimits) {
        this.ratingAgeLimits = ratingAgeLimits;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public Object getStartYear() {
        return startYear;
    }

    public void setStartYear(Object startYear) {
        this.startYear = startYear;
    }

    public Object getEndYear() {
        return endYear;
    }

    public void setEndYear(Object endYear) {
        this.endYear = endYear;
    }

    public boolean isSerial() {
        return serial;
    }

    public void setSerial(boolean serial) {
        this.serial = serial;
    }

    public boolean isShortFilm() {
        return shortFilm;
    }

    public void setShortFilm(boolean shortFilm) {
        this.shortFilm = shortFilm;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isHasImax() {
        return hasImax;
    }

    public void setHasImax(boolean hasImax) {
        this.hasImax = hasImax;
    }

    public boolean isHas3D() {
        return has3D;
    }

    public void setHas3D(boolean has3D) {
        this.has3D = has3D;
    }

    public String getLastSync() {
        return lastSync;
    }

    public void setLastSync(String lastSync) {
        this.lastSync = lastSync;
    }
}

