package org.example;

import java.util.Comparator;

class Cinema {
    private String genre;
    private double rating;
    private double revenue;
    private String director;
    private String year;

    public Cinema(String genre, double rating, double revenue, String director, String year) {
        this.genre = genre;
        this.rating = rating;
        this.revenue = revenue;
        this.director = director;
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public double getRevenue() {
        return revenue;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "genre='" + genre + '\'' +
                ", rating=" + rating +
                ", revenue=" + revenue +
                ", director='" + director + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    static class GenreComparator implements Comparator<Cinema> {
        public int compare(Cinema c1, Cinema c2) {
            return c1.getGenre().compareTo(c2.getGenre());
        }
    }

    // Comparator for sorting cinemas by year
    static class YearComparator implements Comparator<Cinema> {
        public int compare(Cinema c1, Cinema c2) {
            return c1.getYear().compareTo(c2.getYear());
        }
    }
}
